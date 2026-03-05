package tema3;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Variables
        Scanner t = new Scanner(System.in);
        int num1, num2, num3;
        
        // Campos a rellenar
        System.out.print("Introduce tres numeros separados por un espacio respectivamente para ordenarlos de forma creciente: ");
        num1 = t.nextInt();
        num2 = t.nextInt();
        num3 = t.nextInt();
        
        // Operandos para ordenarlos
        if (num1 < num2 && num2 < num3) {
            // a < b < c
            System.out.printf("%d %d %d\n", num1, num2, num3);
        } else if (num1 < num3 && num3 < num2) {
            // a < c < b
            System.out.printf("%d %d %d\n", num1, num3, num2);
        } else if (num2 < num1 && num1 < num3) {
            // b < a < c
            System.out.printf("%d %d %d\n", num2, num1, num3);
        } else if (num2 < num3 && num3 < num1) {
            // b < c < a
            System.out.printf("%d %d %d\n", num2, num3, num1);
        } else if (num3 < num1 && num1 < num2) {
            // c < a < b
            System.out.printf("%d %d %d\n", num3, num1, num2);
        } else {
            // c < b < a
            System.out.printf("%d %d %d\n", num3, num2, num1);
        }
    }
}
