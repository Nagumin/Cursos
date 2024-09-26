import java.util.Scanner;

public class SentenciaIf {
    public static void main(String[] args) {
        // Uso de la sentencia if
        var consola = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(consola.nextLine());

        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        } else if (edad >= 13) {
            System.out.println("Eres un adolescente");
        } else{
            System.out.println("Eres un niño");
        }
    }
}
