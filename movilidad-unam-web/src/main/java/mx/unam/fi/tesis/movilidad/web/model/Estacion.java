package mx.unam.fi.tesis.movilidad.web.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.postgis.Point;

/**
 * Modelo de la tabla estaciones.
 */
public class Estacion implements Serializable {

	private static final long serialVersionUID = 2518978574179493260L;

	private Long estacionId;

	private String nombre;

	@JsonIgnore
	private Point geo;

	public Estacion() {
		this.geo = new Point();
	}

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

	/**
	 * get para la geometria.
	 * @return
	 */
	public double[] getGeo() {
		return new double[] { geo.getX(), geo.getY() };
	}

	/**
	 * set para la geometria, se le indica que implementara la funcion setX(double) y
	 * setY(double)
	 * @param x
	 */
	public void setGeo(double[] x) {
		if (x.length == 2) {
			this.geo.setX(x[0]);
			this.geo.setY(x[1]);
		}
	}

}
