public class Matriculados {
    private String nombre;
    private int edad;
    private String genero;
    private String documento;
    private String alergias;
    private String nombreAcudiente;
    private String numeroContacto;

    public Matriculados(String nombre, int edad, String genero, String documento, String alergias, String nombreAcudiente, String numeroContacto) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.documento = documento;
        this.alergias = alergias;
        this.nombreAcudiente = nombreAcudiente;
        this.numeroContacto = numeroContacto;
    }

    // Getters
    public String getnombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public String getdocumento() {
        return documento;
    }

    public String getAlergias() {
        return alergias;
    }

    public String getnombreAcudiente() {
        return nombreAcudiente;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    // Setters
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public void setnombreAcudiente(String nombreAcudiente) {
        this.nombreAcudiente = nombreAcudiente;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }



}
