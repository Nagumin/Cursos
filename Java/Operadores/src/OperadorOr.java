public class OperadorOr {
    public static void main(String[] args) {
        System.out.println("**** Operador Or ****");
        boolean a = false, b = true;

        // or (regresa true si cualquiera de los valores es true)
        var resultado = a || b; // caracter pipe
        System.out.println("resultado = " + resultado);
    }
}
