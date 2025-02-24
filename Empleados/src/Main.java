//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Empleados newEmpleado = new Empleados("alejandro", "123",
                "estudiante", "asd@gmail.com",
                "123", "12 de abril");

        System.out.println("Nombre completo: "+ newEmpleado.getnombreCompleto());
        System.out.println("Numero identificacion: "+newEmpleado.getidentificacion());
        System.out.println("Puesto: "+newEmpleado.getpuesto());
        System.out.println("Correo electronico: "+newEmpleado.getcorreoElectronico());
        System.out.println("Numero de telefono: "+newEmpleado.getnumeroTelefono());
        System.out.println("Fecha de contratacion: "+newEmpleado.getfechaContratacion());


    }
}



