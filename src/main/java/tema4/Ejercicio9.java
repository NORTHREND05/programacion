package tema4;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Variables
        Scanner t = new Scanner(System.in);
        int year1, year2, bisiesto = 0;
        // Campos solicitados
        System.out.print("Introduzca dos anos separados por un espacio: ");
        year1 = t.nextInt();
        year2 = t.nextInt();
        // Validación
        while (year1 <= 0 || year2 <= 0) {
            System.out.println("error");
            System.out.print("Has puesto mal algun ano prueba otra vez: ");
            year1 = t.nextInt();
            year2 = t.nextInt();
        }
        // Bucle que muestra los años bisiestos entre year1 y year2
        for (; year1 <= year2; year1++) {
            if (year1 % 4 == 0) {
                if (year1 % 100 == 0 && year1 % 400 != 0) {
                    continue;
                }
                bisiesto++;
            }
        }
        System.out.printf("%d\n", bisiesto);
    }
}