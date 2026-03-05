package tema5;

import static mislibrerias.Figuras.*;

public class Ejercicio17 {
    // Función que llama a otra iterativa para hacer la figura
    public static String mostrarFiguraEj17Recursiva(int n) {
        int alto = n/2 + 1, cont1 = n/2, cont2 = 1;
        return figuraEj17Recursiva(alto, cont1, cont2);
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.print(mostrarFiguraEj17Recursiva(n));
    }
}
