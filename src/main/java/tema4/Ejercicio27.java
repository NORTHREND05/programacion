package tema4;

import static mislibrerias.EntradaDatos.*;
import static mislibrerias.Figuras.*;
import static mislibrerias.Matematicas.*;

public class Ejercicio27 {
    public static void main(String[] args) {
        int n = getPositiveNumber("Introduce un numero entero positivo: ", "Error. No es entero positivo.");
        System.out.println(tableroAjedrez(n));
    }
}
