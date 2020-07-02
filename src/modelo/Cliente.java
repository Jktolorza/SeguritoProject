package modelo;

public class Cliente {
    
    private int id;
    private String nombreEmpresa;
    private String rut;
    private String fechaRegistro;
    
    
    
    public Cliente(String nombreEmpresa, String rut, String fechaRegistro) {
        this.nombreEmpresa = nombreEmpresa;
        this.rut = rut;
        this.fechaRegistro = fechaRegistro;
    }



    public Cliente() {
        super();
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getNombreEmpresa() {
        return nombreEmpresa;
    }



    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }



    public String getRut() {
        return rut;
    }



    public void setRut(String rut) {
        this.rut = rut;
    }



    public String getFechaRegistro() {
        return fechaRegistro;
    }



    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }



    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nombreEmpresa=" + nombreEmpresa + ", rut=" + rut + ", fechaRegistro="
                + fechaRegistro + "]";
    }
    
    
    
   
}

