/**
 * 
 */
 var drawingManager;
 var map;
$(document).ready(function(){
	initMapEstacionamiento();
});

function initMapEstacionamiento() {
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
			      drawingModes: ['polygon']
			    }
			  });
			  drawingManager.setMap(map);
}