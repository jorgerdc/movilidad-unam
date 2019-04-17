/**
 * 
 */

$(document).ready(function(){
  cambiarPestanaMenu("#linkPumabus");
  listar("/pumabus/listar","#pumabus-listado");
	
  $("#registrarPumabus").on("click",function(){
    cargarModal("/pumabus/agregar","#modalAgregarPumabus");
  });
});