package tema4;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        // Variables
        Scanner t = new Scanner(System.in);
        short numSolicitado;
        short num;
        // Campo solicitado
        System.out.print("Introduce un numero: ");
        numSolicitado = t.nextByte();
        // Bucle para los números positivos
        for (num = 1; num < numSolicitado; num++) {
            System.out.printf("%d,", num);
        }
        // Bucle para los números negativos
        for (num = numSolicitado; num < 0; num++) {
            System.out.printf("%d,", num);
        }
        System.out.printf("%d.\n", num);
    }
}
