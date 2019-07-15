package mx.unam.fi.tesis.movilidad.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
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
   * M�todo que guarda la estaci�n.
   * @param estacion objeto de tipo estacion.
   * @return
   */
  @RequestMapping(value = "guardar", method = RequestMethod.POST)
  public Mensaje guardar(@RequestBody Estacion estacion) {
    estacionService.guardarEstacion(estacion);
    Mensaje respuesta;
    respuesta = generarMensaje("true", "Correcto!",
      "La estaci�n se ha guardado correctamente.", "success");
    return respuesta;
  }

  /**
   * M�todo que verifica si hay rutas cercanas a la estaci�n.
   * @param estacion
   * @return
   */
  @RequestMapping(value = "verificarRuta", method = RequestMethod.POST)
  public List<Ruta> verificarRuta(@RequestBody Estacion estacion) {
    List<Ruta> ruta = estacionService.verificarRuta(estacion);
    return ruta;
  }

  /**
   * M�todo que obtiene las estaciones de una ruta.
   * @param ruta
   * @return
   */
  @CrossOrigin(origins = "*")
  @RequestMapping(value = "getEstacionRuta", method = RequestMethod.POST)
  public List<Estacion> restGetUsuario(@RequestBody Ruta ruta) {
    List<Estacion> estacionesRuta = estacionService.getEstacionesRuta(ruta);
    return estacionesRuta;
  }

  /**
   * M�todo que obtiene las estaciones cercanas dada una ubicaci�n
   * @param estacion
   * @return
   */
  @CrossOrigin(origins = "*")
  @RequestMapping(value = "getEstacionesCercanas", method = RequestMethod.POST)
  public List<Estacion> getEstacionesCercanas(@RequestBody Estacion estacion) {
    List<Estacion> estaciones = estacionService.getEstacionesCercanas(estacion);
    return estaciones;
  }

}
