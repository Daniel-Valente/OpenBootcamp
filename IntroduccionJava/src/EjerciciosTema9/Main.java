package EjerciciosTema9;

public class Main {
    public static void main(String[] args) {
        Cliente myCliente = new Cliente();

        myCliente.setNombre("Daniel Valente");
        myCliente.setEdad(22);
        myCliente.setTelefono("3321081459");
        myCliente.setCredito(3360.78);

        System.out.println("El cliente es:");
        System.out.println("Nombre: " + myCliente.getNombre());
        System.out.println("Edad: " + myCliente.getEdad());
        System.out.println("Telefono: " + myCliente.getTelefono());
        System.out.println("El credito es: " + myCliente.getCredito());

        Trabajador myTrabajador = new Trabajador();
        myTrabajador.setNombre("Daniel Valente");
        myTrabajador.setEdad(22);
        myTrabajador.setTelefono("3321081459");
        myTrabajador.setSalario(3000.78);

        System.out.println("\n El trabajador es:");
        System.out.println("Nombre: " + myTrabajador.getNombre());
        System.out.println("Edad: " + myTrabajador.getEdad());
        System.out.println("Telefono: " + myTrabajador.getTelefono());
        System.out.println("El salario es: " + myTrabajador.getSalario() + " al mes");
    }
}
