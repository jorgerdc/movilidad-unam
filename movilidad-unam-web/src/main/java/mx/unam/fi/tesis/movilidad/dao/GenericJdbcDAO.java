package mx.unam.fi.tesis.movilidad.dao;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Clase general que permite la inicialización del JDBC
 */
public abstract class GenericJdbcDAO extends JdbcDaoSupport {

	@Resource(name = "dataSource")
	private void setDS(DataSource ds) {
		this.setDataSource(ds);
	}

	/**
	 * Función que verifica si se realizó correctamente la interaccion con la BD.
	 * @param expected
	 * @param actual
	 */
	protected final void checkRowUpdated(int expected, int actual) {

		if (expected != actual) {
			throw new IncorrectResultSizeDataAccessException(expected, actual);
		}
		return;

	}
}
