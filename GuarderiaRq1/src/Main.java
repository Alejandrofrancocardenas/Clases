

        import javax.swing.*;
        import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        int canMatriculados = 1;

        ArrayList<Matriculados> listaMatriculados = new ArrayList<>();

        Matriculados matriculado1 = new Matriculados("Juan Pérez", 10, "Masculino", "123456789", "Ninguna",
                "María Pérez", "3214567890");

        Matriculados matriculado2 = new Matriculados("Ana Gómez", 8, "Femenino", "987654321", "Polen",
                "Carlos Gómez", "3123456789");

        Matriculados matriculado3 = new Matriculados("Luis Rodríguez", 12, "Masculino", "456789123", "Mariscos",
                "Lucía Rodríguez", "3109876543");

        Matriculados matriculado4 = new Matriculados("Sofía Martínez", 9, "Femenino", "654321987", "Gluten",
                "Pedro Martínez", "3145678901");

        Matriculados matriculado5 = new Matriculados("Miguel Torres", 11, "Masculino", "789123456", "Lácteos",
                "Elena Torres", "3156789012");

        listaMatriculados.add(matriculado1);
        listaMatriculados.add(matriculado2);
        listaMatriculados.add(matriculado3);
        listaMatriculados.add(matriculado4);
        listaMatriculados.add(matriculado5);


        for (int i = 1; i < canMatriculados; i++) {
            // para poder pedir informacion JOptionPane

            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el edad del alumno"));
            String genero = JOptionPane.showInputDialog("Ingrese el genero del alumno");
            String documento = JOptionPane.showInputDialog("Ingrese el documento del alumno");
            String alergias = JOptionPane.showInputDialog("Ingrese el alergias");
            String nombreAcudiente = JOptionPane.showInputDialog("Ingrese el nombre del acudiente");
            String numeroContacto = JOptionPane.showInputDialog("Ingrese el numero del contacto");


            Matriculados newMatriculados = new Matriculados(nombre, edad, genero, documento, alergias,
                    nombreAcudiente, numeroContacto);

            JOptionPane.showMessageDialog(null, newMatriculados);
            listaMatriculados.add(newMatriculados);

        }

        JOptionPane.showMessageDialog(null, listaMatriculados);
    }
}

