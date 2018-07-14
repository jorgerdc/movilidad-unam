<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<form>
	<div class="row">
		<div class="form-group col-md-12">
			<label for="nombre">Nombre</label> <input type="text"
				class="form-control" id="nombre" placeholder="Nombre">
		</div>
	</div>
	<div id="map"></div>
</form>

<script src="<c:url value ="/resources/js/ruta/agregar.js" />"></script>