<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
<!-- Llamado a boostrap -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a style="border:none" class="navbar-brand" href="#">PSegurito</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav ">

     <!-- Datos Administrador -->
            <li class="nav-item dropdown">
	        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	          Datos Administrador
	        </a>
	        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
	          <a class="dropdown-item" href="profesional.jsp"  target="myFrame">Control Profesional</a>
   			  <a class="dropdown-item" href="cliente.jsp"  target="myFrame">Control Cliente</a>
	        
	        </div>
      </li>
 
             <!-- Detalle Profesional -->
       <li class="nav-item dropdown">
	        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	          Datos Profesional
	        </a>
	        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
	          <a class="dropdown-item" href="profesional.jsp"  target="myFrame">Control Profesional</a>
	          <a class="dropdown-item" href="${pageContext.request.contextPath}/LoginUsuario">Ingresar plan de mejora mejora</a>
	          <a class="dropdown-item" href="${pageContext.request.contextPath}/CrearAsesoria" target="myFrame">Agendar Asesoria</a> 
	          <a class="dropdown-item" href="#">Agendar Capacitacion</a>        
	        
	        </div>
      </li>
       <!-- Detalle Cliente -->
       <li class="nav-item dropdown">
	        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	          Datos Cliente
	        </a>
	        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
	          <a class="dropdown-item" href="cliente.jsp" target="myFrame">Control Cliente</a>
	          <a class="dropdown-item" href="#">Actividades de mejora</a>   
	          <a class="dropdown-item" href="${pageContext.request.contextPath}/ListarAsesorias" target="myFrame">Revisar Asesorias</a>  
	          <a class="dropdown-item" href="#">Agendar Capacitaciones</a>   
	          <a class="dropdown-item" href="#">Reportar Accidente</a>  
	          <a class="dropdown-item" href="#">Facturacion</a>   
	        
	        </div>
      </li>
<!--  <li class="nav-item">
        <a class="nav-link disabled" href="#">Disabled</a>
      </li>
 -->
    </ul>
  </div>
</nav>
<div class="m-4" style="height:500px">

	<iframe name="myFrame" style="height: 100%; width:100%; border:none">
	
	</iframe>
	
</div>

<!-- Jss boostrap -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>