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
    var checkSeleccionados = $("input[type=checkbox]:checked");
    if(checkSeleccionados.length > 0){
      var rutas = [];
      rutas = relacionRutaEstacion(checkSeleccionados);
      var nombre = $("#nombreEstacion").val();
      var datos = {"nombre":nombre,"x": marker.getPosition().lat(), 
                   "y":marker.getPosition().lng(),"estacionRuta":rutas};
      guardar("/RestEstacion/guardar",datos,"#modalAgregarEstacion","/estacion/listar",
                "#estacion-listado");
    }else{
      pnotify("¡Ciudado!","Se debe seleccionar por lo menos una ruta cercana a la " +
      		"estación.","warning");
    }
  });	
});

function initMap() {
  var CU = new google.maps.Polygon({
    paths: [
      new google.maps.LatLng(19.3342,-99.1972),
      new google.maps.LatLng(19.3116,-99.1982),
      new google.maps.LatLng(19.3070,-99.1834),
      new google.maps.LatLng(19.3125,-99.1726),
      new google.maps.LatLng(19.3362,-99.1800)
          ]
  	});
  
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
    if(google.maps.geometry.poly.containsLocation(
      new google.maps.LatLng(marker.getPosition().lat(), 
      marker.getPosition().lng()), CU)){
    
      var latitud;
      var longitud;
      latitud = marker.getPosition().lat();
      longitud = marker.getPosition().lng();
	  $("#latitud").val(latitud.toFixed(6));
      $("#longitud").val(longitud.toFixed(6));
      var datos = {"x": latitud, "y":longitud};
      $("#checkRutas").empty();
      verificarEstacionRuta("/RestEstacion/verificarRuta",datos);
    }else{
      $("#modalAgregarEstacion button#modalEnviar").prop("disabled",true);
      var container = $("#checkRutas");
      $(container).empty();
      $('<div />',{class: 'alert alert-danger sinRutas centrar-texto',
        role:"alert"}).appendTo(container);
      $(".sinRutas").append("<p>La estación se encuentra fuera de Ciudad Universitaria.</p>");
    }
  });
}

function verificarEstacionRuta(url,datos){
  $.ajax({
    url:'/movilidad-unam-web'+url,
    type:"POST",
    contentType : "application/json",
    data: JSON.stringify(datos),
    dataType: "json",
    success:function(data){
      var longitud = data.length;
      var container = $("#checkRutas");
      if (longitud > 0) {
        $("#checkRutas").append("<p>Seleccione las rutas a la que sera asociada " +
        		"la estaci&oacute;n.</p>");
        $('<div />',{class: 'row renglon'}).appendTo(container);

        for (var i = 0; i < longitud; i++) {
          $('<div />',{class: 'col-xs-12 col-sm-6',id:'column_'+data[i].rutaId}).appendTo(
             	  $('div.renglon'));
          $('<div />',{class: 'form-check',id:'check_'+data[i].rutaId}).appendTo(
                  $('div#column_'+data[i].rutaId));
          $('<input />',{'data-id':data[i].rutaId,type:'checkbox',
        	  class:'form-check-input checkEstacionRuta',name:'rutas[]'}).appendTo(
                  $("div#check_"+data[i].rutaId));
          $('<label />',{text:data[i].rutaNombre,class:'form-check-label'}).appendTo(
                  $("div#check_"+data[i].rutaId));
        }
      }else{
        $(container).empty();
        $('<div />',{class: 'alert alert-danger sinRutas centrar-texto',
                     role:"alert"}).appendTo(container);
        $(".sinRutas").append("<p>No se han encontrados rutas cercanas al punto.</p>");
      }
    },
    error:function(jqXHR, textStatus, errorThrown){
      console.log("Ajax mal ");	
    }
  });
}

function relacionRutaEstacion(checkSeleccionados){	
  var rutaIds = [];
  for (var i = 0; i < checkSeleccionados.length; i++) {
    var id = $(checkSeleccionados[i]).attr("data-id");
    rutaIds.push(id);
  }
  return rutaIds;
}



