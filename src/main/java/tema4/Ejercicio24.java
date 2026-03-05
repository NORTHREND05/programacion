package tema4;

import static mislibrerias.EntradaDatos.*;
import static mislibrerias.Matematicas.*;

public class Ejercicio24 {
    public static void main(String[] args) {
        //Variables
        int b = getPositiveNumber("Introduce un numero entero positivo: ", "Error. No entero positivo.");
        int e = getPositiveNumber("Introduce un numero entero positivo: ", "Error. No entero positivo.");
        // Resultado con llamada a una funcion
        System.out.printf("\nEl resultado de %d elevado a %d es: %d\n", b, e, potenciaConSumaRec(b, e));
    }
}
