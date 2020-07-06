<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar Factura</title>
<!-- Css de boostrap -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
   <body>
<div class="d-sm-flex">
	<div class="card col-sm-4">
		<div class="card-body">
			<form action="CrearFactura" method="post">
				<div class="form-group">
					<label>Fecha Cobro: </label>
					<input type="text" name="txtfechadecobro" class="form-control" placeholder="DD/MM/YYYY">			
				</div>
				<div class="form-group">
					<label>Fecha Vencimiento: </label>
					<input type="text" name="txtfechaVencimiento" class="form-control" placeholder="DD/MM/YYYY">			
				</div>
				<div class="form-group">
					<label>Extras: </label>
					<input type="number" name="txtextras" class="form-control">			
				</div>
				<div class="form-group">
					<label>Impuestos: </label>
					<input type="number" name="txtimpuestos" class="form-control" readonly>			
				</div>
				<div class="form-group">
					<label>Subtotal: </label>
					<input type="number" name="txtsubtotal" class="form-control" readonly>			
				</div>
				<div class="form-group">
					<label>Total: </label>
					<input type="number" name="txttotal" class="form-control" readonly>			
				</div>

				<div class="form-group">
					<label>Cliente</label>
					<select name="txtid_cliente" class="form-control form-control">				
	  				<c:forEach items="${listadoclientes}" var="cliente">
				<option value="${cliente.getId_cliente()}">${cliente.getNombreEmpresa()} </option>
			</c:forEach>
					</select>			
				</div>
			<input type="submit" name ="accion" value="Agregar" class="btn btn-info">
			<input type="reset" value="Cancelar" class="btn btn-info">
			</form>
		</div>
	</div>
		<div class="col-sm-8">
		
			<c:if test="${cumensaje != null}">
				<c:out value="${cumensaje}" />
			</c:if>
			<c:if test="${param.emensaje != null}">
				<c:out value="${param.emensaje}" />
			</c:if>
		
			<table class="table table-hover">
				<thead>
					<tr>
						<th>Fecha Cobro</th>
						<th>Fecha Vencimiento</th>
						<th>Extras</th>
						<th>Impuestos</th>
						<th>Subtotal</th>
						<th>Total</th>
						<th>Cliente</th>
					</tr>
				</thead>
				
				</tbody>
				</tbody>
				<c:forEach items='${listadofacturas}' var='factura'>
					<tr>
				<td>${factura.getFechadecobro()}</td>
				<td>${factura.getFechaVencimiento()}</td>
				<td>${factura.getExtras()}</td>
				<td>${factura.getImpuestos()}</td>
				<td>${factura.getSubtotal()}</td>
				<td>${factura.getTotal()}</td>
				<td>${factura.getCliente()}</td>
						<td>
							<a class="btn btn-warning" href="${pageContext.request.contextPath}/EditarFactura?id=${factura.getId_factura()}">Editar</a>
							<a class="btn btn-danger" href="${pageContext.request.contextPath}/EliminarFactura?id=${factura.getId_factura()}">Eliminar</a>
							<a class="btn btn-danger" href="${pageContext.request.contextPath}/CrearDetalleFactura?id=${factura.getId_factura()}">Detalle Factura</a>
						</td>
					</tr>
					</c:forEach>
				</tbody>				
			</table>
		</div>
	</div>


<!-- Jss boostrap -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>