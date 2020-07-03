package modelo;




public class Asesoria {
private int id_asesoria;
//private Date fecha = new Date();
//private Date hora = new Date();
private String fecha;
private String hora;
private String motivo;
private String detalle;
private int id_profesional;
private int id_cliente;


//Constructores
public Asesoria() {
	
}

public Asesoria(String fecha, String hora, String motivo, String detalle, int id_profesional, int id_cliente) {
	super();
	this.fecha = fecha;
	this.hora = hora;
	this.motivo = motivo;
	this.detalle = detalle;
	this.id_profesional = id_profesional;
	this.id_cliente = id_cliente;
}



public Asesoria(int id_asesoria, String fecha, String hora, String motivo, String detalle, int id_profesional,
		int id_cliente) {
	super();
	this.id_asesoria = id_asesoria;
	this.fecha = fecha;
	this.hora = hora;
	this.motivo = motivo;
	this.detalle = detalle;
	this.id_profesional = id_profesional;
	this.id_cliente = id_cliente;
}
//GETTERS AND SETTERS
public int getId_asesoria() {
	return id_asesoria;
}
public void setId_asesoria(int id_asesoria) {
	this.id_asesoria = id_asesoria;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
public String getHora() {
	return hora;
}
public void setHora(String hora) {
	this.hora = hora;
}
public String getMotivo() {
	return motivo;
}
public void setMotivo(String motivo) {
	this.motivo = motivo;
}
public String getDetalle() {
	return detalle;
}
public void setDetalle(String detalle) {
	this.detalle = detalle;
}
public int getId_profesional() {
	return id_profesional;
}
public void setId_profesional(int id_profesional) {
	this.id_profesional = id_profesional;
}
public int getId_cliente() {
	return id_cliente;
}
public void setId_cliente(int id_cliente) {
	this.id_cliente = id_cliente;
}


}
