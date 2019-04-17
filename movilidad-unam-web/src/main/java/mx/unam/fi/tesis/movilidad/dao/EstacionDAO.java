package mx.unam.fi.tesis.movilidad.dao;

import java.util.List;

import mx.unam.fi.tesis.movilidad.web.model.Estacion;

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

}
