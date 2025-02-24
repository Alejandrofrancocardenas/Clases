public class Matriculados {

    private String nombre;
    private int edad;
    private String genero;
    private String documento;
    private String alergias;
    private String nombreAcudiente;
    private String numeroContacto;

    // constructor
    public Matriculados(String nombre, int edad, String genero, String documento, String alergias, String nombreAcudiente, String numeroContacto ) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.documento = documento;
        this.alergias = alergias;
        this.nombreAcudiente = nombreAcudiente;
        this.numeroContacto = numeroContacto;

    }
    //getters y setters
    public String getnombre() {
        return nombre;
    }
    public void setnombre(String nombre) {
        this.nombre = nombre;

    }
    public int getEdad() {
        return edad;

    }
    public void setEdad(int edad) {

        this.edad = edad;
    }
    public String getGenero() {
        return genero;

    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getDocumento() {

        return documento;
    }
    public void setDocumento(String documento){
        this.documento = documento;
    }
    public String getAlergias() {
        return alergias;
    }
    public void setAlergias(String alergias){
        this.alergias = alergias;

    }
    public String getnombreAcudiente(){
        return nombreAcudiente;

    }
    public void setnombreAcudiente(String nombreAcudiente){
        this.nombreAcudiente = nombreAcudiente;
    }
    public String getNumeroContacto(){
        return numeroContacto;

    }
    public void setNumeroContacto(String numeroContacto){
        this.numeroContacto = numeroContacto;

    }

    @Override
    public String toString() {
        return "Matriculado {" +
                "nombre: '" + nombre + '\n' +
                ", edad: " + edad +
                ", genero: '" + genero + '\n' +
                ", documento: '" + documento + '\n' +
                ", alergias: '" + alergias + '\n' +
                ", nombreAcudiente: '" + nombreAcudiente + '\n' +
                ", numeroContacto: '" + numeroContacto + '\n' +
                '}';
    }
}

