package tema5;

import mislibrerias.EntradaDatos;
import static mislibrerias.Matematicas.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        int n = EntradaDatos.getPositiveNumberOrZero("Introduce un numero no negativo: ", "Error. Prueba otra vez");
        System.out.println(sumaDivisores(n));
    }
}
