package mx.unam.fi.tesis.movilidad.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import mx.unam.fi.tesis.movilidad.web.model.Estacion;
import mx.unam.fi.tesis.movilidad.web.model.Ruta;

/**
 * Definición de las funciones para las estaciones y que obtendran información
 * de la BD.
 */
@Repository("estacionDAO")
public class EstacionDAOImpl extends GenericJdbcDAO implements EstacionDAO {

  private static final Logger log = LoggerFactory.getLogger(EstacionDAOImpl.class);
  private static final String get_listado_estacion_sql =
    "SELECT nombre, estacion_id FROM estacion";
  private static final String insert_estacion_sql =
    "INSERT INTO estacion (nombre,geo) VALUES(?,ST_GeomFromText(?))";
  private static final String verifica_estacion_ruta =
    "SELECT q1.ruta_id,q1.ruta_nombre FROM (SELECT ruta_id, ruta_nombre, "
      + "st_intersects(geo,ST_Buffer(ST_GeomFromText(?),0.002)) "
      + "as interseccion from ruta) q1 where interseccion = true";
  private static final String insert_estacion_ruta_sql =
    "INSERT INTO estacion_ruta(estacion_id,ruta_id) VALUES(?,?)";
  private static final String get_estaciones_ruta_sql =
    "SELECT e.estacion_id,nombre,ST_X(geo),ST_Y(geo) FROM estacion e JOIN "
      + "estacion_ruta er on er.estacion_id = e.estacion_id where er.ruta_id = ?";

  @Override
  public List<Estacion> getListado() {
    List<Estacion> listEstaciones =
      getJdbcTemplate().query(get_listado_estacion_sql, new RowMapper<Estacion>() {
        @Override
        public Estacion mapRow(ResultSet rs, int rowNum) throws SQLException {
          Estacion estacion = new Estacion();
          estacion.setNombre(rs.getString(1));
          estacion.setEstacionId(rs.getLong(2));
          return estacion;
        }
      });
    return listEstaciones;
  }

  @Override
  public void guardarEstacion(Estacion estacion) {
    KeyHolder keyHolder = new GeneratedKeyHolder();
    int regActualizados = getJdbcTemplate().update(new PreparedStatementCreator() {
      @Override
      public PreparedStatement createPreparedStatement(Connection connection)
        throws SQLException {
        PreparedStatement ps = connection.prepareStatement(insert_estacion_sql,
          new String[] { "estacion_id" });
        ps.setString(1, estacion.getNombre());
        ps.setString(2, estacion.getGeo().toString());
        return ps;
      }
    }, keyHolder

    );
    guardarEstacionRuta(keyHolder.getKey().intValue(), estacion.getEstacionRuta());
    checkRowUpdated(1, regActualizados);
  }

  @Override
  public List<Ruta> verificarRuta(Estacion estacion) {

    List<Ruta> listRuta = getJdbcTemplate().query(verifica_estacion_ruta,
      new Object[] { estacion.getGeo() }, new RowMapper<Ruta>() {
        @Override
        public Ruta mapRow(ResultSet rs, int rowNum) throws SQLException {
          Ruta ruta = new Ruta();
          ruta.setRutaId(rs.getLong(1));
          ruta.setRutaNombre(rs.getString(2));
          return ruta;
        }
      });

    return listRuta;
  }

  /**
   * Función que guarda en la tabla estacion_ruta
   * @param estacionId identificador de la estación que fue guardada.
   * @param rutaId rutas a las que fue asociada la estación
   */
  public void guardarEstacionRuta(int estacionId, int[] rutaId) {
    getJdbcTemplate().batchUpdate(insert_estacion_ruta_sql,
      new BatchPreparedStatementSetter() {
        @Override
        public void setValues(PreparedStatement ps, int i) throws SQLException {
          ps.setLong(1, estacionId);
          ps.setLong(2, rutaId[i]);
        }

        @Override
        public int getBatchSize() {
          return rutaId.length;
        }
      });
  }

  @Override
  public List<Estacion> getEstacionesRuta(Ruta ruta) {

    List<Estacion> listEstaciones = getJdbcTemplate().query(get_estaciones_ruta_sql,
      new Object[] { ruta.getRutaId() }, new RowMapper<Estacion>() {
        @Override
        public Estacion mapRow(ResultSet rs, int rowNum) throws SQLException {
          Estacion estacion = new Estacion();
          double[] coords = new double[2];
          estacion.setEstacionId(rs.getLong(1));
          estacion.setNombre(rs.getString(2));
          coords[0] = rs.getDouble("st_x");
          coords[1] = rs.getDouble("st_y");
          estacion.setX(coords[0]);
          estacion.setY(coords[1]);
          return estacion;
        }
      });
    return listEstaciones;
  }

}
