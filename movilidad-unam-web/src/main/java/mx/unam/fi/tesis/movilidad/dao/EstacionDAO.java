package mx.unam.fi.tesis.movilidad.dao;

import java.util.List;

import mx.unam.fi.tesis.movilidad.web.model.Estacion;
import mx.unam.fi.tesis.movilidad.web.model.Ruta;

/**
 * Declaraci�n de las funciones para las estaciones
 */
public interface EstacionDAO {

  /**
   * Se obtienen datos de las estaciones registradas.
   * @return
   */
  List<Estacion> getListado();

  /**
   * Funci�n para guardar una estaci�n.
   * @param estacion Informaci�n de la estaci�n a guardar.
   */
  void guardarEstacion(Estacion estacion);

  /**
   * Funci�n que verifica si hay rutas cercas de la estaci�n a guardar.
   * @param estacion coordenadas de la estaci�n
   * @return Lista de rutas cercanas
   */
  List<Ruta> verificarRuta(Estacion estacion);

  /**
   * Funci�n que obtiene las estaciones pertenecientes a una ruta.
   * @param ruta
   * @return
   */
  List<Estacion> getEstacionesRuta(Ruta ruta);

  /**
   * Funci�n que obtiene las estaciones cercanas a una ubicaci�n
   * @param estacion
   * @return
   */
  List<Estacion> getEstacionesCercanas(Estacion estacion);
}
