package tema4;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        // Variables
        Scanner t = new Scanner(System.in);
        byte num, alto, ancho;
        // Campo solicitado y validación
        do {
            System.out.print("Introduce un numero: ");
            num = t.nextByte();
            if (num <= 0) {
                System.out.println("Numero no valido, prueba otra vez");
            }
        } while (num <= 0);
        // Bucle para dibujar el cuadrado lleno
        for (alto = 0; alto < num; alto++) {
            for (ancho = 0; ancho < num; ancho++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
