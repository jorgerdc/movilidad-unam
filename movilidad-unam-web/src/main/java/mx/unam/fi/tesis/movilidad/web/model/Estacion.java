package mx.unam.fi.tesis.movilidad.web.model;

import java.io.Serializable;

import org.postgis.Point;

/**
 * Modelo de la tabla estaciones.
 */
public class Estacion implements Serializable {

  private static final long serialVersionUID = 2518978574179493260L;
  private Long estacionId;
  private String nombre;
  private double x;
  private double y;
  private int[] estacionRuta;

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
   * get para la coordenada x del punto.
   * @return
   */
  public double getX() {
    return x;
  }

  /**
   * set para la coordenada x del punto.
   * @param x
   */
  public void setX(double x) {
    this.x = x;
  }

  /**
   * get para la coordenada y del punto.
   * @return
   */
  public double getY() {
    return y;
  }

  /**
   * set para la coordenada y de punto.
   * @param y
   */
  public void setY(double y) {
    this.y = y;
  }

  /**
   * Genera la geometria punto con los valores x,y
   * @return
   */
  public Point getGeo() {
    return new Point(this.x, this.y);
  }

  /**
   * Arreglo de rutas asociadas a la estación.
   * @param estacionRuta
   */
  public void setEstacionRuta(int[] estacionRuta) {
    this.estacionRuta = new int[estacionRuta.length];
    System.arraycopy(estacionRuta, 0, this.estacionRuta, 0, estacionRuta.length);
  }

  /**
   * get para las rutas asociadas a una estación.
   * @return
   */
  public int[] getEstacionRuta() {
    return this.estacionRuta;
  }

}
