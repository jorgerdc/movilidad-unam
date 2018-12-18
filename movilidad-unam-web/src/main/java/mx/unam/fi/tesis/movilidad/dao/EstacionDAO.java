package mx.unam.fi.tesis.movilidad.dao;

import java.util.List;

import mx.unam.fi.tesis.movilidad.web.model.Estacion;

/**
 * Declaración de las funciones para las estaciones
 */
public interface EstacionDAO {

	/**
	 * Se obtiene el número total de estaciones registradas.
	 * @return
	 */
	int obtenTotalEstaciones();

	/**
	 * Se obtienen datos de las estaciones registradas.
	 * @return
	 */
	List<Estacion> getListado();

	/**
	 * Función para guardar una estación.
	 * @param estacion
	 * @return
	 */
	int guardarEstacion(Estacion estacion);

}
