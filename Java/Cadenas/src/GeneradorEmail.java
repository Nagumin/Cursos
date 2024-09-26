public class GeneradorEmail {
    public static void main(String[] args) {
        // Declaración de variables
        String nombreCorreo = "Jose Manuel Perilla";
        String empresa = "Cisco Academy";
        String dominio = "edu.co";

        // Normalización de nombre y empresa (minúsculas y reemplazo de espacios)
        String nombreMinusculas = nombreCorreo.toLowerCase().replaceAll(" ", ".");
        String empresaMinusculas = empresa.toLowerCase().replaceAll(" ", "");

        // Salida de información del usuario
        System.out.println("**** Generador de Email ****");
        System.out.println("\nNombre usuario: " + nombreCorreo);
        System.out.println("Nombre usuario normalizado: " + nombreMinusculas);

        // Salida de información de la empresa
        System.out.println("\nNombre empresa: " + empresa);
        System.out.println("Extensión del dominio: " + dominio);
        System.out.println("Dominio de email normalizado: " + empresaMinusculas + "." + dominio);

        // Generación del email final
        System.out.println("\nEmail final generado: " + nombreMinusculas + "@" + empresaMinusculas + "." + dominio);
    }
}
