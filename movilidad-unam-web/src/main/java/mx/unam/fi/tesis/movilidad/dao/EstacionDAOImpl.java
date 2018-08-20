package mx.unam.fi.tesis.movilidad.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * Definición de las funciones para las estaciones y que obtendran información
 * de la BD.
 */
@Repository("estacionDAO")
public class EstacionDAOImpl extends GenericJdbcDAO implements EstacionDAO {

	private static final Logger log = LoggerFactory.getLogger(EstacionDAOImpl.class);

	private static final String get_count_estacion_sql = "SELECT count(*) FROM estacion";

	@Override
	public int obtenTotalEstaciones() {
		// Auto-generated method stub
		int numEstaciones =
			getJdbcTemplate().queryForObject(get_count_estacion_sql, Integer.class);
		return numEstaciones;
	}

}
