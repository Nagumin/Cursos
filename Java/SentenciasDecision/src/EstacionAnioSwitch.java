import java.util.Scanner;

public class EstacionAnioSwitch {
    public static void main(String[] args) {
        System.out.println("Proporciona el valor del mes (1-12): ");
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();

        var estacion = switch (mes){
            case 1, 2, 12 -> "Invierno";
            case 3, 4, 5 -> "Primavera";
            case 6, 7, 8 -> "Verano";
            case 9, 10, 11 ->"Otoño";
            default -> "Estación desconocida";
        };

        // Imprimimos el resultado
        System.out.println("La estación para el mes " + mes + " es " + estacion);
    }
}
