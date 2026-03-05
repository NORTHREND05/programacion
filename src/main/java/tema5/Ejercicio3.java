package tema5;

import static mislibrerias.EntradaDatos.*;
import static mislibrerias.Matematicas.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        int n;
        long factorial;

        n = getPositiveNumberOrZero("Numero: ", "ENTRADA INCORRECTA!!!");

        factorial = getFactorial(n);
        System.out.println(factorial);
    }
}
