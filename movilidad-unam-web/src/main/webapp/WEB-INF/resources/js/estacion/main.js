$(document).ready(function(){
	listar("/estacion/listar","#estacion-listado");
    $("#registrarEstacion").click(function(){
    	cargarModal("/estacion/agregar","#modalAgregarEstacion");
    });
});