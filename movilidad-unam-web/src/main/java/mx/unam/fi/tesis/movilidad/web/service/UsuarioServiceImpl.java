package mx.unam.fi.tesis.movilidad.web.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mx.unam.fi.tesis.movilidad.dao.UsuarioDAO;
import mx.unam.fi.tesis.movilidad.web.model.Usuario;

/**
 * Declaracion de las funciones para el servicio de las estaciones.
 */
@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService {

	@Resource
	private UsuarioDAO usuarioDao;

	@Override
	public List<Usuario> listadoUsuarios(Usuario usuario) {
		List<Usuario> listado = usuarioDao.getListado(usuario);
		return listado;
	}

	@Override
	public void guardarUsuario(Usuario usuario) {
		usuarioDao.guardarUsuario(usuario);
	}

	@Override
	public Usuario getUsuario(int id) {
		return usuarioDao.getUsuario(id);
	}

}
