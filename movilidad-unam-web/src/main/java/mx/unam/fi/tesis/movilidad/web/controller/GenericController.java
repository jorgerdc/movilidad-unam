package mx.unam.fi.tesis.movilidad.web.controller;

import mx.unam.fi.tesis.movilidad.web.model.Mensaje;

/**
 * Clase para funciones que utilizaran todos los controladores.
 */
public class GenericController {

	/**
	 * Funci�n para generar el mensaje que sera mostrado al usuario.
	 * @param estado true si se realiz� la acci�n de manera correcta.
	 * @param titulo titulo de la notificaci�n.
	 * @param mensaje contenido de la notificaci�n.
	 * @param tipo tipo de la notificaci�n que sera mostrada.
	 * @return
	 */
	public Mensaje generarMensaje(String estado, String titulo, String mensaje,
		String tipo) {
		Mensaje msj = new Mensaje();
		msj.setEstado(estado);
		msj.setTitulo(titulo);
		msj.setMensaje(mensaje);
		msj.setTipo(tipo);
		return msj;

	}

}
