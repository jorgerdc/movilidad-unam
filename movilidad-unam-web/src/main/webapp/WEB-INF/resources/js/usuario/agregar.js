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
	var datos = form.serialize();
}
