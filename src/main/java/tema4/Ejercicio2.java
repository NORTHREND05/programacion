package tema4;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        short numSolicitado;
        short num = 0;
        
        System.out.print("Introduce un numero para aprender a contar hasta ahí: ");
        numSolicitado = t.nextShort();
        
        while(num < numSolicitado) {
            num++;
            System.out.printf("%d\n", num);
        }
    }
}