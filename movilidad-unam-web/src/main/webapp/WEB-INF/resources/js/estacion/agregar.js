/**
 * 
 */
var marker;
$( document ).ready(function() {
	initMap();
	$("#modalAgregarEstacion").on('show.bs.modal',function(){
		$("#latitud").val();
		$("#longitud").val();
	});
	
    $("#modalAgregarEstacion #modalEnviar").on('click',function(){
    	var coords = [];
    	var nombre = $("#nombreEstacion").val();
    	coords.push(marker.getPosition().lat());
    	coords.push(marker.getPosition().lng());
    	var datos = {"nombre":nombre,"geo":coords};
    	guardar("/estacion/guardar",datos,"#modalAgregarEstacion","/estacion/listar","#estacion-listado");
	});
	
});
function initMap() {
	var myLatLng = {
		lat : 19.3302 ,
		lng : -99.1892
	};

	// Create a map object and specify the DOM element
	// for display.
	var map = new google.maps.Map(document.getElementById('map'), {
		center : myLatLng,
		zoom : 17
	});

	// Create a marker and set its position.
	marker = new google.maps.Marker({
		map : map,
		position : myLatLng,
		draggable:true
	});
	
	marker.addListener('dragend',function(){
		var latitud;
		var longitud;
		latitud = marker.getPosition().lat();
		longitud = marker.getPosition().lng();
		$("#latitud").val(latitud.toFixed(6));
		$("#longitud").val(longitud.toFixed(6));
	});
}
