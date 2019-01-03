package mx.unam.fi.tesis.movilidad.dao;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Clase general que permite la inicializaci�n del JDBC
 */
public abstract class GenericJdbcDAO extends JdbcDaoSupport {

	@Resource(name = "dataSource")
	private void setDS(DataSource ds) {
		this.setDataSource(ds);
	}

	/**
	 * Funci�n que verifica que se realizo correctamente el insert
	 * @param expected
	 * @param actual
	 */
	protected final void verificarInsert(int expected, int actual) {

		if (expected != actual) {
			throw new IncorrectResultSizeDataAccessException(
				"Hubo un error al ejecutar la acci�n.", expected, actual);
		}
		return;

	}
}
