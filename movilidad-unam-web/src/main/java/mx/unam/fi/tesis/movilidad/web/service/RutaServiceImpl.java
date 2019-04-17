package mx.unam.fi.tesis.movilidad.web.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mx.unam.fi.tesis.movilidad.dao.RutaDAO;
import mx.unam.fi.tesis.movilidad.web.model.Ruta;

/**
 * Declaración de las funciones para el servicio de las rutas
 */
@Service("rutaService")
public class RutaServiceImpl implements RutaService {

  @Resource
  private RutaDAO rutaDao;

  @Override
  public void guardarRuta(Ruta ruta) {
    rutaDao.guardarRuta(ruta);
  }
}
