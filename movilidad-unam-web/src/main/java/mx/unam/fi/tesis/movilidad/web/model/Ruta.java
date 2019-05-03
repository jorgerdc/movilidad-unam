package mx.unam.fi.tesis.movilidad.web.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.postgis.LineString;
import org.postgis.Point;

/**
 * Modelo de la tabla estaciones.
 */
public class Ruta implements Serializable {

  private static final long serialVersionUID = 2518978574179493260L;
  private Long rutaId;
  private String rutaNombre;
  private String geometria;
  @JsonIgnore
  private LineString geo;

  /**
   * get para el atributo ruta_id
   * @return
   */
  public Long getRutaId() {
    return rutaId;
  }

  /**
   * set para el atriburo ruta_id
   * @param ruta_id
   */
  public void setRutaId(Long ruta_id) {
    this.rutaId = ruta_id;
  }

  /**
   * get para el atributo ruta_nombre
   * @return
   */
  public String getRutaNombre() {
    return rutaNombre;
  }

  /**
   * set para el atributo ruta_nombre
   * @param ruta_nombre
   */
  public void setRutaNombre(String ruta_nombre) {
    this.rutaNombre = ruta_nombre;
  }

  /**
   * get para la geometría
   * @return
   */
  public Point[] getGeo() {
    if (geo == null) {
      return null;
    }
    Point[] puntos = geo.getPoints();
    return puntos;
  }

  /**
   * set para la geometría
   * @param coordenadas
   */
  public void setGeo(double[] coordenadas) {
    Point[] puntos = new Point[coordenadas.length - 1];
    int indice = 0;
    for (int i = 0; i < coordenadas.length; i++) {
      if ((i % 2) == 0) {
        puntos[indice] = new Point(coordenadas[i], coordenadas[i + 1]);
        indice++;
      }
      geo = new LineString(puntos);
    }
  }

  /**
   * get para la cadena de la geometría
   * @return
   */
  public String getGeometria() {
    return geometria;
  }

  /**
   * set para le cadena de la geometría
   * @param geometria
   */
  public void setGeometria(String geometria) {
    this.geometria = geometria;
  }
}