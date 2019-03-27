package mx.unam.fi.tesis.movilidad.dao;

import mx.unam.fi.tesis.movilidad.web.model.Ruta;

/**
 * Definición de las funciones que interactuan con la BD.
 */
public interface RutaDAO {

	/**
	 * Función para guardar una ruta.
	 * @param ruta Información de la ruta a guardar.
	 */
	void guardarRuta(Ruta ruta);

}
