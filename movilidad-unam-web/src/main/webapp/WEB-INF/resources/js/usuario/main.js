/**
 * 
 */

$(document).ready(function(){
	cambiarPestanaMenu("#linkUsuarios");
	listar("/usuario/listar","#usuario-listado");
	
	$("#registrarUsuario").on("click",function(){
		cargarModal("/usuario/agregar","#modalAgregarUsuario");
	});
});