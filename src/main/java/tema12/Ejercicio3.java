package tema12;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int index;
        int[] v = {1, 2, 3, 4, 5};
        
        try {
            System.out.print("Introduce un índice: ");
            index = s.nextInt();
            
            System.out.println("El valor en esa posición es: " + v[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: El índice está fuera del rango del array.");
        } catch (Exception e) {
            System.out.println("Error: Ese no es un valor númerico.");
        }
    }
}
