/**
 * 
 */

$( document ).ready(function() {
  $("#modalAgregarUsuario #modalEnviar").on('click',function(){
    guardarUsuario();
  });
});

function guardarUsuario(){
  var form = $("#formAgregarUsuario");
  var datos = getFormData(form);
  guardar("/RestUsuario/guardar",datos,"#modalAgregarUsuario","/usuario/listar","#usuario-listado");
}
