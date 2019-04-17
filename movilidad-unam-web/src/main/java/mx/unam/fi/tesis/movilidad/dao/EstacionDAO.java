package mx.unam.fi.tesis.movilidad.dao;

import java.util.List;

import mx.unam.fi.tesis.movilidad.web.model.Estacion;

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

}
