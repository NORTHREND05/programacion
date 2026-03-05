package tema5;

import static mislibrerias.Matematicas.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        boolean esDivisor = esDivisor(10, 4);
        if (esDivisor) {
            System.out.printf("Es divisor.");
        } else {
            System.out.printf("No es divisor.");
        }
        System.out.println();
    }
}
