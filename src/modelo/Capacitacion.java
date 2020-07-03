package modelo;

public class Capacitacion {
	
	//Variables//
	private int id_capacitacion;
	private String fecha;
	private String hora;
	private String tema;
	private String contenido;
	private int id_cliente;
	
	
	
	//Constructores//
	
	public Capacitacion() {
		super();
	}

	public Capacitacion(String fecha, String hora, String tema, String contenido, int id_cliente) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.tema = tema;
		this.contenido = contenido;
		this.id_cliente = id_cliente;
	}

	public Capacitacion(int id_capacitacion) {
		super();
		this.id_capacitacion = id_capacitacion;
	}

	
	//Getters & Setters
	
	public int getId_capacitacion() {
		return id_capacitacion;
	}

	public void setId_capacitacion(int id_capacitacion) {
		this.id_capacitacion = id_capacitacion;
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

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	//To String//

	@Override
	public String toString() {
		return "Capacitacion [id_capacitacion=" + id_capacitacion + ", fecha=" + fecha + ", hora=" + hora + ", tema="
				+ tema + ", contenido=" + contenido + ", id_cliente=" + id_cliente + "]";
	}
	
	

	
	
	
	
}
