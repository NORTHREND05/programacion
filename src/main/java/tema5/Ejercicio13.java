package tema5;

import static mislibrerias.EntradaDatos.*;
import static mislibrerias.Matematicas.*;

public class Ejercicio13 {
    public static void main(String[] args) {
        int n = getPositiveNumber("Introduce un numero entero positivo: ", "No es entero positivo");
        listaDescendiente(n);
    }
}
