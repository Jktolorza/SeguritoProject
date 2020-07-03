package modelo;

public class ReporteAccidente {
    
    private int idReporteAccidente;
    private String fecha;
    private String direccion;
    private String labor;
    private String descripcion;
    
    
    public ReporteAccidente(String fecha, String direccion, String labor, String descripcion) {
        this.fecha = fecha;
        this.direccion = direccion;
        this.labor = labor;
        this.descripcion = descripcion;
    }


    public ReporteAccidente() {
        super();
    }


    public int getIdReporteAccidente() {
        return idReporteAccidente;
    }


    public void setIdReporteAccidente(int idReporteAccidente) {
        this.idReporteAccidente = idReporteAccidente;
    }


    public String getFecha() {
        return fecha;
    }


    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getLabor() {
        return labor;
    }


    public void setLabor(String labor) {
        this.labor = labor;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    @Override
    public String toString() {
        return "ReporteAccidente [idReporteAccidente=" + idReporteAccidente + ", fecha=" + fecha + ", direccion="
                + direccion + ", labor=" + labor + ", descripcion=" + descripcion + "]";
    }
    
    
    
}


 