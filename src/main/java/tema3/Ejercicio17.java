package tema3;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        // Variables
        Scanner t = new Scanner(System.in);
        int num1, num2, num3, nMenor, nMedio, nMayor;

        // Campos a rellenar
        System.out.print("Introduce tres numeros separados por un espacio respectivamente para ordenarlos de forma creciente: ");
        num1 = t.nextInt();
        num2 = t.nextInt();
        num3 = t.nextInt();

        // Condiciones con ternarios
        nMenor = (num1 < num2) ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);
        nMayor = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        nMedio = (num1 != nMenor && num1 != nMayor) ? num1 : (num2 != nMenor && num2 != nMayor) ? num2 : num3;
        
        // Mostramos resultado después de las condiciones
        System.out.printf("%d %d %d\n", nMenor, nMedio, nMayor);
    }
}
