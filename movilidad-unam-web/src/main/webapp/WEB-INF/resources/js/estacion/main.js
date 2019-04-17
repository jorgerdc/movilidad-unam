$(document).ready(function(){
  listar("/estacion/listar","#estacion-listado");
  $("#registrarEstacion").click(function(){
    cargarModal("/estacion/agregar","#modalAgregarEstacion");
  });
    
  $("#modalAgregarEstacion").on("hide.bs.modal",function(){
    $("#modalAgregarEstacion #modalEnviar").off("click");
   });
});