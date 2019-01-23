package mx.unam.fi.tesis.movilidad.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mx.unam.fi.tesis.movilidad.web.model.Usuario;
import mx.unam.fi.tesis.movilidad.web.service.UsuarioService;

/**
 * Clase que permite el manejo de los datos para los usuarios.
 */
@Controller
@RequestMapping(value = "/usuario/")
public class UsuarioController {
	@Resource
	private UsuarioService usuarioService;

	private static final String vista_usuario_agregar = "usuario/agregar";
	private static final String vista_usuario_listar = "usuario/listar";

	/**
	 * Método que permite agregar un usuario
	 * @return
	 */
	@RequestMapping(value = "agregar", method = RequestMethod.GET)
	public static String agregar(ModelMap map) {
		return vista_usuario_agregar;
	}

	/**
	 * Método que obtiene el listado de los usuarios.
	 * @return
	 */
	@RequestMapping(value = "listar", method = RequestMethod.GET)
	public String listar(ModelMap map, Usuario usuario) {
		List<Usuario> usuarios = usuarioService.listadoUsuarios(usuario);
		int totalUsuarios = usuarios.size();
		map.addAttribute("totalUsuarios", totalUsuarios);
		map.addAttribute("usuarios", usuarios);
		return vista_usuario_listar;
	}

}
