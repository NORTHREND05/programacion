package tema6;

import static mislibrerias.EntradaDatos.*;

public class Ejercicio6 {
    // Función que cuenta los espacios de una frase
    public static int cuentaEspacios(String frase) {
        int contador = 0;
        
        // Bucle que recorre toda la frase e incrementa el contador si es un espacio
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contador++;
            }
        }
        
        return contador;
    }
    
    public static void main(String[] args) {
        String frase = getString("Introduce una frase y te diremos cuantos espacios tiene: ");
        
        System.out.println("La frase tiene " + cuentaEspacios(frase) + " espacios.");
    }
}
