/**
 * 
 */
$(document).ready(function(){
	cambiarPestanaMenu("#linkEstacionamientos");
	listar("/estacionamiento/listar","#estacionamiento-listado");
	
	$("#registrarEstacionamiento").on("click",function(){
		cargarModal("/estacionamiento/agregar","#modalAgregarEstacionamiento");
	});
});