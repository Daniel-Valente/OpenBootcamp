package EjerciciosTema3;

public class main {
    public static void main(String[] args) {
        int resultado = 0;
        resultado = suma(4, 6, 7);
        System.out.println("La suma de los 3 parametros es " + resultado);

        Coche miCoche = new Coche();
        miCoche.sumaPuertas();
        miCoche.sumaPuertas();
        System.out.println("El numero de puertas del coche es " + miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}
