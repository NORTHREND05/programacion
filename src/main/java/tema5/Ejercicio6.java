package tema5;

import static mislibrerias.Matematicas.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        int n = 211;
        boolean esPrimo = esPrimo(n);
        if(esPrimo) {
            System.out.printf("%d es primo\n", n);
        } else {
            System.out.printf("%d no es primo\n", n);
        }
    }
}
