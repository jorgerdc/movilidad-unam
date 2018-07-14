package mx.unam.fi.tesis.movilidad.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * TODO Clase que permite el manejo de las rutas de los pumabús.
 */
@Controller
@RequestMapping(value = "/ruta/")
public class RutaController {

	/**
	 * TODO Método que permite agregar una ruta(linea) del pumabús.
	 * @return
	 */
	@RequestMapping(value = "agregar", method = RequestMethod.GET)
	public static String agregar() {
		return "ruta/agregar";
	}

	/**
	 * TODO Método que obtiene el listado de las rutas para los pumabús.
	 * @return
	 */
	@RequestMapping(value = "listar", method = RequestMethod.GET)
	public static String listar() {
		return "ruta/listar";
	}
}
