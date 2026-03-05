package tema4;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        byte n, cont1, cont2=1;
        do {
            System.out.print("Introduce un numero positivo e impar: ");
            n = t.nextByte();
            if(n<1 || n%2 == 0){
                System.out.println("Ha habido un error.");
            }
        } while (n<1 || n%2 == 0);
        cont1 = (byte) (n/2);
        for (int i = 0; i < n; i++) {
            // Imprimir espacios
            for (int j = 0; j < cont1; j++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int j = 0; j < cont2; j++) {
                System.out.print("*");
            }
            System.out.println();
            // Actualizar contadores
            if (i < n / 2) {
                cont1--;
                cont2 += 2;
            } else {
                cont1++;
                cont2 -= 2;
            }
        }
    }
}