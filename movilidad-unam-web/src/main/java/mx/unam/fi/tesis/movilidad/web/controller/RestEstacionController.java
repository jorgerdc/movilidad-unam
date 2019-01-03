package mx.unam.fi.tesis.movilidad.web.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.unam.fi.tesis.movilidad.web.model.Estacion;
import mx.unam.fi.tesis.movilidad.web.model.Mensaje;
import mx.unam.fi.tesis.movilidad.web.service.EstacionService;

@RestController
@RequestMapping("/RestEstacion/")
public class RestEstacionController extends GenericController {
	@Resource
	private EstacionService estacionService;

	/**
	 * M�todo que guarda la estaci�n.
	 * @param estacion objeto de tipo estacion.
	 * @return
	 */
	@RequestMapping(value = "guardar", method = RequestMethod.POST)
	public Mensaje guardar(@RequestBody Estacion estacion) {
		int guardado = estacionService.guardarEstacion(estacion);
		Mensaje respuesta;
		respuesta = generarMensaje("false", "Error!",
			"Ha ocurrido un error al intentar realizar la acci�n. Vuelva a intentarlo",
			"error");
		if (guardado > 0) {
			respuesta = generarMensaje("true", "Correcto!",
				"La estaci�n se ha guardado correctamente.", "success");
		}
		return respuesta;

	}
}
