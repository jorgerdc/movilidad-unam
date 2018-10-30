package mx.unam.fi.tesis.movilidad.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import mx.unam.fi.tesis.movilidad.web.model.Estacion;
import mx.unam.fi.tesis.movilidad.web.service.EstacionService;

/**
 * Clase que permite el manejo de los datos para las estaciones.
 */
@RestController
@RequestMapping("/estacion/")
public class EstacionController {
	private static final Logger log = LoggerFactory.getLogger(EstacionController.class);

	@Resource
	private EstacionService estacionService;

	/**
	 * Método que permite agregar una estación.
	 * @return
	 */
	@RequestMapping(value = "agregar", method = RequestMethod.GET)
	public ModelAndView agregar() {
		ModelAndView model = new ModelAndView("estacion/agregar");
		return model;
	}

	/**
	 * Método que obtiene el listado de las estaciones.
	 * @return
	 */
	@RequestMapping(value = "listar", method = RequestMethod.GET)
	public ModelAndView listar() {
		ModelAndView model = new ModelAndView("estacion/listar");
		Integer totalEStaciones = new Integer(estacionService.obtenTotalEstaciones());
		List<Estacion> estaciones = estacionService.listadoEstaciones();
		model.addObject("totalEstaciones", totalEStaciones);
		model.addObject("estaciones", estaciones);

		return model;
	}

	/**
	 * Método que guarda la estación.
	 * @param estacion
	 * @return
	 */
	@RequestMapping(value = "guardar", method = RequestMethod.POST)
	public String guardar(@RequestBody Estacion estacion) {
		estacionService.guardarEstacion(estacion);
		return "{\"estado\":true,\"mensaje\":\"La estación se ha guardado correctamente.\"}";

	}
}
