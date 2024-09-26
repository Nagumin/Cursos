import java.util.Scanner;

public class CalculadoraDePropinas {
    public static void main(String[] args) {
        //Ejercicio 1: Calculadora de Propinas
        //Tema: Variables, Entrada de datos por consola, Operadores.
        //Requerimiento: Crea un programa que calcule el monto de una propina a partir de un total de consumo. El programa debe:

        //Pedir el monto total de la cuenta (entrada por consola).
        //Pedir el porcentaje de propina que desea dejar el usuario.
        //Calcular el monto de la propina y el total a pagar (monto + propina).
        //Mostrar ambos resultados en pantalla.

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el monto total de la cuenta: ");
        double montoTotalCuenta = Double.parseDouble(entrada.nextLine());

        System.out.print("Introduce el porcentaje de propina que deseas dejar: ");
        int porcentajePropina = Integer.parseInt(entrada.nextLine());

        entrada.close();

        double montoPropina =(montoTotalCuenta*porcentajePropina)/100;
        double totalAPagar = (montoTotalCuenta + montoPropina);

        System.out.println("Monto de la propina: $" + montoPropina);
        System.out.println("Total a pagar: $" + totalAPagar);

    }
}
