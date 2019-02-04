package mx.unam.fi.tesis.movilidad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import mx.unam.fi.tesis.movilidad.web.model.Usuario;

/**
 * Definición de las funciones para las estaciones y que obtendran información
 * de la BD.
 */
@Repository("usuarioDAO")
public class UsuarioDAOImpl extends GenericJdbcDAO implements UsuarioDAO {
	private static final String get_listado_usuario_sql = "SELECT usuario_id,";

	private static final String insert_usuario_sql = "INSERT INTO usuario(";

	private static final String get_busqueda_usuario_sql = "SELECT usuario_id,";

	private static final String get_usuario_sql = "SELECT usuario_id,";

	private static final String update_usuario_sql =
		"UPDATE usuario SET usu_nombre=?, usu_primer_apellido=?,usu_segundo_apellido=?,usu_correo=?";

	private static final String queryNombre = " usu_nombre like :usuNombre ";

	private static final String queryUsuPriAp =
		" usu_primer_apellido like :usuPrimerApellido ";

	private static final String queryUsuSegAp =
		" usu_segundo_apellido like :usuSegundoApellido";

	private static final String queryUsuCorreo = " usu_correo like :usuCorreo";

	private static final String queryAnd = " and ";

	private static final String queryFrom = "FROM usuario";

	private static final String camposUsuario =
		"usu_nombre,usu_primer_apellido,usu_segundo_apellido,usu_correo ";

	private static final String campoContrasena = "usu_contrasena";

	private static final String valuesInsert = " VALUES(?,?,?,?,?)";

	private static final String condicionUsuarioId = " usuario_id = ?";

	private static final String orderUsuarioId = " ORDER BY usuario_id ASC";

	private static final String queryWhere = " WHERE";

	@Override
	public List<Usuario> getListado(Usuario usuario) {

		List<String> condiciones;
		StringBuilder sb;
		List<Usuario> usuarioList = null;
		MapSqlParameterSource params = new MapSqlParameterSource();
		int size;

		condiciones = new ArrayList<>();
		if (usuario.getUsuNombre() != null) {
			condiciones.add(queryNombre);
			params.addValue("usuNombre", "%" + usuario.getUsuNombre() + "%");
		}
		if (usuario.getUsuPrimerApellido() != null) {
			condiciones.add(queryUsuPriAp);
			params.addValue("usuPrimerApellido", "%" + usuario.getUsuPrimerApellido() + "%");
		}

		if (usuario.getUsuSegundoApellido() != null) {
			condiciones.add(queryUsuSegAp);
			params.addValue("usuSegundoApellido",
				"%" + usuario.getUsuSegundoApellido() + "%");
		}

		if (usuario.getUsuCorreo() != null) {
			condiciones.add(queryUsuCorreo);
			params.addValue("usuCorreo", "%" + usuario.getUsuCorreo() + "%");
		}

		size = condiciones.size();
		if (size > 0) {
			sb = new StringBuilder(
				get_busqueda_usuario_sql + camposUsuario + queryFrom + queryWhere);
			for (int i = 0; i < size; i++) {
				sb.append(condiciones.get(i));
				if (i < size - 1) {
					sb.append(queryAnd);
				}
			}
			usuarioList = this.namedParameterJdbcTemplate.query(sb.toString(), params,
				new UsuarioRowMapper());
		} else {
			sb = new StringBuilder(
				get_listado_usuario_sql + camposUsuario + queryFrom + orderUsuarioId);
			usuarioList =
				this.namedParameterJdbcTemplate.query(sb.toString(), new UsuarioRowMapper());
		}
		return usuarioList;
	}

	private final class UsuarioRowMapper implements RowMapper<Usuario> {
		@Override
		public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
			Usuario usuario = new Usuario();
			int index = 0;
			usuario.setUsuarioId(rs.getLong(++index));
			usuario.setUsuNombre(rs.getString(++index));
			usuario.setUsuPrimerApellido(rs.getString(++index));
			usuario.setUsuSegundoApellido(rs.getString(++index));
			usuario.setUsuCorreo(rs.getString(++index));
			return usuario;
		}

	}

	@Override
	public void guardarUsuario(Usuario usuario) {
		int regActualizados;
		String query;
		if (usuario.getUsuarioId() != null) {
			query = update_usuario_sql + queryWhere + condicionUsuarioId;
			regActualizados = getJdbcTemplate().update(query, usuario.getUsuNombre(),
				usuario.getUsuPrimerApellido(), usuario.getUsuSegundoApellido(),
				usuario.getUsuCorreo(), usuario.getUsuarioId());

		} else {
			query = insert_usuario_sql + camposUsuario + "," + campoContrasena + ")"
				+ valuesInsert;
			regActualizados = getJdbcTemplate().update(query, usuario.getUsuNombre(),
				usuario.getUsuPrimerApellido(), usuario.getUsuSegundoApellido(),
				usuario.getUsuCorreo(), usuario.getUsuContrasena());
		}
		checkRowUpdated(1, regActualizados);
	}

	@Override
	public Usuario getUsuario(int id) {
		String query =
			get_usuario_sql + camposUsuario + queryFrom + queryWhere + condicionUsuarioId;
		Usuario usuario = getJdbcTemplate().queryForObject(query, new Object[] { id },
			new UsuarioRowMapper());
		return usuario;
	}

}