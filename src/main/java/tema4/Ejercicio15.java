package tema4;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        // Variables
        Scanner t = new Scanner(System.in);
        byte num, numero = (byte) (Math.random() * 100 + 1);
        // Explicación del juego
        System.out.println("Generaremos un numero aleatorio entre 1 y 100.");
        System.out.println("Trata de adivinarlo. Puedes rendirte poniendo un numero negativo.");
        System.out.println("Que empiece el juego!!");
        // Bucle mientras el numero sea diferente del numero random
        do {
            System.out.print("Introduce un numero entre el rango propuesto: ");
            num = t.nextByte();
            if (num < 0) {
                System.out.println("Te has rendido :(");
                System.out.println("GAME OVER");
                break;
            }
            while (num < 1 || num > 100) {
                System.out.print("No esta en el rango propuesto, prueba otra vez: ");
                num = t.nextByte();
            }
            if (num > numero) {
                System.out.println("menor");
            } else if (num < numero) {
                System.out.println("mayor");
            } else {
                System.out.println("Ganaste!!!");
            }
        } while (num != numero);
    }
}
