<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<form>
	<div class="row">
		<div class="form-group col-md-12">
			<label for="nombre">Nombre de la estación</label> <input type="text"
				class="form-control" name="nombre" id="nombreEstacion"
				placeholder="Nombre">
		</div>
	</div>
	<div class="row">
		<div class="form-group col-md-6">
			<label for="latitud">Latitud</label> <input type="text"
				class="form-control" id="latitud" placeholder="Latitud">
		</div>
		<div class="form-group col-md-6">
			<label for="longitud">Longitud</label> <input type="text"
				class="form-control" id="longitud" placeholder="Longitud">
		</div>
	</div>
</form>

<div id="map"></div>

<script src="<c:url value ="/resources/js/estacion/agregar.js" />"></script>






