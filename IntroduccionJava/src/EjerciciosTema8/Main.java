package EjerciciosTema8;

public class Main {
    public static void main(String[] args) {
        Persona miPersona = new Persona();

        miPersona.setEdad(22);
        miPersona.setNombre("Daniel Valente");
        miPersona.setTelefono("3321078940");

        System.out.println("Nombre de la persona: " + miPersona.getNombre());
        System.out.println("Edad: " + miPersona.getEdad());
        System.out.println("Telefono: " + miPersona.getTelefono());
    }
}
