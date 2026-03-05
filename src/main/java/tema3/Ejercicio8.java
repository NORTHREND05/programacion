package tema3;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        // Variables
        Scanner t = new Scanner(System.in);
        String formato;
        byte horas, minutos, segundos, horaFormat;

        // Campos a rellenar
        System.out.print("Introduce las horas, minutos y segundos separados por un espacio respectivamente: ");
        horas = t.nextByte();
        minutos = t.nextByte();
        segundos = t.nextByte();

        System.out.println("\nEstamos haciendo los calculos...");
        // Calculos
        segundos += 1;
        if (segundos == 60) {
            segundos = 0;
            minutos += 1;
        }
        if (minutos == 60) {
            minutos = 0;
            horas += 1;
        }
        formato = (horas >= 12) ? "PM" : "AM";
        horaFormat = (byte) (horas % 12);
        if (horaFormat == 0) {
            horaFormat = 12;
        }

        // Resultado
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Formatter.html#syntax:~:text=to%20general%20conversions%3A-,%27%2D%27,flag%20is%20not%20given%20then%20the%20output%20will%20be%20right%2Djustified.,-%27%23%27
        System.out.printf("\nHora un segundo despues: %d:%02d:%02d %s\n", horaFormat, minutos, segundos, formato);
    }
}
