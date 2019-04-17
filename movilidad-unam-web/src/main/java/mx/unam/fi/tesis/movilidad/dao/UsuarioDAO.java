package mx.unam.fi.tesis.movilidad.dao;

import java.util.List;

import mx.unam.fi.tesis.movilidad.web.model.Usuario;

/**
 * Declaraci�n de las funciones para las estaciones
 */
public interface UsuarioDAO {

  /**
   * Se obtienen a los usuarios registrados.
   * @param usuario Contiene filtros de b�squeda.
   * @return
   */
  List<Usuario> getListado(Usuario usuario);

  /**
   * Funci�n para guardar al usuario
   * @param usuario Informaci�n del usuario a guardar.
   */
  void guardarUsuario(Usuario usuario);

  /**
   * Funci�n que obtiene la informaci�n de un usuario.
   * @param id identificador del usuario
   * @return
   */
  Usuario getUsuario(int id);
}
