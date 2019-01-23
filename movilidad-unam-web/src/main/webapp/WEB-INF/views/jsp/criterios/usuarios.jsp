<div id="criterios-usuario" class="row margin-bottom-15">
	<div class="col-md-12">
		<div class="row">
			<div class="col-md-12 centrar-texto">
				<h3>Criterios de búsqueda.</h3>
			</div>
		</div>
		<hr>
		<form id="formBuscarUsuario">
			<div class="row">
				<div class="form-group col-md-6">
					<label for="nombre">Nombre</label> <input type="text"
						name="usuNombre" class="form-control" id="nombre"
						placeholder="Nombre">
				</div>
				<div class="form-group col-md-6">
					<label for="ap_paterno">Apellido paterno</label> <input type="text"
						name="usuPrimerApellido" class="form-control" id="apPaterno"
						placeholder="Apellido paterno">
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-6">
					<label for="ap_materno">Apellido materno</label> <input type="text"
						name="usuSegundoApellido" class="form-control" id="apMaterno"
						placeholder="Apellido materno">
				</div>
				<div class="form-group col-md-6">
					<label for="correo">Correo electrónico</label> <input type="text"
						name="usuCorreo" class="form-control" id="correo"
						placeholder="Correo electrónico">
				</div>
			</div>
		</form>
		<div class="row centrar-texto">
			<button type="button" id="buscarAceptar"
				class="btn btn-md btn-primary margin-right-10"
				onclick="filtrarUsuarios()">Aceptar</button>

			<button type="button" id="buscarLimpiar" class="btn btn-md btn-light"
				onclick="limpiarCriterios('#formBuscarUsuario','/usuario/listar','#usuario-listado')">Limpiar</button>
		</div>
		<hr>
	</div>
</div>
