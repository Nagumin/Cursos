import java.util.Scanner;

public class formatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        while (sc.hasNext()) {
            String texto = sc.next();
            int numero = sc.nextInt();

            // Imprimir con formato
            System.out.printf("%-15s%03d%n", texto, numero);
        }
        System.out.println("---------------------------------------");
}
}