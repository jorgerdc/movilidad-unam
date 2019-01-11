package mx.unam.fi.tesis.movilidad.web.service;

import java.util.List;

import mx.unam.fi.tesis.movilidad.web.model.Usuario;

/**
 * Definición de las funciones para el servicio de estaciones.
 */
public interface UsuarioService {

	/**
	 * Servicio para obtener el total de usuarios registrados
	 * @return
	 */
	int obtenTotalUsuarios();

	/**
	 * Servicio para obtener a los usuarios registrados
	 * @return
	 */
	List<Usuario> listadoUsuarios();
}
