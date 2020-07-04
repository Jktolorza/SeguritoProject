<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Bienvenido al sitio</h1>

	<c:if test="${lmensaje != null}">
		<c:out value="${lmensaje}" />
	</c:if>
	
<form action="ValidarUsuario" method="post" >
Usuario: <input type="text" name="txtnickname"><br>
Contraseña: <input type="password" name="txtpassword"><br> 
 <input type="submit" value="ingresar"><br> 
 </form>
</body>
</html>