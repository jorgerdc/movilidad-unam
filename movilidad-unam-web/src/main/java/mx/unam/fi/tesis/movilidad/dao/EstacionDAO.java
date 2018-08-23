package mx.unam.fi.tesis.movilidad.dao;

import java.util.List;

import mx.unam.fi.tesis.movilidad.web.model.Estacion;

/**
 * Declaración de las funciones para las estaciones
 */
public interface EstacionDAO {

	/**
	 * Se obtiene el numero total de estaciones registradas.
	 * @return
	 */
	int obtenTotalEstaciones();

	/**
	 * Se obtienen datos de las estaciones registradas.
	 * @return
	 */
	public List<Estacion> getListado();

}
