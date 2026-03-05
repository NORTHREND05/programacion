package tema5;

import static mislibrerias.Matematicas.*;

public class Ejercicio16 {
    // funcion que devuelve la función recursiva dando parametros para hacer la tabla
    public static String mostrarTablaMultiplicar(int n) {
        return tablaMultiplicar(n, 1, n);
    }
    public static void main(String[] args) {
        int n = 15;
        System.out.println(mostrarTablaMultiplicar(n));
    }
}
