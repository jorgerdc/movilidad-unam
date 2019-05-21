package mx.unam.fi.tesis.movilidad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.postgis.Point;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import mx.unam.fi.tesis.movilidad.web.model.Ruta;

/**
 * Definición de las funciones para las rutas
 */
@Repository("rutaDAO")
public class RutaDaoImpl extends GenericJdbcDAO implements RutaDAO {

  StringBuilder sb;
  private static final String insert_ruta_sql =
    "INSERT INTO ruta(ruta_nombre,geo) VALUES (?,ST_GeomFromText(?))";
  private static final String get_listado_rutas_sql =
    "SELECT ruta_id,ruta_nombre FROM ruta WHERE ruta_id != 14 ORDER BY ruta_id";
  private static final String get_ruta_sql =
    "SELECT ST_asText(geo) as geometria FROM ruta WHERE ruta_id = ?";

  @Override
  public void guardarRuta(Ruta ruta) {
    Point[] puntosLinea = ruta.getGeo();
    double coordenadas = Math.ceil(puntosLinea.length / 2 + puntosLinea.length % 2);
    List<String> condiciones;
    condiciones = new ArrayList<>();
    int size;
    int regActualizados;

    for (int i = 0; i < coordenadas; i++) {
      condiciones.add(puntosLinea[i].getValue().replaceAll("[()]", ""));
    }

    size = condiciones.size();
    sb = new StringBuilder("LINESTRING(");
    for (int i = 0; i < size; i++) {
      sb.append(condiciones.get(i));
      if (i < size - 1) {
        sb.append(",");
      }
    }
    sb.append(")");

    regActualizados =
      getJdbcTemplate().update(insert_ruta_sql, ruta.getRutaNombre(), sb.toString());

    checkRowUpdated(1, regActualizados);

  }

  @Override
  public List<Ruta> getListadoRutas() {
    List<Ruta> listRuta =
      getJdbcTemplate().query(get_listado_rutas_sql, new RowMapper<Ruta>() {
        @Override
        public Ruta mapRow(ResultSet rs, int rowNum) throws SQLException {
          Ruta ruta = new Ruta();
          ruta.setRutaId(rs.getLong("ruta_id"));
          ruta.setRutaNombre(rs.getString("ruta_nombre"));
          return ruta;
        }
      });
    return listRuta;
  }

  @Override
  public String getRuta(Long rutaId) {
    Ruta ruta = getJdbcTemplate().queryForObject(get_ruta_sql, new Object[] { rutaId },
      new RowMapper<Ruta>() {
        @Override
        public Ruta mapRow(ResultSet rs, int rowNum) throws SQLException {
          Ruta ruta = new Ruta();
          ruta.setGeometria(rs.getString("geometria"));
          return ruta;
        }
      });
    return ruta.getGeometria();
  }

}
