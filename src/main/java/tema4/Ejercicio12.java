package tema4;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        // Variables
        Scanner t = new Scanner(System.in);
        byte num, contador;
        int producto;
        // Campo solicitado y validación
        System.out.print("Introduce un numero entre 0 y 50: ");
        num = t.nextByte();
        while (num < 0 || num > 50) {
            System.out.print("Ha habido un error. Prueba otra vez: ");
            num = t.nextByte();
        }
        // Bucle para mostrar la tabla del numero introducido
        for (contador = 1; contador <= 10; contador++) {
            producto = num * contador;
            System.out.printf("%dx%d=%d\n", num, contador, producto);
        }
    }
}
