<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<form id="formAgregarUsuario">
	<div class="row">
		<div class="form-group col-md-6">
			<label for="nombre">Nombre</label> 
			<input type="text" name="usuNombre" class="form-control" id="usuNombre" placeholder="Nombre">
		</div>
		<div class="form-group col-md-6">
			<label for="ap_paterno">Apellido paterno</label> 
			<input type="text"name="usuPrimerApellido" class="form-control" id="usuPrimerApellido" placeholder="Apellido paterno">
		</div>
	</div>

	<div class="row">
		<div class="form-group col-md-6">
			<label for="ap_materno">Apellido materno</label> 
			<input type="text" name="usuSegundoApellido" class="form-control" id="usuSegundoApellido" placeholder="Apellido materno">
		</div>
		<div class="form-group col-md-6">
			<label for="correo">Correo electrónico</label> 
			<input type="text" name="usuCorreo" class="form-control" id="usuCorreo" placeholder="Correo electrónico">
		</div>
	</div>
</form>

<script src="<c:url value ='/resources/js/usuario/agregar.js' />"></script>