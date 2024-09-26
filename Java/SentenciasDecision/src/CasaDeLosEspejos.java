import java.util.Scanner;

public class CasaDeLosEspejos {
    public static void main(String[] args) {
        System.out.println("**** Bienvenidos a la Casa de los Espejos ****");

        Scanner consola = new Scanner(System.in);

        System.out.print("Cuál es tu edad?: ");
        int edad = consola.nextInt();

        System.out.println("Tienes miedo a la oscuridad (true/false)?: ");
        boolean tienesMiedoOscuridad = consola.nextBoolean();

        //Verificación
        if (!tienesMiedoOscuridad && edad >= 10) {
            System.out.println("Puedes entrar a la Casa de los Espejos.");
        }
        else{
            System.out.println("Lo siento, la Casa de los Espejos podría darte miedo");
        }
    }
}
