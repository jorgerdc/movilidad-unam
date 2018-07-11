/**
 * 
 */
$( document ).ready(function() {
	initMap();
	$("#modalAgregarEstacion").on('show.bs.modal',function(){
		$("#latitud").val();
		$("#longitud").val();
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
	var marker = new google.maps.Marker({
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
		$("#longitud").val(latitud.toFixed(6));
	});
}
