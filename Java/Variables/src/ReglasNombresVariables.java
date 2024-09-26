public class ReglasNombresVariables {
    public static void main(String[] args) {
        //Reglas nombres variables
        String nombreCompleto = "Jose Manuel"; // Correcto, y buenas prácticas
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Elisabeth"; // Correcto, no aplica las buenas prácticas
        System.out.println("NombreCompleto = " + NombreCompleto);
        //String nombre-cliente= "Manuel"; // Incorrecto
        String nombre_cliente = "Manuel"; // Correcto, no aplica buenas prácticas
        String _apellido = "Perilla"; // Correcto y aceptable
        String $apellido = "Peña"; // Correcto y aceptable
        int totPzs = 10; // Correcto, no aplica buenas prácticas
        int totalPiezas = 10; // Correcto, aplica las buenas prácticas
        boolean casado = true; //Correcto, aún puede mejorar
        boolean esCasado = true; // Correcto, aplica las buenas prácticas
        boolean isCasado = true; // Correcto, aplica las buenas prácticas *
        boolean tieneSaldo = true;// Correcto, aplica las buenas prácticas
        boolean hasSaldo = true;// Correcto, aplica las buenas prácticas *
    }
}
