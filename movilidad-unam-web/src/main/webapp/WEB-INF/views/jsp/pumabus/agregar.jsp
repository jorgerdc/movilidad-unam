<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<form id="formAgregarPumabus">
  <div class="row">
    <div class="form-group col-md-6">
      <label for="nombre">Nombre</label> 
      <input type="text" name="nombre" class="form-control" id="nombre" placeholder="Nombre">
    </div>
    <div class="form-group col-md-6">
      <label for="numPlaca">Número de placa</label> 
      <input type="text" name="placa" class="form-control" id="numPlaca" placeholder="Número de placa">
    </div>
  </div>
</form>

<script src="<c:url value ='/resources/js/pumabus/agregar.js' />"></script>