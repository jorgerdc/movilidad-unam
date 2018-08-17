package mx.unam.fi.tesis.movilidad.dao;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Clase general que permite la inicialización del JDBC
 */
public abstract class GenericJdbcDAO extends JdbcDaoSupport {

	@Resource(name = "dataSource")
	private void setDS(DataSource ds) {
		this.setDataSource(ds);
	}
}
