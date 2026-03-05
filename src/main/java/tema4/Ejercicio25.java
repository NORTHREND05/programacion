package tema4;

import static mislibrerias.EntradaDatos.*;
import static mislibrerias.Figuras.*;

public class Ejercicio25 {
    public static void main(String[] args) {
        int n = getPositiveNumberEImpar("Introduce un numero positivo e impar: ", "No es positivo o impar");
        System.out.print(romboVacio(n));
    }
}