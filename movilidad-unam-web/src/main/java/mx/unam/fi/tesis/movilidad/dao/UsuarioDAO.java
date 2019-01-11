package mx.unam.fi.tesis.movilidad.dao;

import java.util.List;

import mx.unam.fi.tesis.movilidad.web.model.Usuario;

/**
 * Declaración de las funciones para las estaciones
 */
public interface UsuarioDAO {

	/**
	 * Se obtiene el número total de usuarios.
	 * @return
	 */
	int obtenTotalUsuarios();

	/**
	 * Se obtienen a los usuarios registrados.
	 * @return
	 */
	List<Usuario> getListado();
}
