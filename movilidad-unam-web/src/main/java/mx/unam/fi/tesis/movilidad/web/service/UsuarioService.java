package mx.unam.fi.tesis.movilidad.web.service;

import java.util.List;

import mx.unam.fi.tesis.movilidad.web.model.Usuario;

/**
 * Definición de las funciones para el servicio de estaciones.
 */
public interface UsuarioService {

	/**
	 * Servicio para obtener a los usuarios registrados
	 * @param usuario
	 * @return
	 */
	List<Usuario> listadoUsuarios(Usuario usuario);

	/**
	 * Servicio para guardar un usuario
	 * @param usuario
	 */
	void guardarUsuario(Usuario usuario);
}
