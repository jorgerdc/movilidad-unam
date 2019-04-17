/**
 * 
 */
$(document).ready(function(){
  cambiarPestanaMenu("#linkRutas");
  listar("/ruta/listar","#rutas-listado");

  $("#registrarRutas").on("click",function(){
    cargarModal("/ruta/agregar","#modalAgregarRuta");
  });
});