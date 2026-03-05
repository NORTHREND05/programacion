package tema5;

import java.util.Scanner;

public class Ejercicio1 {
    // Función que devuelve el máximo
    public static int obtenMax(int n1, int n2) {
        int maximo = n1 < n2 ? n2 : n1;
        return maximo;
    }
    public static void main(String[] args) {
        // Variables
        Scanner t = new Scanner(System.in);
        int n1, n2, maximo;
        // Solicitud
        System.out.print("Introduce dos numeros enteros(separados por un espacio): ");
        n1 = t.nextInt();
        n2 = t.nextInt();
        // Resultado obtenido llamando a la función obtenMax
        maximo = obtenMax(n1, n2);
        System.out.println(maximo);
    }
}
