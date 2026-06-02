package repaso2Eval.tema6repaso;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String p1, p2;
        
        do {
            System.out.print("Introduce la primera palabra: ");
            p1 = s.nextLine();
            
            System.out.print("Introduce la segunda palabra: ");
            p2 = s.nextLine();
            
            if (p1.trim().isEmpty() || p2.trim().isEmpty()) {
                System.out.println("Debe haber dos palabras para poder comparar.");
            }
        } while (p1.trim().isEmpty() || p2.trim().isEmpty());
        
        System.out.println(masCorta(p1, p2));
    }

    private static String masCorta(String p1, String p2) {
        if (p1.length() < p2.length()) {
            return p1 + " es la mas corta";
        } else if (p2.length() < p1.length()) {
            return p2 + " es la mas corta";
        } else {
            return "Ambas tienen la misma longitud";
        }
    }
}
