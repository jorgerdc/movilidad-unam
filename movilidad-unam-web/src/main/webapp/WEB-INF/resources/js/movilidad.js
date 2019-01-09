/**
 * 
 */

function cambiarPestanaMenu(link){
	var pestanaPrevia = $(".active");
	$(pestanaPrevia).removeClass("active");
	$(link).addClass("active");
}
function cargarModal(url,IdModal){
	$.ajax({
		type:'GET',
		url:'/movilidad-unam-web'+url,
		dataType:'html',
		success:function(data){
			var modal = $(IdModal);
			modal.find(".modal-body").html(data);
			modal.modal("show");
		},
		error:function(jqXHR, textStatus, errorThrown){
			console.log(jqXHR);
		}
	});
	
}

function listar(url,IdListado){
	$.ajax({
		type:'GET',
		url:'/movilidad-unam-web'+url,
		dataType:'html',
		success:function(data){
			var listado = $(IdListado);
			listado.html(data);
		},
		error:function(jqXHR, textStatus, errorThrown){
			console.log(jqXHR);
		}
	});
}

function guardar(url,datos,modal,urlListar,listado){
	$.ajax({
		url:'/movilidad-unam-web'+url,
		type:"POST",
		contentType : "application/json",
		data: JSON.stringify(datos),
        dataType: "json",
		success:function(data){
			pnotify(data.titulo,data.mensaje,data.tipo);
			listar(urlListar,listado);
			$(modal).modal("hide");
				
			
		},
		error:function(jqXHR, textStatus, errorThrown){
			console.log("Problema con el ajax al guardar la información.");
			console.log(jqXHR);
			console.log(textStatus);
			pnotify("Error!","Ha ocurrido un error al intentar realizar la acci&oacute;n. Vuelva a intentarlo","error");
			listar(urlListar,listado);
			$(modal).modal("hide");
			
		}
	});
}

function pnotify(titulo,mensaje,tipo){
	PNotify.removeAll();
	new PNotify({
	    title: titulo,
	    text: mensaje,
	    type: tipo
	});
}