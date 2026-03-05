package tema4;

import static mislibrerias.EntradaDatos.*;
import static mislibrerias.Matematicas.*;

public class Ejercicio23 {
    public static void main(String[] args) {
        //Variables
        int n1 = getPositiveNumber("Introduce un numero entero positivo: ", "Error. No entero positivo.");
        int n2 = getPositiveNumber("Introduce un numero entero positivo: ", "Error. No entero positivo.");
        // Resultado con llamada a una funcion
        System.out.printf("\nEl producto de %dx%d es: %d\n", n1, n2, multiplicarConSuma(n1, n2));
    }
}
