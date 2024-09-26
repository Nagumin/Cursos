import java.util.Scanner; // Importa la clase Scanner para permitir la entrada de datos del usuario.

public class TiendaOnline { // Declara la clase TiendaOnline.
    public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa.

        System.out.println("**** Tienda Online con Descuentos ****"); // Imprime el título de la tienda online.

        double minCompraDescDiez = 1000; // Define el monto mínimo para aplicar un descuento del 10%.

        Scanner entrada = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario.

        System.out.print("\nIngrese el valor total de la compra: "); // Solicita al usuario el monto total de la compra.
        double total = entrada.nextDouble(); // Lee el valor ingresado y lo almacena en la variable total.

        System.out.print("Es usted miembro de la tienda? (true/false): "); // Pregunta al usuario si es miembro de la tienda.
        boolean miembro = entrada.nextBoolean(); // Lee la respuesta del usuario (true o, false) y la almacena en la variable miembro.

        double montoFinal = total; // Inicializa la variable montoFinal con el total de la compra.

        // Comprueba si el total de la compra es mayor que el mínimo y si el usuario es miembro.
        if (total > minCompraDescDiez && miembro) {
            montoFinal *= 0.9; // Aplica un descuento del 10% multiplicando por 0.9.
            System.out.println("\nFelicidades, has obtenido un descuento del 10%"); // Informa al usuario sobre el descuento obtenido.
        }
        // Comprueba si el usuario es miembro, sin necesidad de que la compra sea mayor al mínimo.
        else if (miembro) {
            montoFinal *= 0.95; // Aplica un descuento del 5% multiplicando por 0.95.
            System.out.println("\n¡Felicidades, has obtenido un descuento del 5%!"); // Informa al usuario sobre el descuento obtenido.
        }
        // Si el usuario no es miembro, muestra un mensaje invitándolo a hacerse miembro.
        else {
            System.out.println("\n**** Te invitamos a hacerte miembro de la tienda ****"); // Mensaje informativo.
        }

        // Muestra el monto total de la compra antes de aplicar descuentos, formateado a dos decimales.
        System.out.printf("\nMonto de la compra: $%.2f%n", total);
        // Muestra el monto final de la compra después de aplicar descuentos, formateado a dos decimales.
        System.out.printf("Monto final de la compra: $%.2f%n", montoFinal);
    }
}