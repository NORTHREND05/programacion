package tema2;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        double a, b, c;
        double x1, x2;
        
        // Aquí solicitamos los coeficientes
        System.out.print("Ingrese el coeficiente a: ");
        a = t.nextDouble();
        System.out.print("Ingrese el coeficiente b: ");
        b = t.nextDouble();
        System.out.print("Ingrese el coeficiente c: ");
        c = t.nextDouble();
        
        //Aquí hacemos los calculos necesarios
        x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a* c)) / (2 * a);
        x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a* c)) / (2 * a);
        
        // Aquí mostramos los resultados
        System.out.println("Las dos soluciones son: x1 = " + x1 + ", x2 = " + x2);
    }
}
