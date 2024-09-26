public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de Datos en Java

        // Enteros (su valor por default es 0)
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);

        short tipoShort = 32767;
        System.out.println("tipoShort = " + tipoShort);

        int tipoInt = 84932767;
        System.out.println("tipoInt = " + tipoInt);

        long tipoLong = 9223372036854775807L;
        System.out.println("tipoLong = " + tipoLong); // L o l para indicar tipo long

        // Punto flotante (su valor por default es de 0.0)
        float tipoFloat = 3.14159265F;
        System.out.println("tipoFloat = " + tipoFloat); // F o f para indicar tipo float

        double tipoDouble = 3.14159265D;
        System.out.println("tipoDouble = " + tipoDouble); // D o d para indicar tipo double (opcional)

        // Caracter (Valor por default '\u0000')
        char tipoChar = 'A'; // Caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        // Booleano (Valor por default = false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        // Tipos Object (Referencia)
        String nombre = null; // Valor por default
        System.out.println("nombre = " + nombre);
        nombre = "Jose Manuel";
        System.out.println("nombre = " + nombre);
    }
}
