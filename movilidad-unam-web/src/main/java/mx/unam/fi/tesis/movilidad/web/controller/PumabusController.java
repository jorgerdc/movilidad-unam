package mx.unam.fi.tesis.movilidad.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Clase que permite el manejo de los datos para las unidades del pumabus.
 */
@Controller
@RequestMapping(value = "/pumabus/")
public class PumabusController {

	/**
	 * Método que permite agregar un autobús del pumabus.
	 * @return
	 */
	@RequestMapping(value = "agregar", method = RequestMethod.GET)
	public static String agregar() {
		return "pumabus/agregar";
	}

	/**
	 * Método que obtiene el listado de los autobuses para el pumabus.
	 * @return
	 */
	@RequestMapping(value = "listar", method = RequestMethod.GET)
	public static String listar() {
		return "pumabus/listar";
	}

}
