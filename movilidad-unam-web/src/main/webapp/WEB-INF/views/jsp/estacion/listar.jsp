<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:if test="${totalEstaciones > 0}">
  <table class="table table-hover table-striped table-bordered">
    <thead>
      <tr>
        <th scope="col" width="20%" class="centrar-texto">Acciones</th>
        <th scope="col" width="20%" class="centrar-texto">Id</th>
        <th scope="col" width="60%" class="centrar-texto">Nombre</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach var="estacion" items="${estaciones}">
      <tr>
        <td class="centrar-texto">
          <button type="button" class="btn btn-primary btn-sm margin-right-5">
            <span class="fa fa-pencil"></span>
          </button>
          <button type="button" class="btn btn-warning btn-sm margin-right-5">
            <span class="fa fa-ban"></span>
          </button>
        </td>
        <td class="centrar-texto">${estacion.estacionId}</td> 
        <td class="centrar-texto">${estacion.nombre}</td>
					
      </tr>
    </c:forEach>
    </tbody>
  </table>
</c:if>

<c:if test="${totalEstaciones == 0}">
  <div class="alert alert-warning centrar-texto" role="alert">
  No se cuentan con registros.
  </div>
</c:if>
