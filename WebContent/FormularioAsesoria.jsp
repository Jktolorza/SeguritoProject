<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Asesoria</title>

</head>
<body>



	<form action="CrearAsesoria" method="post">

		<h2>Fecha:</h2>
		<input type="text" name="txtfecha" placeholder="DD/MM/YYYY">
		<br>

		<h2>Hora:</h2>
		 <input type="text" name="txthora"
			placeholder="DD/MM/YYYY HH:MM:SS"> <br>
		<h2>Motivo:</h2>
		<input type="text" name="txtmotivo" placeholder="motivo">
		<br>
		<h2>Detalle:</h2>
		<input type="text" name="txtdetalle" placeholder="detalle">
		<br>
	     <h2>Profesional a cargo:</h2>
		<select name="txtid_profesional">
			<c:forEach items="${listadoprofesionales}" var="profesional">
				<option value="${profesional.getId_profesional()}">${profesional.getNombre()} ${profesional.getApellido()} </option>
			</c:forEach>
		</select> 
		<br>
		<h2>Cliente:</h2>
			<select name="txtid_cliente">
			<c:forEach items="${listadoclientes}" var="cliente">
				<option value="${cliente.getId_cliente()}">${cliente.getNombreEmpresa()} </option>
			</c:forEach>
		</select> 	 
		<br>
		<br> <input type="submit" value="Enviar Registro">

	</form>

<a href="${pageContext.request.contextPath}/ListarAsesorias">Volver al listado de asesorias</a>

</body>
</html>