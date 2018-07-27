package mx.unam.fi.tesis.movilidad.web.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mx.unam.fi.tesis.movilidad.web.service.EstacionService;

/**
 * TODO Clase que permite el manejo de los datos para las estaciones.
 */
@Controller
@RequestMapping("/estacion/")
public class EstacionController {
	private static final Logger log = LoggerFactory.getLogger(EstacionController.class);

	@Resource
	private EstacionService estacionService;

	/**
	 * TODO Método que permite agregar una estación.
	 * @return
	 */
	@RequestMapping(value = "agregar", method = RequestMethod.GET)
	public String agregar() {
		return "estacion/agregar";
	}

	/**
	 * TODO Método que obtiene el listado de las estaciones.
	 * @return
	 */
	@RequestMapping(value = "listar", method = RequestMethod.GET)
	public String listar(ModelMap modelMapp) {
		Integer a = new Integer(estacionService.listarEstaciones());
		modelMapp.addAttribute("mensaje", a);

		return "estacion/listar";
	}
}
