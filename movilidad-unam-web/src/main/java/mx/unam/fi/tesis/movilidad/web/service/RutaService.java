package mx.unam.fi.tesis.movilidad.web.service;

import mx.unam.fi.tesis.movilidad.web.model.Ruta;

/**
 * Definicion de las funciones para el servicio de rutas.
 */
public interface RutaService {

	/**
	 * Servicio para guardar una ruta
	 * @param ruta Contiene la información del formulario.
	 */
	void guardarRuta(Ruta ruta);

}
