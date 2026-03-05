package tema3;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Variables
        Scanner t = new Scanner(System.in);
        double a, b, c;
        double x1, x2;
        double raiz, discriminante;
        
        // Aquí solicitamos los coeficientes
        System.out.print("Ingrese el coeficiente a: ");
        a = t.nextDouble();
        System.out.print("Ingrese el coeficiente b: ");
        b = t.nextDouble();
        System.out.print("Ingrese el coeficiente c: ");
        c = t.nextDouble();
        
        //Aquí hacemos los calculos necesarios
        discriminante = Math.pow(b, 2) - 4 * a * c;
        if (a == 0) {
            System.out.println("No es una ecuacion de segundo grado.");
        } else if (discriminante < 0) {
            System.out.println("No existen soluciones reales.");
        } else {
            raiz = Math.sqrt(discriminante);
            x1 = (-b + raiz) / (2 * a);
            x2 = (-b - raiz) / (2 * a);
            System.out.printf("Las dos soluciones son: x1 = %.2f, x2 = %.2f\n", x1, x2);
        }
    }
}
