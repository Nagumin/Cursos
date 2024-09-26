import java.util.Scanner;

public class VerificadorDePalindromos {
    public static void main(String[] args) {
        //Ejercicio 2: Verificador de Palíndromos
        //Tema: Manejo de cadenas.
        //Requerimiento: Desarrolla un programa que verifique si una palabra es un palíndromo (una palabra que se lee igual de adelante hacia atrás).

        //El usuario debe ingresar una palabra.
        //El programa debe ignorar las mayúsculas/minúsculas y verificar si la palabra es un palíndromo.
        //Imprime "Es un palíndromo" o "No es un palíndromo" según corresponda.

        // Crear el objeto Scanner para leer la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Solicitar al usuario que introduzca una palabra
        System.out.print("Ingrese una palabra: ");
        String palabra = entrada.nextLine();

        // Convertir la palabra a minúsculas para evitar diferencias por mayúsculas
        palabra = palabra.toLowerCase();

        // Invertir la palabra
        String palabraInvertida = new StringBuilder(palabra).reverse().toString();

        // Verificar si la palabra original es igual a la palabra invertida
        if (palabra.equals(palabraInvertida)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }

        entrada.close();

    }
}
