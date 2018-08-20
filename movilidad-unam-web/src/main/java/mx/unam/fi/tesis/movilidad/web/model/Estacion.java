package mx.unam.fi.tesis.movilidad.web.model;

import java.io.Serializable;

/**
 * Modelo de la tabla estaciones.
 */
public class Estacion implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long estacionId;

	private String nombre;

	/**
	 * Get para el atributo estacion_id
	 * @return
	 */
	public Long getEstacionId() {
		return estacionId;
	}

	/**
	 * Set para el atributo estacion_id
	 * @param estacion_id
	 */
	public void setEstacionId(Long estacion_id) {
		this.estacionId = estacion_id;
	}

	/**
	 * Get para el atributo nombre.
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Set para el atributo nombre.
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
