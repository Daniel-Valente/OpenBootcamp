package EjerciciosTema9;

public class Cliente extends Persona{
    private double credito;

    public double getCredito() { return credito; }

    public boolean setCredito(double credito) {
        if (credito > 0){
            this.credito = credito;
            return true;
        } else
            return false;
    }
}
