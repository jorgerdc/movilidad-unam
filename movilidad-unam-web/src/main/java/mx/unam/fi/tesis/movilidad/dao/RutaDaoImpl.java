package mx.unam.fi.tesis.movilidad.dao;

import java.util.ArrayList;
import java.util.List;

import org.postgis.Point;
import org.springframework.stereotype.Repository;

import mx.unam.fi.tesis.movilidad.web.model.Ruta;

/**
 * Definición de las funciones para las rutas
 */
@Repository("rutaDAO")
public class RutaDaoImpl extends GenericJdbcDAO implements RutaDAO {

  StringBuilder sb;
  private static final String insert_ruta_sql =
    "INSERT INTO ruta(ruta_nombre,geo) VALUES (?,ST_GeomFromText(?))";

  @Override
  public void guardarRuta(Ruta ruta) {
    Point[] puntosLinea = ruta.getGeo();
    double coordenadas = Math.ceil(puntosLinea.length / 2 + puntosLinea.length % 2);
    List<String> condiciones;
    condiciones = new ArrayList<>();
    int size;
    int regActualizados;

    for (int i = 0; i < coordenadas; i++) {
      condiciones.add(puntosLinea[i].getValue().replaceAll("[()]", ""));
    }

    size = condiciones.size();
    sb = new StringBuilder("LINESTRING(");
    for (int i = 0; i < size; i++) {
      sb.append(condiciones.get(i));
      if (i < size - 1) {
        sb.append(",");
      }
    }
    sb.append(")");

    regActualizados =
      getJdbcTemplate().update(insert_ruta_sql, ruta.getRutaNombre(), sb.toString());

    checkRowUpdated(1, regActualizados);

  }

}
