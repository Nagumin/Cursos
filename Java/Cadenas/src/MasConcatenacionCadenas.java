public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        // Más formas de concatenar cadenas en Java
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 usando + = " + cadena3);

        // Método concat
        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 usando concat = " + cadena3);

        // StringBuilder
        var constructorCadenas = new StringBuilder();
//        constructorCadenas.append(cadena1);
//        constructorCadenas.append(" ");
//        constructorCadenas.append(cadena2);
        constructorCadenas.append("Hola").append(" ").append("Mundo");
        var resultado = constructorCadenas.toString();
        System.out.println("resultado String Builder = " + resultado);

        // StringBuffer
        var stringBuffer = new StringBuilder();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("resultado String Buffer = " + resultado);

        // join
        resultado = String.join(" ", cadena1, cadena2, "Adios!");
        System.out.println("resultado join = " + resultado);

    }
}
