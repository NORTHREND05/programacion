package tema4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Variables
        Scanner t = new Scanner(System.in);
        short numSolicitado;
        short num;
        // Campo solicitado y validación
    	do {
            System.out.print("Introduce un numero positivo > 0: ");
            numSolicitado = t.nextByte();
            if (numSolicitado < 1) {
                System.out.println("Error");
            }
        } while (numSolicitado < 1);
        // Solución mía que funciona pero no está optimizada
//        for (num = 1; num <= numSolicitado; num++) {
//            if (num == numSolicitado) {
//                System.out.printf("%d.", num);
//            } else {
//                System.out.printf("%d,", num);
//            }
//        }
        // Solución propuesta por el profesor, más corta y eficiente
//        while(num < numSolicitado) {
//            System.out.printf("%d,", num);
//            num++;
//        }
//        System.out.printf("%d.\n", numSolicitado);
        // Optimización de mi solución
        for (num = 1; num < numSolicitado; num++) {
            System.out.printf("%d,", num);
        }
        System.out.printf("%d.\n", numSolicitado);
    }
}