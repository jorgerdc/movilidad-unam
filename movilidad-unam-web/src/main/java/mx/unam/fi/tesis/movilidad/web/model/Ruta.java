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

  public Long getRutaId() {
    return rutaId;
  }

  public void setRutaId(Long ruta_id) {
    this.rutaId = ruta_id;
  }

  public String getRutaNombre() {
    return rutaNombre;
  }

  public void setRutaNombre(String ruta_nombre) {
    this.rutaNombre = ruta_nombre;
  }

  public Point[] getGeo() {
    Point[] puntos = geo.getPoints();
    return puntos;
  }

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

  public String getGeometria() {
    return geometria;
  }

  public void setGeometria(String geometria) {
    this.geometria = geometria;
  }
}