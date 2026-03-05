package tema5;

import mislibrerias.EntradaDatos;
import static mislibrerias.Matematicas.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        int n;
        n = EntradaDatos.getPositiveNumberOrZero("Introduce un numero: ", "Error");
        getDivisores(n);
        System.out.println();
    }
}
