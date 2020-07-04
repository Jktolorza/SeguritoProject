<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Asesoria</title>
<!-- Css de boostrap -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
   <body>
<div class="d-sm-flex">
	<div class="card col-sm-4">
		<div class="card-body">
			<form action="EditarAsesoria" method="post">
				<div class="form-group">
					<label>Fecha: </label>
					<input type="text" name="txtfecha" class="form-control" value="${datosasesoria.getFecha()}">			
				</div>
				<div class="form-group">
					<label>Hora: </label>
					<input type="text" name="txthora" class="form-control" value="${datosasesoria.getHora()}">			
				</div>
				<div class="form-group">
					<label>Motivo: </label>
					<input type="text" name="txtmotivo" class="form-control" value="${datosasesoria.getMotivo()}">			
				</div>
				<div class="form-group">
					<label>Detalle: </label>
					<input type="text" name="txtdetalle" class="form-control" value="${datosasesoria.getDetalle()}">			
				</div>
				<div class="form-group">
					<input type="hidden" name="hdnidasesoria" class="form-control" value="${datosasesoria.getId_asesoria()}">			
				</div>

				<div class="form-group">
					<label>Profesional a cargo </label>
					<select name="txt_idprofesional" class="form-control form-control">				
	  					<c:forEach items="${listadoprofesionales}" var="profesional">
							<option value="${profesional.getId_profesional()}" ${datosasesoria.getId_profesional() == profesional.getId_profesional() ? 'selected' : ''}>${profesional.getNombre()} ${profesional.getApellido()} </option>
						</c:forEach>
					</select>		
				</div>
				<div class="form-group">
					<label>Cliente</label>
					<select name="txt_idcliente" class="form-control form-control">				
	  				<c:forEach items="${listadoclientes}" var="cliente">
				<option value="${cliente.getId_cliente()}" ${datosasesoria.getId_cliente() == cliente.getId_cliente() ? 'selected' : ''}>${cliente.getNombreEmpresa()} </option>
			</c:forEach>
					</select>			
				</div>
			<input type="submit" name ="accion" value="Editar" class="btn btn-info">
			<input type="reset" value="Cancelar" class="btn btn-info">
			</form>
		</div>
	</div>
	</div>
<!-- Jss boostrap -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>