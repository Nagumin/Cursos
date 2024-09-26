public class TiendaEnLinea {
    public static void main(String[] args) {

        System.out.println("**** Tienda En Linea (Detalle Producto) ****");

        // Declaración de variables
        String nombreProducto;
        double precio;
        int cantidadProductos;
        boolean productoDisponible; // true para Disponible, false para no disponible

        // Asignación de valores
        nombreProducto = "Camiseta Adidas Arsenal FC";
        precio = 91.67;
        cantidadProductos = 3;
        productoDisponible = true;

        // Imprimir el valor de cada variable
        System.out.println("\n Producto = " + nombreProducto);
        System.out.println("Precio = €" + precio);
        System.out.println("Cantidad de Productos = " + cantidadProductos);
        System.out.println("Producto Disponible = " + productoDisponible);

        // Modificar valor de cada variable
        nombreProducto = "Camiseta Nike Liverpool FC";
        precio = 112.14;
        cantidadProductos = 15;
        productoDisponible = false;

        // Imprimir los valores modificados
        System.out.println("\n ****");
        System.out.println("\nProducto = " + nombreProducto);
        System.out.println("Precio = €" + precio);
        System.out.println("Cantidad de Productos = " + cantidadProductos);
        System.out.println("Producto Disponible = " + productoDisponible);
    }
}
