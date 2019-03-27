package mx.unam.fi.tesis.movilidad.dao;

import mx.unam.fi.tesis.movilidad.web.model.Ruta;

/**
 * Definici�n de las funciones que interactuan con la BD.
 */
public interface RutaDAO {

	/**
	 * Funci�n para guardar una ruta.
	 * @param ruta Informaci�n de la ruta a guardar.
	 */
	void guardarRuta(Ruta ruta);

}
