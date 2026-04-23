package tema12;

import java.util.*;

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
            } catch (InputMismatchException e) {
                System.out.println("Error: El valor debe ser numérico.");
                s.nextLine();
            } catch (Exception e) {
                System.out.println("En estos momentos no puede realizarse la operación.");
                s.nextLine(); // Limpia lo que escribió el usuario
            }
        } while (!valido);
        
        System.out.println("Edad válida: " + edad + " años.");
    }
}
