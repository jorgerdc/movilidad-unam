package mx.unam.fi.tesis.movilidad.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * TODO Definición de las funciones para las estaciones y que obtendran información
 * de la BD.
 */
@Repository("estacionDAO")
public class EstacionDAOImpl extends GenericJdbcDAO implements EstacionDAO {

	private static final Logger log = LoggerFactory.getLogger(EstacionDAOImpl.class);

	@Override
	public Integer listarEstaciones() {
		log.debug("\nDAO");
		// TODO Auto-generated method stub
		int valor =
			getJdbcTemplate().queryForObject("SELECT count(*) FROM estacion", Integer.class);
		return 25;
	}

}
