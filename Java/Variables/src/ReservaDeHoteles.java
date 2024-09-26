public class ReservaDeHoteles {
    public static void main(String[] args) {
        //Imprimir nombre del programa
        System.out.println("**** Sistema de Reserva de Hoteles ****");

        // Variables
        String nombreCliente;
        int diasEstancia;
        double tarifaDiaria;

        // Asignación de Valores
        nombreCliente = "Jose Manuel";
        diasEstancia = 10;
        tarifaDiaria = 1692.10;

        // Imprimir los valores asignados
        System.out.println("\nNombre de Cliente = " + nombreCliente);
        System.out.println("Días de Estancia = " + diasEstancia);
        System.out.println("Tarifa Diaria = " + tarifaDiaria);
        System.out.println("Con Vista al Mar = " + true);

        // Modificar valores
        nombreCliente = "Elisabeth García";
        diasEstancia = 20;
        tarifaDiaria = 1202.10;

        // Imprimir los valores nuevos
        System.out.println("\n---------------***-----------------");
        System.out.println("\nNombre de Cliente = " + nombreCliente);
        System.out.println("Días de Estancia = " + diasEstancia);
        System.out.println("Tarifa Diaria = " + tarifaDiaria);
        System.out.println("Con Vista al Mar = " + false);

    }
}
