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
		<br> <input type="text" name="txtfecha"
			placeholder="DD/MM/YYYY"> <br>
			
		<h2>Hora:</h2>
		<br> <input type="text" name="txthora"
			placeholder="DD/MM/YYYY HH:MM:SS">
		<br>
		<h2>Motivo:</h2>
		<br> <input type="text" name="txtmotivo"
			placeholder="motivo"> <br>
		<h2>Detalle:</h2>
		<br> <input type="text" name="txtdetalle"
			placeholder="detalle"> <br>
		<h2>Id_profesional:</h2>
		<br> <input type="number" name="txtid_profesional"
			placeholder="id_profesional"> <br>
        <h2>Id_cliente:</h2>
		<br> <input type="number" name="txtid_cliente"
			placeholder="id_cliente"> <br>
	
       <br> <input type="submit" value="Enviar Registro">

	</form>
	
</body>
</html>