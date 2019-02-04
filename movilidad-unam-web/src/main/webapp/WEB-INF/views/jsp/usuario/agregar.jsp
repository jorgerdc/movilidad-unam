<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<form id="formAgregarUsuario">
	<c:if test='${not empty usuario }'>
		 <input type="hidden" id="usuarioId" name="usuarioId" value="${usuario.usuarioId}">
	</c:if>
	<div class="row">
		<div class="form-group col-md-6">
			<label for="nombre">Nombre</label> 
			<input type="text" name="usuNombre" class="form-control" id="usuNombre" 
			placeholder="Nombre" value ="<c:if test='${not empty usuario}'>${usuario.usuNombre}</c:if>">
		</div>
		<div class="form-group col-md-6">
			<label for="ap_paterno">Apellido paterno</label> 
			<input type="text"name="usuPrimerApellido" class="form-control" id="usuPrimerApellido" 
			placeholder="Apellido paterno" value ="<c:if test='${not empty usuario}'>${usuario.usuPrimerApellido}</c:if>">
		</div>
	</div>

	<div class="row">
		<div class="form-group col-md-6">
			<label for="ap_materno">Apellido materno</label> 
			<input type="text" name="usuSegundoApellido" class="form-control" id="usuSegundoApellido" 
			placeholder="Apellido materno" value ="<c:if test='${not empty usuario}'>${usuario.usuSegundoApellido}</c:if>">
		</div>
		<div class="form-group col-md-6">
			<label for="correo">Correo electrónico</label> 
			<input type="text" name="usuCorreo" class="form-control" id="usuCorreo" 
			placeholder="Correo electrónico" value ="<c:if test='${not empty usuario}'>${usuario.usuCorreo}</c:if>">
		</div>
	</div>
</form>

<script src="<c:url value ='/resources/js/usuario/agregar.js' />"></script>