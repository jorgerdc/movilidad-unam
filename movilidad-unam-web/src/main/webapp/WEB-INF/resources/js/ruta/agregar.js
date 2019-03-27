/**
 * 
 */
 var drawingManager;
 var map;
 var coordenadas;
$(document).ready(function(){
	initMapPuma();
	
	$("#modalAgregarRuta #modalEnviar").on('click',function(){
		var nombre = $("#rutaNombre").val();
		var coords = getCoordinates(coordenadas);
		var datos = {"rutaNombre":nombre,"geo":coords};
		guardar("/RestRuta/guardar",datos,"#modalAgregarRuta","/ruta/listar","#ruta-listado");
	});

	
});

function initMapPuma() {
	var myLatLng = {
			lat : 19.3302 ,
			lng : -99.1892
		};

		// Create a map object and specify the DOM element
		// for display.
		map = new google.maps.Map(document.getElementById('map'), {
			center : myLatLng,
			zoom : 17
		});
		
		 drawingManager = new google.maps.drawing.DrawingManager({
			    drawingControl: true,
			    drawingControlOptions: {
			      position: google.maps.ControlPosition.TOP_CENTER,
			      drawingModes: ['polyline']
			    }
			  });
			  drawingManager.setMap(map);
			  
	  google.maps.event.addListener(drawingManager, 'polylinecomplete', function (polyline) {
		    var coordinates = (polyline.getPath().getArray());
		    coordenadas = coordinates;
		});
}