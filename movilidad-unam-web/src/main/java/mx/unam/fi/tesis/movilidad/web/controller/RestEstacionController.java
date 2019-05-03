package mx.unam.fi.tesis.movilidad.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.unam.fi.tesis.movilidad.web.model.Estacion;
import mx.unam.fi.tesis.movilidad.web.model.Mensaje;
import mx.unam.fi.tesis.movilidad.web.model.Ruta;
import mx.unam.fi.tesis.movilidad.web.service.EstacionService;

@RestController
@RequestMapping("/RestEstacion/")
public class RestEstacionController extends GenericController {
  private static final Logger log = LoggerFactory.getLogger(RestEstacionController.class);
  @Resource
  private EstacionService estacionService;

  /**
   * Método que guarda la estación.
   * @param estacion objeto de tipo estacion.
   * @return
   */
  @RequestMapping(value = "guardar", method = RequestMethod.POST)
  public Mensaje guardar(@RequestBody Estacion estacion) {
    estacionService.guardarEstacion(estacion);
    Mensaje respuesta;
    respuesta = generarMensaje("true", "Correcto!",
      "La estación se ha guardado correctamente.", "success");
    return respuesta;
  }

  /**
   * Método que verifica si hay rutas cercanas a la estación.
   * @param estacion
   * @return
   */
  @RequestMapping(value = "verificarRuta", method = RequestMethod.POST)
  public List<Ruta> verificarRuta(@RequestBody Estacion estacion) {
    List<Ruta> ruta = estacionService.verificarRuta(estacion);
    return ruta;
  }
}
