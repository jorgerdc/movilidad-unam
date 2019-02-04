package mx.unam.fi.tesis.movilidad.web.service;

import java.util.List;

import mx.unam.fi.tesis.movilidad.web.model.Usuario;

/**
 * Definici�n de las funciones para el servicio de estaciones.
 */
public interface UsuarioService {

	/**
	 * Servicio para obtener a los usuarios registrados
	 * @param usuario Cuando se trata de una busqueda, contiene la informaci�n a buscar.
	 * @return
	 */
	List<Usuario> listadoUsuarios(Usuario usuario);

	/**
	 * Servicio para guardar un usuario
	 * @param usuario Contiene la informaci�n del formulario.
	 */
	void guardarUsuario(Usuario usuario);

	/**
	 * Servicio que obtiene la informaci�n de un usuario.
	 * @param id identificador del usuario.
	 * @return
	 */
	Usuario getUsuario(int id);
}
