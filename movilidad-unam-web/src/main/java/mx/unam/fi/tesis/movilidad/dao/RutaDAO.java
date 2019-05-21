package mx.unam.fi.tesis.movilidad.dao;

import java.util.List;

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

  /**
   * Función para obtener las rutas a mostrar en la aplicación
   * @return
   */
  List<Ruta> getListadoRutas();

  /**
   * Función que obtiene la geometria de una ruta.
   * @param rutaId
   * @return
   */
  String getRuta(Long rutaId);

}
