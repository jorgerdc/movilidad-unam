package mx.unam.fi.tesis.movilidad.web.model;

public class Mensaje {

  private String estado;
  private String titulo;
  private String mensaje;
  private String tipo;

  /**
   * get para el atributo estado.
   * @return
   */
  public String getEstado() {
    return estado;
  }

  /**
   * Set para el atributo estado.
   * @param estado
   */
  public void setEstado(String estado) {
    this.estado = estado;
  }

  /**
   * get para el atributo mensaje.
   * @return
   */
  public String getMensaje() {
    return mensaje;
  }

  /**
   * set para el atributo mensaje.
   * @param mensaje
   */
  public void setMensaje(String mensaje) {
    this.mensaje = mensaje;
  }

  /**
   * get para el atributo titulo.
   * @return
   */
  public String getTitulo() {
    return titulo;
  }

  /**
   * set para el atributo titulo.
   * @param titulo
   */
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  /**
   * get para el atributo tipo.
   * @return
   */
  public String getTipo() {
    return tipo;
  }

  /**
   * set para el atributo tipo.
   * @param tipo
   */
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
}
