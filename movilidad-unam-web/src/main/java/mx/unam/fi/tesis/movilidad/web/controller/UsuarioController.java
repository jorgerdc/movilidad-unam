package mx.unam.fi.tesis.movilidad.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * TODO Clase que permite el manejo de los datos para los usuarios.
 */
@Controller
@RequestMapping(value = "/usuario/")
public class UsuarioController {

	/**
	 * TODO Método que permite agregar un usuario
	 * @return
	 */
	@RequestMapping(value = "agregar", method = RequestMethod.GET)
	public static String agregar() {
		return "usuario/agregar";
	}

	/**
	 * TODO Método que obtiene el listado de los usuarios.
	 * @return
	 */
	@RequestMapping(value = "listar", method = RequestMethod.GET)
	public static String listar() {
		return "usuario/listar";
	}
}
