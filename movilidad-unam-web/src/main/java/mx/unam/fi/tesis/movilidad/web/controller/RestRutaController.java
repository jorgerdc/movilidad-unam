package mx.unam.fi.tesis.movilidad.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.unam.fi.tesis.movilidad.web.model.Mensaje;
import mx.unam.fi.tesis.movilidad.web.model.Ruta;
import mx.unam.fi.tesis.movilidad.web.service.RutaService;

@RestController
@RequestMapping("/RestRuta/")
public class RestRutaController extends GenericController {

  @Resource
  private RutaService rutaService;

  /**
   * Método para guardar la geometria y nombre de la ruta
   * @param ruta información que se almacenara en la BD.
   * @return Mensaje de guardado con exito.
   */
  @RequestMapping(value = "guardar", method = RequestMethod.POST)
  public Mensaje guardar(@RequestBody Ruta ruta) {
    rutaService.guardarRuta(ruta);
    Mensaje respuesta;
    respuesta = generarMensaje("true", "Correcto!",
      "La ruta se ha guardado correctamente.", "success");
    return respuesta;
  }

  /**
   * Método que obtiene las rutas que seran mostradas en la aplicación
   * @return listado de rutas
   */
  @CrossOrigin(origins = "*")
  @RequestMapping(value = "getListadoRutas", method = RequestMethod.POST)
  public List<Ruta> getListadoRutas() {
    return rutaService.getListadoRutas();
  }

  /**
   * Método que obtiene la geometría de una ruta para la aplicación
   * @return geometría
   */
  @CrossOrigin(origins = "*")
  @RequestMapping(value = "getRuta", method = RequestMethod.POST)
  public ArrayList<String> getRuta(@RequestBody Ruta ruta) {
    ArrayList<String> rutaGeo = new ArrayList<String>();
    rutaGeo.add(rutaService.getRuta(ruta.getRutaId()));
    return rutaGeo;
  }

}
