package mx.unam.fi.tesis.movilidad.web.model;

import java.io.Serializable;

/**
 * TODO Modelo de la tabla estaciones.
 */
public class Estacion implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long estacion_id;

	private String nombre;

	/**
	 * TODO [Add method documentation]
	 * @return
	 */
	public Long getEstacion_id() {
		return estacion_id;
	}

	/**
	 * TODO [Add method documentation]
	 * @param estacion_id
	 */
	public void setEstacion_id(Long estacion_id) {
		this.estacion_id = estacion_id;
	}

	/**
	 * TODO [Add method documentation]
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * TODO [Add method documentation]
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
