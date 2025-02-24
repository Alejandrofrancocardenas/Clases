import java.util.ArrayList;

public class Guarderia {
    private String nombreG;
    private int nit;
    public ArrayList<Matriculados> listMatriculados;

    public Guarderia(String nombreG, int nit) {
        this.nombreG = nombreG;
        this.nit = nit;
        this.listMatriculados = new ArrayList<>();
    }

    public void agregarMatriculados(Matriculados matriculado) {
        if (matriculado != null) {
            listMatriculados.add(matriculado);
        } else {
            System.out.println("No se puede agregar un matriculado nulo.");
        }
    }

    public void eliminarMatriculados(Matriculados matriculado) {
        listMatriculados.remove(matriculado);
    }

    public void actualizarMatriculados(Matriculados matriculado) {
        for (Matriculados indexMatriculados : listMatriculados) {
            if (indexMatriculados.getdocumento().equals(matriculado.getdocumento())) {
                indexMatriculados.setnombre(matriculado.getnombre());
                indexMatriculados.setEdad(matriculado.getEdad());
                indexMatriculados.setGenero(matriculado.getGenero());
                indexMatriculados.setAlergias(matriculado.getAlergias());
                indexMatriculados.setnombreAcudiente(matriculado.getnombreAcudiente());
                indexMatriculados.setNumeroContacto(matriculado.getNumeroContacto());
                break;
            }
        }
    }

    public void listarMatriculados() {
        if (listMatriculados.isEmpty()) {
            System.out.println("No hay matriculados en la guardería.");
        } else {
            for (Matriculados matriculado : listMatriculados) {
                System.out.println(matriculado);
            }
        }
    }

    public ArrayList<Matriculados> getListMatriculados() {
        return listMatriculados;
    }
}
