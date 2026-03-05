package tema4;

import java.util.Scanner;

public class Ejercicio14 {
    public static final short CANTIDAD = 0;
    public static void main(String[] args) {
        // Variables
        Scanner t = new Scanner(System.in);
        byte num, contador, ntablas, num2;
        int producto;
        // Campo solicitado y validación
        System.out.print("Introduce un numero entre 1 y 10: ");
        num = t.nextByte();
        while (num < 1 || num > 10) {
            System.out.print("Prueba otra vez: ");
            num = t.nextByte();
        }
        // Bucle para mostrar las tablas segun el numero introducido
//        for (ntablas = num; ntablas <= 10; ntablas++) {
//            for (contador = 1; contador <= 10; contador++) {
//                producto = num * contador;
//                System.out.printf("%dx%d=%d\n", num, contador, producto);
//            }
//            num++;
//            System.out.println();
//        }
        // Versión en fila
        for (contador = 1; contador <= 10; contador++) {
            num2 = num;
            for (ntablas = num2; ntablas <= 10; ntablas++) {
                producto = num2 * contador;
                if(contador < 10) {
                    System.out.printf("%dx%d=%-5d", num2, contador, producto);
                } else {
                    System.out.printf("%dx%d=%-4d", num2, contador, producto);
                }
                num2++;
            }
            System.out.println();
        }
    }
}
