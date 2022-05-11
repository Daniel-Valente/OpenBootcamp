package EjerciciosTema8;

public class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() { return edad; }
    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }

    public boolean setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
            return true;
        } else
            return false;
    }

    public boolean setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setTelefono(String telefono) {
        if (!telefono.isEmpty()) {
            this.telefono = telefono;
            return true;
        } else
            return false;
    }
}
