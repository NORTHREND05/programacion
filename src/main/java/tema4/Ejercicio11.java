package tema4;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        byte nota, contador = 0;
        // Solución obtenida con ayuda del profesor
        for (int i = 1; i <= 5; i++) {
            do {
                System.out.printf("Introduce nota %d: ", i);
                nota = t.nextByte();
            } while (nota < 0 || nota > 10);
            if (nota < 5) {
                contador++;
            }
        }
        if (contador > 0) {
            System.out.printf("Hay %d suspenso/s :(\n", contador);
        } else {
            System.out.println("Que gran trabajo el de este grupo!!!");
        }
    }
}
