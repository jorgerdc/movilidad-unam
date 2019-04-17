package mx.unam.fi.tesis.movilidad.dao;

import java.util.List;

import mx.unam.fi.tesis.movilidad.web.model.Usuario;

/**
 * Declaración de las funciones para las estaciones
 */
public interface UsuarioDAO {

  /**
   * Se obtienen a los usuarios registrados.
   * @param usuario Contiene filtros de búsqueda.
   * @return
   */
  List<Usuario> getListado(Usuario usuario);

  /**
   * Función para guardar al usuario
   * @param usuario Información del usuario a guardar.
   */
  void guardarUsuario(Usuario usuario);

  /**
   * Función que obtiene la información de un usuario.
   * @param id identificador del usuario
   * @return
   */
  Usuario getUsuario(int id);
}
