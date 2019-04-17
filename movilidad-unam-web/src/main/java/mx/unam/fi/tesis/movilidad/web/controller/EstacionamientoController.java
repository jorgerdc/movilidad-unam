package mx.unam.fi.tesis.movilidad.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Clase que permite el manejo de los datos para los estacionamientos.
 */
@Controller
@RequestMapping(value = "/estacionamiento/")
public class EstacionamientoController {

  /**
   * M�todo que permite agregar un estacionamiento.
   * @return
   */
  @RequestMapping(value = "agregar", method = RequestMethod.GET)
  public static String agregar() {
    return "estacionamiento/agregar";
  }

  /**
   * M�todo que obtiene el listado de los estacionamientos.
   * @return
   */
  @RequestMapping(value = "listar", method = RequestMethod.GET)
  public static String listar() {
    return "estacionamiento/listar";
  }
}
