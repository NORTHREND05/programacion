package tema4;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Variables
        Scanner t = new Scanner(System.in);
        byte num;
        short cuadrado;
        // Campo solicitado
        System.out.print("Introduce numeros separados por un espacio tantos como quieras: ");
        num = t.nextByte();
        // While infinito hasta que el usuario ingrese el valor 0
        // Ejercicio corregido*
        while (num != 0) {
            // Par o impar
            if (num % 2 == 0)
                System.out.println("PAR");
            // Positivo o Negativo
            if (num > 0)
                System.out.println("+");
            // Cuadrado
            cuadrado = (short) (num * num);
            System.out.println(cuadrado);
            // Solicitamos de nuevo un valor o valores
            num = t.nextByte();
        }
    }
}