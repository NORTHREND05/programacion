package tema12;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double nota;
        
        try {
            System.out.print("Introduce una nota: ");
            nota = s.nextDouble();
            
            validarNota(nota);
            System.out.println("Nota válida: " + nota);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Ese no es un valor númerico.");
        }
    }
    
    public static void validarNota(double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Error: La nota debe ser entre 0 y 10.");
        }
    }
}
