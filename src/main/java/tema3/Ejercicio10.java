package tema3;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        // Variables
        Scanner t = new Scanner(System.in);
        int num1, num2, num3;
        
        // Campos a rellenar
        System.out.print("Introduce tres numeros separados por un espacio respectivamente para ordenarlos de forma creciente: ");
        num1 = t.nextInt();
        num2 = t.nextInt();
        num3 = t.nextInt();
        
        // Condiciones para ordenarlos sin los operadores &&, || y !
        if (num1 < num2) {
            if (num1 < num3) {
                if (num2 < num3) {
                    System.out.printf("\n%d %d %d\n\n", num1, num2, num3);
                } else {
                    System.out.printf("\n%d %d %d\n\n", num1, num3, num2);
                }
            } else {
                System.out.printf("\n%d %d %d\n\n", num3, num1, num2);
            }
        } else {
            if (num2 < num3) {
                if (num1 < num3) {
                    System.out.printf("\n%d %d %d\n\n", num2, num1, num3);
                } else {
                    System.out.printf("\n%d %d %d\n\n", num2, num3, num1);
                }
            } else {
                System.out.printf("\n%d %d %d\n\n", num3, num2, num1);
            }
        }
    }
}
