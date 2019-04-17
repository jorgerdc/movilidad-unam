package mx.unam.fi.tesis.movilidad.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Clase que permite el manejo de las rutas de los pumab�s.
 */
@Controller
@RequestMapping(value = "/ruta/")
public class RutaController {
  private static final Logger log = LoggerFactory.getLogger(RutaController.class);
  private static final String vista_ruta_agregar = "ruta/agregar";
  private static final String vista_ruta_listar = "ruta/listar";

  /**
   * M�todo que permite agregar una ruta(linea) del pumab�s.
   * @return
   */
  @RequestMapping(value = "agregar", method = RequestMethod.GET)
  public static String agregar() {
    return vista_ruta_agregar;
  }

  /**
   * M�todo que obtiene el listado de las rutas para los pumab�s.
   * @return
   */
  @RequestMapping(value = "listar", method = RequestMethod.GET)
  public static String listar() {
    return vista_ruta_listar;
  }
}
