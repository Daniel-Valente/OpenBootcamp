package EjerciciosTema4;

public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;

        if(numeroIf > 0) {
            System.out.println("El numero " + numeroIf + "es positivo");
        }
        else if(numeroIf == 0) {
            System.out.println("El numero es 0");
        }
        else {
            System.out.println("El numero " + numeroIf + " es negativo");
        }

        int numeroWhile = 0;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("En la condicion while el numero es " + numeroWhile);
        }

        numeroWhile = 0;

        do {
            numeroWhile++;
            System.out.println("En la condicion do-while el numero es " + numeroWhile);
        } while (numeroWhile < 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("En la condicion For el numero es " + numeroFor);
        }

        String estacion = "primavera";

        switch (estacion) {
            case "primavera":
                System.out.println("La estacion es " + estacion);
                break;
            case "verano":
                System.out.println("La estacion es " + estacion);
                break;
            case "otoño":
                System.out.println("La estacion es " + estacion);
                break;
            case "invierno":
                System.out.println("La estacion es " + estacion);
                break;
            default:
                System.out.println("No existe ninguna estacion con nombre " + estacion);
                break;
        }
    }
}
