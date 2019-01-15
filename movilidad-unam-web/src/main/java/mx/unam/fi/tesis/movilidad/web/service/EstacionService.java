package mx.unam.fi.tesis.movilidad.web.service;

import java.util.List;

import mx.unam.fi.tesis.movilidad.web.model.Estacion;

/**
 * Definición de las funciones para el servicio de estaciones.
 */
public interface EstacionService {

	/**
	 * Servicio para obtener los datos de las estaciones registradas.
	 * @return
	 */
	public List<Estacion> listadoEstaciones();

	/**
	 * Servicio para guardar una estacion
	 * @param estacion
	 */
	void guardarEstacion(Estacion estacion);
}
