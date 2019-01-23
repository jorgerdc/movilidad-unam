<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html>
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>Movilidad UNAM</title>
		<!-- Tell the browser to be responsive to screen width -->
		<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
				name="viewport">
				
		<!-- REQUIRED JS SCRIPTS -->
		<!-- jQuery 3 -->
		<script src="<c:url value ='/resources/js/jquery.min.js' />"></script>
		<!-- Bootstrap 3.3.7 -->
		<script src="<c:url value ='/resources/js/bootstrap.min.js' />"></script>
		<!-- AdminLTE App -->
		<script src="<c:url value ='/resources/js/adminlte.min.js' />"></script>
		<!-- Font awesome -->
		<script src="<c:url value ='/resources/js/fontawesome.js' />"></script>
		<!-- Movilidad -->
		<script src="<c:url value ='/resources/js/movilidad.js' />"></script>
		<!-- Google maps API -->
		<script async defer
			src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDWfXD_inEXDTC0XTNMPfYUNxoUV13vPm0&libraries=drawing">
		</script>
		<!-- PNotify -->
		<script src="<c:url value ='/resources/js/pnotify.custom.min.js' />"></script>
		<script>PNotify.prototype.options.styling = "fontawesome";</script>	
		

		<link rel="stylesheet" href="<c:url value='/resources/css/bootstrap.min.css'/>">
		<!-- Font Awesome -->
		<link rel="stylesheet" href="<c:url value='/resources/css/font-awesome.min.css'/>">
		<!-- Ionicons -->
		<link rel="stylesheet" href="<c:url value='/resources/css/ionicons.min.css'/>">
		<!-- Theme style -->
		<link rel="stylesheet" href="<c:url value='/resources/css/AdminLTE.min.css'/>">
		<link rel="stylesheet" href="<c:url value='/resources/css/skin-blue.min.css'/>">
		<!-- Estilos generales del sistema-->
		<link rel="stylesheet" href="<c:url value='/resources/css/movilidad.css'/>">
		<!-- Google Font -->
		<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
		<!-- Estilos Pnotify-->
		<link rel="stylesheet" href="<c:url value='/resources/css/pnotify.custom.min.css'/>">
		
		<!-- Optional header of center page -->
		<sitemesh:write property='head' />

	</head>

	<body class="hold-transition skin-blue sidebar-mini">
		<div class="wrapper">
	
			<!-- Main Header -->
			<header class="main-header">
	
				<!-- Logo -->
				<a class="logo"> <!-- mini logo for sidebar mini 50x50 pixels -->
					<span class="logo-mini"><b>UNAM</b></span> <!-- logo for regular state and mobile devices -->
					<span class="logo-lg"><b>Movilidad</b> UNAM</span>
				</a>
	
				<!-- Header Navbar -->
				<nav class="navbar navbar-static-top" role="navigation">
					<!-- Sidebar toggle button-->
					<a href="#" class="sidebar-toggle" data-toggle="push-menu"
						role="button"> <span class="sr-only">Toggle navigation</span>
					</a>
					<!-- Navbar Right Menu -->
					<div class="navbar-custom-menu"></div>
				</nav>
			</header>
			<!-- Left side column. contains the logo and sidebar -->
			<aside class="main-sidebar">
	
				<!-- sidebar: style can be found in sidebar.less -->
				<section class="sidebar">
	
					<!-- Sidebar user panel (optional) -->
	
					<!-- search form (Optional) -->
	
					<!-- /.search form -->
	
					<!-- Sidebar Menu -->
					<ul class="sidebar-menu" data-widget="tree">
						<li class="header">MENÚ</li>
						<!-- Optionally, you can add icons to the links -->
						<li class="active" id="linkEstacion"><a
							href="<c:url value='/'/>"><i class="fa fa-map-marker"></i><span>Estaciones</span></a></li>
	
						<li id="linkPumabus"><a href="<c:url value='/pumabus'/>"><i
								class="fa fa-bus"></i> <span>Pumabus</span></a></li>
	
						<li id="linkRutas"><a href="<c:url value='/ruta'/>"><i
								class="fa fa-road"></i> <span>Rutas</span></a></li>
	
						<li id="linkEstacionamientos"><a
							href="<c:url value='/estacionamiento'/>"><i class="fa fa-car"></i>
								<span>Estacionamientos</span></a></li>
	
						<li id="linkUsuarios"><a href="<c:url value='/usuario'/>"><i
								class="fa fa-users"></i> <span>Usuarios</span></a></li>
	
					</ul>
					<!-- /.sidebar-menu -->
				</section>
				<!-- /.sidebar -->
			</aside>
	
			<!-- Content Wrapper. Contains page content -->
			<div class="content-wrapper">
				<!-- Content Header (Page header) -->
				<!-- Main content -->
				<section class="content container-fluid">
	
					<!-- center page  -->
	
					<sitemesh:write property='body' />
	
				</section>
				<!-- /.content -->
			</div>
			<!-- /.content-wrapper -->
	
			<!-- Main Footer -->
			<footer class="main-footer">
				<!-- To the right -->
				<div class="pull-right hidden-xs">Cristian Jovany Vargas Flores</div>
				<!-- Default to the left -->
				<strong>SISTEMA INTEGRAL APLICADO A LA MEJORA DE LA MOVILIDAD EN CIUDAD UNIVERSITARIA.
				</strong>
			</footer>
	
	
			<!-- /.control-sidebar -->
			<!-- Add the sidebar's background. This div must be placed
	  immediately after the control sidebar -->
			<div class="control-sidebar-bg"></div>
		</div>
	
	</body>
</html>