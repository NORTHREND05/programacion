package tema6;

import static mislibrerias.EntradaDatos.*;

public class Ejercicio7 {
    // Función que elimina las vocales del nombre y apellidos introducidos
    public static String sinVocales(String entrada) {
    	StringBuilder sb = new StringBuilder(entrada);
        String vocales = "aAáÁeEéÉiIíÍoOóÓuUúÚ";
        
        // Bucle que recorre el nombre completo y elimina el elemento si coincide
    	for (int i = 0; i < sb.length(); i++) {
            if (vocales.indexOf(sb.charAt(i)) != -1) {
                sb.deleteCharAt(i);
                i--;
            }
    	}
        
    	return sb.toString();
    }
    
    public static void main(String[] args) {
    	String nomYApe = getString("Introduce tu nombre y apellidos: ");
        
    	System.out.println(sinVocales(nomYApe));
    }
}
