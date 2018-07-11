package mx.unam.fi.tesis.movilidad.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/ruta/")
public class RutaController {
	
	@RequestMapping(value= "agregar", method = RequestMethod.GET)
	public String agregar() {
		return "ruta/agregar";
	}
	
	@RequestMapping(value= "listar", method = RequestMethod.GET)
	public String listar() {
		return "ruta/listar";
	}
}
