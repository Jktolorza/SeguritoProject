<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado Asesorias</title>
</head>
<body>
	<h1>Listado asesorias</h1>

<c:if test="${cumensaje != null}">
	<c:out value="${cumensaje}" />
</c:if>

	<table>
		<tr>

			<th>Fecha</th>
			<th>Hora</th>
			<th>motivo</th>
			<th>detalle</th>
			<th>profesional a cargo</th>
			<th>cliente</th>
		</tr>
<c:forEach items='${listadoasesorias}' var='asesoria'>
			<tr>
				<td>${asesoria.getFecha()}</td>
				<td>${asesoria.getHora()}</td>
				<td>${asesoria.getMotivo()}</td>
				<td>${asesoria.getDetalle()}</td>
				<td>${asesoria.getProfesional()}</td>
				<td>${asesoria.getCliente()}</td>
						<td>
			<a href="${pageContext.request.contextPath}/EliminarAsesoria?id=${asesoria.getId_asesoria()}">Eliminar</a>
			&nbsp;
			<a href="${pageContext.request.contextPath}/EditarAsesoria?id=${asesoria.getId_asesoria()}">Editar</a>
		</td>
			</tr>
		</c:forEach>
	</table>
	
	<!-- // te lleva hasta la ruta del proyecto (https://localhost:port/proyectname) para luego enlazar al servlet -->
<a href="${pageContext.request.contextPath}/CrearAsesoria"> Crear Asesoria</a>
</body>
</html>