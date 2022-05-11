package EjerciciosTema9;

public class Trabajador extends Persona{
    private double salario;

    public double getSalario() { return salario; }

    public boolean setSalario(double salario) {
        if (salario > 0){
            this.salario = salario;
            return true;
        } else
            return false;
    }
}
