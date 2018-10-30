package mx.unam.fi.tesis.movilidad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.postgis.Point;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import mx.unam.fi.tesis.movilidad.web.model.Estacion;

/**
 * Definición de las funciones para las estaciones y que obtendran información
 * de la BD.
 */
@Repository("estacionDAO")
public class EstacionDAOImpl extends GenericJdbcDAO implements EstacionDAO {

	private static final Logger log = LoggerFactory.getLogger(EstacionDAOImpl.class);

	private static final String get_count_estacion_sql = "SELECT count(*) FROM estacion";
	private static final String get_listado_estacion_sql =
		"SELECT nombre, estacion_id FROM estacion";
	private static final String insert_estacion_sql =
		"INSERT INTO estacion (nombre,geo) VALUES(?,ST_GeomFromText(?))";

	@Override
	public int obtenTotalEstaciones() {
		// Auto-generated method stub
		int numEstaciones =
			getJdbcTemplate().queryForObject(get_count_estacion_sql, Integer.class);
		return numEstaciones;
	}

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
		Point punto = new Point(estacion.getGeo()[0], estacion.getGeo()[1]);
		getJdbcTemplate().update(insert_estacion_sql, estacion.getNombre(),
			punto.toString());
		return;
	}

}
