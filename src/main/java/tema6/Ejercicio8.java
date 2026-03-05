package tema6;

public class Ejercicio8 {
    // Función que devuelve la cadena al revés
    public static String reverse(String cadena) {
        StringBuilder sb = new StringBuilder();
        
        // Bucle que recorre la cadena de final a inicio y concatena los elementos
        for (int i = cadena.length() - 1; i >= 0; i--) {
            sb.append(cadena.charAt(i));
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        String cadena = "12345";
        
        System.out.println(reverse(cadena));
    }
}
