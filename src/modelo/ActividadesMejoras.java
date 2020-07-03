package modelo;

public class ActividadesMejoras {

	//Variables//
	
	private int idActMejora;
	private String Nombre;
	private String fechaInicio;
	private String fechaTermino;
	private String estado;
	private String detalle;
	private int id_cliente;
	private int id_profesional;
	
	//Constructores//
	
	public ActividadesMejoras() {
		super();
	}

	public ActividadesMejoras(String nombre, String fechaInicio, String fechaTermino, String estado, String detalle, int id_cliente, int id_profesional) {
		super();
		Nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaTermino = fechaTermino;
		this.estado = estado;
		this.detalle = detalle;
		this.id_cliente = id_cliente;
		this.id_profesional = id_profesional;
	}
	
	public ActividadesMejoras(int idActMejora) {
		super();
		this.idActMejora = idActMejora;
	}
	
	//Getters & Setters

	
	
	public int getIdActMejora() {
		return idActMejora;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public int getId_profesional() {
		return id_profesional;
	}

	public void setId_profesional(int id_profesional) {
		this.id_profesional = id_profesional;
	}

	public void setIdActMejora(int idActMejora) {
		this.idActMejora = idActMejora;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaTermino() {
		return fechaTermino;
	}

	public void setFechaTermino(String fechaTermino) {
		this.fechaTermino = fechaTermino;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}


	//To String//
	
	@Override
	public String toString() {
		return "ActividadesMejoras [idActMejora=" + idActMejora + ", Nombre=" + Nombre + ", fechaInicio=" + fechaInicio
				+ ", fechaTermino=" + fechaTermino + ", estado=" + estado + ", detalle=" + detalle + ", id_cliente="
				+ id_cliente + ", id_profesional=" + id_profesional + "]";
	}
	
	
}
