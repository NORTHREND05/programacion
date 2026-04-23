package tema12;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        byte edad = 0;
        boolean valido = false;
        
        do {
            try {
                System.out.print("Introduce tu edad: ");
                edad = s.nextByte();
                
                // Si se completa la accion es válido
                valido = true;
            } catch (Exception e) {
                System.out.println("Error: Ese no es un valor númerico");
                s.nextLine(); // Limpia lo que escribió el usuario
            }
        } while (!valido);
        
        System.out.println("Edad válida: " + edad + " años.");
    }
}
