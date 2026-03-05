package tema5;

import static mislibrerias.EntradaDatos.*;
import static mislibrerias.Matematicas.*;

public class Ejercicio21 {
    public static void main(String[] args) {
        int n = getPositiveNumber("Introduce un numero entero positivo: ","Error. Ese no es entero positivo.");
        System.out.println(listaNumerosRec(n) + ".");
    }
}
