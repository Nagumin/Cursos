import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("Ingrese un número entero positivo: ");
        var consola = new Scanner(System.in);
        int n = Integer.parseInt(consola.nextLine());

        if (n%2!=0){
            System.out.print("Weird");
        }else if (n >= 2 && n <= 5){
            System.out.print("Not Weird");
        } else if (n >= 6 && n <= 20) {
            System.out.print("Weird");
        }else if (n > 20) {
            System.out.print("Not Weird");
        }

    }
}