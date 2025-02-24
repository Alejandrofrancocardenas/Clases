import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Guarderia guarderia = new Guarderia("Guardería Pequeños Gigantes", 123456);
        String opcion;

        do {
            opcion = JOptionPane.showInputDialog(
                    "--- MENÚ DE GUARDERÍA ---\n" +
                            "1. Agregar Matriculado\n" +
                            "2. Eliminar Matriculado\n" +
                            "3. Actualizar Matriculado\n" +
                            "4. Matriculados mayores a 5 años\n" +
                            "5. Listar Matriculados\n" +
                            "6. Salir\n" +
                            "Seleccione una opción:"
            );

            if (opcion == null) break; // Si el usuario presiona cancelar

            switch (opcion) {
                case "1":
                    // Agregar Matriculado
                    String nombre = JOptionPane.showInputDialog("Nombre:");
                    String edadStr = JOptionPane.showInputDialog("Edad:");
                    int edad = Integer.parseInt(edadStr);

                    String genero = JOptionPane.showInputDialog("Género:");
                    String documento = JOptionPane.showInputDialog("Documento:");
                    String alergias = JOptionPane.showInputDialog("Alergias:");
                    String nombreAcudiente = JOptionPane.showInputDialog("Nombre del acudiente:");
                    String numeroContacto = JOptionPane.showInputDialog("Número de contacto:");

                    Matriculados nuevo = new Matriculados(nombre, edad, genero, documento, alergias, nombreAcudiente, numeroContacto);
                    guarderia.agregarMatriculados(nuevo);
                    JOptionPane.showMessageDialog(null, "¡Matriculado agregado con éxito!");
                    break;

                case "2":
                    // Eliminar Matriculado
                    String docEliminar = JOptionPane.showInputDialog("Ingrese el documento del matriculado a eliminar:");
                    Matriculados encontrado = null;

                    for (Matriculados m : guarderia.getListMatriculados()) {
                        if (m.getdocumento().equals(docEliminar)) {
                            encontrado = m;
                            break;
                        }
                    }

                    if (encontrado != null) {
                        guarderia.eliminarMatriculados(encontrado);
                        JOptionPane.showMessageDialog(null, "¡Matriculado eliminado con éxito!");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró un matriculado con ese documento.");
                    }
                    break;

                case "3":
                    // Actualizar Matriculado
                    String docActualizar = JOptionPane.showInputDialog("Ingrese el documento del matriculado a actualizar:");
                    Matriculados actualizar = null;

                    // Buscar el matriculado a actualizar
                    for (Matriculados m : guarderia.getListMatriculados()) {
                        if (m.getdocumento().equals(docActualizar)) {
                            actualizar = m;
                            break;
                        }
                    }

                    if (actualizar != null) {
                        JOptionPane.showMessageDialog(null, "Ingrese los nuevos datos del matriculado:");

                        actualizar.setnombre(JOptionPane.showInputDialog("Nuevo nombre:"));
                        String nuevaEdadStr = JOptionPane.showInputDialog("Nueva edad:");
                        actualizar.setEdad(Integer.parseInt(nuevaEdadStr));

                        actualizar.setGenero(JOptionPane.showInputDialog("Nuevo género:"));
                        actualizar.setAlergias(JOptionPane.showInputDialog("Nuevas alergias:"));
                        actualizar.setnombreAcudiente(JOptionPane.showInputDialog("Nuevo nombre del acudiente:"));
                        actualizar.setNumeroContacto(JOptionPane.showInputDialog("Nuevo número de contacto:"));

                        guarderia.actualizarMatriculados(actualizar);
                        JOptionPane.showMessageDialog(null, "¡Matriculado actualizado con éxito!");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró un matriculado con ese documento.");
                    }
                    break;

                case "4":
                    // Matriculados mayores a 5 años
                    StringBuilder mayores = new StringBuilder("--- Matriculados mayores a 5 años ---\n");
                    boolean haymayores = false;

                    for (Matriculados m : guarderia.getListMatriculados()) {
                        if (m.getEdad() >= 5) {
                            mayores.append(m).append("\n");
                            haymayores = true;
                        }
                    }

                    if (haymayores) {
                        JOptionPane.showMessageDialog(null, mayores.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay matriculados mayores a cinco años.");
                    }
                    break;

                case "5":
                    // Listar Matriculados
                    StringBuilder lista = new StringBuilder("--- Lista de Matriculados ---\n");
                    for (Matriculados m : guarderia.getListMatriculados()) {
                        lista.append(m).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, lista.toString());
                    break;

                case "6":
                    JOptionPane.showMessageDialog(null, "¡Gracias por usar el sistema de guardería!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (!"6".equals(opcion));
    }
}
