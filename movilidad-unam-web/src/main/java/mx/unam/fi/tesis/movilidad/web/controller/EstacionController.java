package mx.unam.fi.tesis.movilidad.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mx.unam.fi.tesis.movilidad.web.model.Estacion;
import mx.unam.fi.tesis.movilidad.web.service.EstacionService;

/**
 * Clase que permite el manejo de los datos para las estaciones.
 */
@Controller
@RequestMapping("/estacion/")
public class EstacionController {
  private static final Logger log = LoggerFactory.getLogger(EstacionController.class);
  private static final String vista_estacion_agregar = "estacion/agregar";
  private static final String vista_estacion_listar = "estacion/listar";

  @Resource
  private EstacionService estacionService;

  /**
   * Método que permite agregar una estación.
   * @return
   */
  @RequestMapping(value = "agregar", method = RequestMethod.GET)
  public String agregar(ModelMap map) {
    return vista_estacion_agregar;
  }

  /**
   * Método que obtiene el listado de las estaciones.
   * @return
   */
  @RequestMapping(value = "listar", method = RequestMethod.GET)
  public String listar(ModelMap map) {
    List<Estacion> estaciones = estacionService.listadoEstaciones();
    int totalEstaciones = estaciones.size();
    map.addAttribute("totalEstaciones", totalEstaciones);
    map.addAttribute("estaciones", estaciones);
    return vista_estacion_listar;
  }
}
