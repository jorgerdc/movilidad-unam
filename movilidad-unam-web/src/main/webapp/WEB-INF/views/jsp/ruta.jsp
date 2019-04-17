<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="content">
  <div class="page-header">
    <h1>Rutas.</h1>
  </div>

  <div class="row margin-bottom-15">
    <button type="button" id="registrarRutas"
      class="btn btn-success alinear-derecha">Registrar ruta.</button>
  </div>
  <div id="rutas-listado"></div>
</div>

<jsp:include page="/WEB-INF/views/jsp/modals/modal.jsp">
  <jsp:param name="id" value="modalAgregarRuta" />
  <jsp:param name="titulo" value="Agregar ruta" />
</jsp:include>

<script src="<c:url value ='/resources/js/ruta/main.js' />"></script>