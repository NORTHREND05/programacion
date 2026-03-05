package tema2;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        // Variables
        Scanner t = new Scanner(System.in);
        int dias, horas, minutos, segundos, cantidadSegundos;
        
        // Campos a rellenar
        System.out.print("Introduce los segundos: ");
        segundos = t.nextInt();
        
        System.out.println("\nEstamos haciendo los calculos...");
        
        // Calculos
        cantidadSegundos = segundos;
        dias = segundos / 86400;
        segundos %= 86400;
        horas = segundos / 3600;
        segundos %= 3600;
        minutos = segundos / 60;
        segundos %= 60;
        
        System.out.printf("\n%d segundos son: %d dia/s, %d hora/s y %d minutos y %d segundos.\n\n", cantidadSegundos, dias, horas, minutos, segundos);
    }
}