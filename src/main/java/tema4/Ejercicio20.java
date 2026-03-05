package tema4;

import java.util.Scanner;

public class Ejercicio20 {
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
            if(i<n/2) {
                System.out.printf("%d %d ", cont1, cont2);
                cont1--;
                cont2 += 2;
            } else {
                System.out.printf("%d %d ", cont1, cont2);
                cont1++;
                cont2 -=2;
            }
        }
        System.out.println();
    }
}