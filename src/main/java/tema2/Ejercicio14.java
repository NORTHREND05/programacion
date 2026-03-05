package tema2;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        // Variables
        Scanner t = new Scanner(System.in);
        int dias, horas, minutos, segundos;
        
        // Campos a rellenar
        System.out.print("Introduce los dias, horas y minutos respectivamente: ");
        dias = t.nextInt();
        horas = t.nextInt();
        minutos = t.nextInt();
        
        System.out.println("\nEstamos haciendo los calculos...");
        
        // Calculos por segundo
        segundos = dias * 86400;
        segundos += horas * 3600;
        segundos += minutos * 60;
        
        System.out.printf("\nUn %d dia/s, %d hora/s y %d minuto/s son: %d segundos\n\n", dias, horas, minutos, segundos);
    }
}
