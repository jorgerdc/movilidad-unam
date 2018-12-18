package mx.unam.fi.tesis.movilidad.web.service;

import java.util.List;

import mx.unam.fi.tesis.movilidad.web.model.Estacion;

/**
 * Definici�n de las funciones para el servicio de estaciones.
 */
public interface EstacionService {
	/**
	 * Servicio para obtener el n�mero total de estaciones registradas.
	 * @return
	 */
	int obtenTotalEstaciones();

	/**
	 * Servicio para obtener los datos de las estaciones registradas.
	 * @return
	 */
	public List<Estacion> listadoEstaciones();

	int guardarEstacion(Estacion estacion);
}
