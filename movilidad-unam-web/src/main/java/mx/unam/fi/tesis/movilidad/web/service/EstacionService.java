package mx.unam.fi.tesis.movilidad.web.service;

import java.util.List;

import mx.unam.fi.tesis.movilidad.web.model.Estacion;
import mx.unam.fi.tesis.movilidad.web.model.Ruta;

/**
 * Definici�n de las funciones para el servicio de estaciones.
 */
public interface EstacionService {

  /**
   * Servicio para obtener los datos de las estaciones registradas.
   * @return
   */
  public List<Estacion> listadoEstaciones();

  /**
   * Servicio para guardar una estacion
   * @param estacion Informaci�n de la estaci�n introducida en el formulario.
   */
  void guardarEstacion(Estacion estacion);

  /**
   * Servicio para verificar las rutas cercanas a una estaci�n
   * @param estacion
   * @return
   */
  List<Ruta> verificarRuta(Estacion estacion);

  /**
   * Servicio para obtener las estaciones de una ruta.
   * @param ruta
   * @return
   */
  List<Estacion> getEstacionesRuta(Ruta ruta);

  /**
   * Servicio para obtener las estaciones cercanas a una ubicaci�n.
   * @param estacion
   * @return
   */
  List<Estacion> getEstacionesCercanas(Estacion estacion);
}
