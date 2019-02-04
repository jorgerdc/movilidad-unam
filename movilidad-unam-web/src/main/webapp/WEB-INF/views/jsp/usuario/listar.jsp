<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:if test="${totalUsuarios > 0}">
	<div class="table-responsive margin-top-10">
		<table class="table table-striped table-hover table-bordered">
			<thead>
				<tr>
					<th scope="col" width="20%" class="centrar-texto">Acciones</th>
					<th scope="col" width="20%" class="centrar-texto">Id</th>
					<th scope="col" width="20%" class="centrar-texto">Nombre</th>
					<th scope="col" width="20%" class="centrar-texto">Correo</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="usuario" items="${usuarios}">
					<tr>
						<td class="centrar-texto">
							<button type="button" class="btn btn-primary btn-sm margin-right-5" 
							onclick="editarUsuario(${usuario.usuarioId})">
								<span class="fa fa-pencil"></span>
							</button>
							<button type="button"
								class="btn btn-warning btn-sm margin-right-5">
								<span class="fa fa-ban"></span>
							</button>
						</td>
						<td class="centrar-texto">${usuario.usuarioId}</td>
						<td class="centrar-texto">${usuario.usuPrimerApellido}
							${usuario.usuSegundoApellido} ${usuario.usuNombre}</td>
						<td class="centrar-texto">${usuario.usuCorreo}</td>

					</tr>

				</c:forEach>
			</tbody>
		</table>
	</div>
</c:if>

<c:if test="${totalUsuarios == 0}">
	<div class="alert alert-warning centrar-texto" role="alert">No se
		cuentan con registros.</div>
</c:if>