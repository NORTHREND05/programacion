package tema6;

import static mislibrerias.EntradaDatos.getString;

public class Ejercicio2 {
    public static String masCorta(String palabra1, String palabra2) {
        return palabra1.length() < palabra2.length() ? palabra1 : palabra2;
    }
    
    public static void main(String[] args) {
        String palabra1, palabra2;
        
        palabra1 = getString("Introduce una palabra: ");
        palabra2 = getString("Introduce una palabra: ");
        
        System.out.println("\nLa palabra mas corta es: ");
        System.out.println(masCorta(palabra1, palabra2));
    }
}
