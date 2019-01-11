package mx.unam.fi.tesis.movilidad.web.model;

import java.io.Serializable;

/**
 * Modelo de la tabla usuarios
 */
public class Usuario implements Serializable {

	private static final long serialVersionUID = 2518978574179493260L;

	private Long usuarioId;

	private String usuNombre;

	private String usuPrimerApellido;

	private String usuSegundoApellido;

	private String usuCorreo;

	private String usuContrasena;

	/**
	 * get para el atributo usuario_id
	 * @return
	 */
	public Long getUsuarioId() {
		return usuarioId;
	}

	/**
	 * set para el atributo usuario_id
	 * @param usuario_id
	 */
	public void setUsuarioId(Long usuario_id) {
		this.usuarioId = usuario_id;
	}

	/**
	 * get para el atributo usu_nombre
	 * @return
	 */
	public String getUsuNombre() {
		return usuNombre;
	}

	/**
	 * set para el atributo usu_nombre
	 * @param usu_nombre
	 */
	public void setUsuNombre(String usu_nombre) {
		this.usuNombre = usu_nombre;
	}

	/**
	 * get para el atributo usu_primer_apellido
	 * @return
	 */
	public String getUsuPrimerApellido() {
		return usuPrimerApellido;
	}

	/**
	 * set para el atributo usu_primer_apellido
	 * @param usu_primer_apellido
	 */
	public void setUsuPrimerApellido(String usu_primer_apellido) {
		this.usuPrimerApellido = usu_primer_apellido;
	}

	/**
	 * get para el atributo usu_segundo_apellido
	 * @return
	 */
	public String getUsuSegundoApellido() {
		return usuSegundoApellido;
	}

	/**
	 * set para el atributo usu_segundo_apellido
	 * @param usu_segundo_apellido
	 */
	public void setUsuSegundoApellido(String usu_segundo_apellido) {
		this.usuSegundoApellido = usu_segundo_apellido;
	}

	/**
	 * get para el atributo usu_correo
	 * @return
	 */
	public String getUsuCorreo() {
		return usuCorreo;
	}

	/**
	 * set para el atributo usu_correo
	 * @param usu_correo
	 */
	public void setUsuCorreo(String usu_correo) {
		this.usuCorreo = usu_correo;
	}

	/**
	 * get para el atributo usu_contrasena
	 * @return
	 */
	public String getUsuContrasena() {
		return usuContrasena;
	}

	/**
	 * set para el atributo usu_contrasena
	 * @param usuContrasena
	 */
	public void setUsuContrasena(String usuContrasena) {
		this.usuContrasena = usuContrasena;
	}

}