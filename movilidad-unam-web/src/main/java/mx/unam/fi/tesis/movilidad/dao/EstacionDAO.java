package mx.unam.fi.tesis.movilidad.dao;

import java.util.List;

import mx.unam.fi.tesis.movilidad.web.model.Estacion;
import mx.unam.fi.tesis.movilidad.web.model.Ruta;

/**
 * Declaración de las funciones para las estaciones
 */
public interface EstacionDAO {

  /**
   * Se obtienen datos de las estaciones registradas.
   * @return
   */
  List<Estacion> getListado();

  /**
   * Función para guardar una estación.
   * @param estacion Información de la estación a guardar.
   */
  void guardarEstacion(Estacion estacion);

  /**
   * Función que verifica si hay rutas cercas de la estación a guardar.
   * @param estacion coordenadas de la estación
   * @return Lista de rutas cercanas
   */
  List<Ruta> verificarRuta(Estacion estacion);

  /**
   * Función que obtiene las estaciones pertenecientes a una ruta.
   * @param ruta
   * @return
   */
  List<Estacion> getEstacionesRuta(Ruta ruta);

  /**
   * Función que obtiene las estaciones cercanas a una ubicación
   * @param estacion
   * @return
   */
  List<Estacion> getEstacionesCercanas(Estacion estacion);
}
