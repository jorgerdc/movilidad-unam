package mx.unam.fi.tesis.movilidad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import mx.unam.fi.tesis.movilidad.web.model.Usuario;

/**
 * Definición de las funciones para las estaciones y que obtendran información
 * de la BD.
 */
@Repository("usuarioDAO")
public class UsuarioDAOImpl extends GenericJdbcDAO implements UsuarioDAO {
	private static final String get_listado_usuario_sql =
		"SELECT usuario_id,usu_nombre,usu_primer_apellido,usu_segundo_apellido,usu_correo FROM usuario";

	@Override
	public List<Usuario> getListado() {

		List<Usuario> listUsuarios =
			getJdbcTemplate().query(get_listado_usuario_sql, new RowMapper<Usuario>() {
				@Override
				public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
					Usuario usuario = new Usuario();
					usuario.setUsuarioId(rs.getLong(1));
					usuario.setUsuNombre(rs.getString(2));
					usuario.setUsuPrimerApellido(rs.getString(3));
					usuario.setUsuSegundoApellido(rs.getString(4));
					usuario.setUsuCorreo(rs.getString(5));
					return usuario;
				}
			});
		return listUsuarios;
	}

}