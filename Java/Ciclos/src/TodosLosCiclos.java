public class TodosLosCiclos {
    public static void main(String[] args) {

        /* Ciclo for
        El ciclo for se utiliza cuando conoces el número de
        iteraciones que deseas realizar. */

        // Sintaxis
        /* for (inicialización; condición; incremento){
        //Código a ejecutar en cada iteración
        } */

        // Ejemplo
        for (int i = 0; i < 5; i++){
            System.out.println("Número: " + i);
        }

        /*Explicación:
        1. Inicialización: Aquí se declara la variable (por ejemplo, int i = 0).
        2. Condición: El ciclo continuará mientras esta condición sea true
           (en este casi, i > 5).
        3. Incremento: Al final de cada iteración, se incrementa i en 1. */

        // ------------------------------------------------------------------

        /* Ciclo while
        El ciclo while se utiliza cuando no sabes cuántas veces se ejecutará el
        ciclo y deseas que continúe mientras se cumpla una condición.*/

        //Sintaxis:

        // while (condición) {
        // Código a ejecutar mientras la condición sea verdadera
        // }

        // Ejemplo
        int i = 0;
        while (i < 5) {
            System.out.println("Número: " + i);
            i++;
        }

        /*Explicación:
        Este ciclo continuará ejecutándose mientras i sea menor que 5.
        Recuerda incrementar i dentro del ciclo; de lo contrario,
        se volverá un ciclo infinito.*/

        //-------------------------------------------------------------

        /* 3. Ciclo do-while
           El ciclo do-while es similar al while, pero garantiza que
            el bloque de código se ejecute al menos una vez.*/

        // Sintaxis
        // do {
             // Código a ejecutar
        // } while (condición);

        // Ejemplo:

        // int i = 0;
        do {
            System.out.println("Número: " + i);
            i++;
        } while (i < 5);

        /* Explicación:
        Aquí, el código dentro del do se ejecuta primero y luego se evalúa
        la condición. Si la condición es true, el ciclo se repetirá.*/

        //-------------------------------------------------------------

        /* 4. Ciclo for-each
           El ciclo for-each se utiliza principalmente para iterar
            sobre arreglos o colecciones (como listas o conjuntos). */

        // Sintaxis
        // for (tipo elemento : colección) {
             // Código a ejecutar para cada elemento
        // }

        // Ejemplo:

        String[] frutas = {"Manzana", "Banana", "Naranja"};
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }

        /*Explicación:
        En este caso, el ciclo recorre cada elemento del arreglo frutas y ejecuta
        el código para cada uno.*/

        /*Resumen

        for: Se utiliza cuando sabes cuántas veces quieres repetir algo.

        while: Se utiliza cuando no estás seguro de cuántas veces se debe ejecutar
        y solo se detiene cuando una condición ya no se cumple.

        do-while: Similar a while, pero se ejecuta al menos una vez.

        for-each: Ideal para recorrer elementos de colecciones o arreglos. */





    }
}
