public class Empleados {
    private String nombreCompleto;
    private String identificacion;
    private String puesto;
    private String correoElectronico;
    private String numeroTelefono;
    private String fechaContratacion;


    public Empleados(String nombreCompleto, String identificacion,
                     String puesto, String correoElectronico, String numeroTelefono,
                     String fechaContratacion) {

        this.nombreCompleto = nombreCompleto;
        this.identificacion = identificacion;
        this.puesto = puesto;
        this.correoElectronico = correoElectronico;
        this.numeroTelefono = numeroTelefono;
        this.fechaContratacion = fechaContratacion;

    }

    public String getnombreCompleto() {
        return nombreCompleto;

    }

    public void setnombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;

    }

    public String getidentificacion() {
        return identificacion;

    }

    public void setidentificacion(String identificacion) {
        this.identificacion = identificacion;

    }

    public String getpuesto() {
        return puesto;

    }

    public void setpuesto(String puesto) {
        this.puesto = puesto;

    }

    public String getcorreoElectronico() {
        return correoElectronico;

    }

    public void setcorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;

    }

    public String getnumeroTelefono() {
        return numeroTelefono;

    }

    public void setnumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;

    }

    public String getfechaContratacion() {
        return fechaContratacion;

    }
    public void setfechaContratacion(String fechaContratacion){
        this.fechaContratacion=fechaContratacion;
    }
}
