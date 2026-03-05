package tema2;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        // Variables
        Scanner t = new Scanner(System.in);
        double cantidadDinero;
        short b500, b200, b100, b50, b20, b10, b5, mon2, mon1;
        byte cent50, cent20, cent10, cent5, cent2, cent1;
        
        // Campo a rellenar
        System.out.print("Introduce una cantidad de dinero: ");
        cantidadDinero = t.nextDouble();
        
        System.out.println("\nEstamos realizando los calculos...");
        
        // Calculos con billetes de euros
        b500 = (short) (cantidadDinero / 500);
        cantidadDinero %= 500;
        b200 = (short) (cantidadDinero / 200);
        cantidadDinero %= 200;
        b100 = (short) (cantidadDinero / 100);
        cantidadDinero %= 100;
        b50 = (short) (cantidadDinero / 50);
        cantidadDinero %= 50;
        b20 = (short) (cantidadDinero / 20);
        cantidadDinero %= 20;
        b10 = (short) (cantidadDinero / 10);
        cantidadDinero %= 10;
        b5 = (short) (cantidadDinero / 5);
        cantidadDinero %= 5;
        mon2 = (short) (cantidadDinero / 2);
        cantidadDinero %= 2;
        mon1 = (short) (cantidadDinero / 1);
        cantidadDinero %= 1;
        
        /* Cálculos con céntimos de euro
            Multiplico por 100 para trabajar con céntimos en enteros.
            Sumo +0.5 para redondear al número entero más cercano,
            porque al convertir a entero(byte) se pierden los decimales.
        */
        cantidadDinero = cantidadDinero * 100 + 0.5;
        cent50 = (byte) (cantidadDinero / 50);
        cantidadDinero %= 50;
        cent20 = (byte) (cantidadDinero / 20);
        cantidadDinero %= 20;
        cent10 = (byte) (cantidadDinero / 10);
        cantidadDinero %= 10;
        cent5  = (byte) (cantidadDinero / 5);
        cantidadDinero %= 5;
        cent2  = (byte) (cantidadDinero / 2);
        cantidadDinero %= 2;
        cent1  = (byte) (cantidadDinero / 1);
        
        // Mostramos resultados
        System.out.printf("\nBilletes de 500 euros: %d\n", b500);
        System.out.printf("Billetes de 200 euros: %d\n", b200);
        System.out.printf("Billetes de 100 euros: %d\n", b100);
        System.out.printf("Billetes de 50 euros: %d\n", b50);
        System.out.printf("Billetes de 20 euros: %d\n", b20);
        System.out.printf("Billetes de 10 euros: %d\n", b10);
        System.out.printf("Billetes de 5 euros: %d\n", b5);
        System.out.printf("Monedas de 2 euros: %d\n", mon2);
        System.out.printf("Monedas de 1 euro: %d\n", mon1);
        System.out.printf("Monedas de 50 centimos: %d\n", cent50);
        System.out.printf("Monedas de 20 centimos: %d\n", cent20);
        System.out.printf("Monedas de 10 centimos: %d\n", cent10);
        System.out.printf("Monedas de 5 centimos: %d\n", cent5);
        System.out.printf("Monedas de 2 centimos: %d\n", cent2);
        System.out.printf("Monedas de 1 centimo: %d\n\n", cent1);
    }
}