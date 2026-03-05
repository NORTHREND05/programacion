package tema4;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        // Variables
        Scanner t = new Scanner(System.in);
        byte num, alto, ancho;
        // Campo solicitado y validación
        do {
            System.out.print("Introduce un numero: ");
            num = t.nextByte();
            if (num < 1) {
                System.out.println("Numero no valido, prueba otra vez");
            }
        } while (num < 1);
        // Bucle para dibujar el cuadrado vacío
        for (alto = 0; alto < num; alto++) {
            for (ancho = 0; ancho < num; ancho++) {
                if(ancho>0 && ancho<num - 1 && alto>0 && alto<num - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
