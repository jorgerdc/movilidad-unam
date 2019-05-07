package mx.unam.fi.tesis.movilidad.web.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.unam.fi.tesis.movilidad.web.model.Mensaje;
import mx.unam.fi.tesis.movilidad.web.model.Usuario;
import mx.unam.fi.tesis.movilidad.web.service.UsuarioService;

@RestController
@RequestMapping("/RestUsuario/")
public class RestUsuarioController extends GenericController {

  @Resource
  private UsuarioService usuarioService;

  /**
   * Función para guardar un usuario en la BD
   * @param usuario
   * @return mensaje a mostrar
   */
  @CrossOrigin(origins = "*")
  @RequestMapping(value = "guardar", method = RequestMethod.POST)
  public Mensaje guardar(@RequestBody Usuario usuario) {
    usuarioService.guardarUsuario(usuario);
    Mensaje respuesta;
    respuesta = generarMensaje("true", "Correcto!",
      "El usuario se ha guardado correctamente.", "success");
    return respuesta;
  }

  /**
   * Función para obtener los datos de un usuario que se quiere auntentificar desde la
   * aplicación móvil
   * @param usuario
   * @return
   */
  @CrossOrigin(origins = "*")
  @RequestMapping(value = "getUsuario", method = RequestMethod.POST)
  public Usuario restGetUsuario(@RequestBody Usuario usuario) {
    Usuario loginUsuario =
      usuarioService.restGetUsuario(usuario.getUsuCorreo(), usuario.getUsuContrasena());
    return loginUsuario;
  }

}
