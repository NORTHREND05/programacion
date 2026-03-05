package tema2;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        double h, i, n, r, cRespectiva;
        
        System.out.print("Introduzca el valor del prestamo: ");
        h = t.nextDouble();
        System.out.print("Introduzca la tasa de interes: ");
        i = t.nextDouble();
        System.out.print("Introduzca el plazo en años: ");
        n = t.nextDouble();
        
        r = i / (100.0 * 12);
        cRespectiva = (h * r) / (1 - Math.pow(1 + r, -12 * n));
        
        /* Aquí mostramos el resultado con solo dos decimales
        Fuentes:
        https://es.stackoverflow.com/questions/29408/como-limitar-la-cantidad-de-decimales-de-un-double
        https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Formatter.html
        */
        System.out.println("Su cuota respectiva es: " + String.format("%.2f", cRespectiva));
    }
}
