import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {

        //Imprimir nombre del programa
        System.out.println("**** Recetas de Cocina ****");

        // Declaración de variables
        var consola = new Scanner(System.in);

        // Nombre de la receta
        System.out.print("\nIngresa el nombre de la receta: ");
        var nombreReceta = consola.nextLine();

        // Ingredientes de la receta
        System.out.print("Ingresa los ingredientes separados por (,): ");
        var ingredientes = consola.nextLine();

        // Tiempo de preparación (min)
        System.out.print("Ingresa el tiempo de preparación en minutos: ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        // Dificultad de la receta
        System.out.print("Ingresa la dificultad de la receta (Fácil/Medio/Difícil): ");
        var dificultadReceta = consola.nextLine();

        // Imprimir los datos en consola
        System.out.println("\n--- Receta de Cocina ---");
        System.out.println("\tNombre de la receta: " + nombreReceta);
        System.out.println("\tIngredientes: " + ingredientes);
        System.out.println("\tTiempo de preparacion: " + tiempoPreparacion + " minutos");
        System.out.println("\tDificultad de la receta: " + dificultadReceta);

    }
}
