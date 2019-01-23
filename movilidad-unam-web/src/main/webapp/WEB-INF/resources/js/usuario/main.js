/**
 * 
 */

$(document).ready(function(){
	cambiarPestanaMenu("#linkUsuarios");
	listar("/usuario/listar","#usuario-listado",{});
	
	$("#registrarUsuario").on("click",function(){
		cargarModal("/usuario/agregar","#modalAgregarUsuario");
	});
	
	$("#criterios-usuario").hide();
});

function filtrarUsuarios(){
	var form = $("#formBuscarUsuario");
	var datos = getFormData(form);
	listar("/usuario/listar","#usuario-listado",datos);
}