package tema7;

public class Ejercicio11 {
    // Función que extrae las iniciales de una frase y las devuelve en un array
    public static char[] extraerIniciales(String entrada) {
        String[] vPalabras = entrada.split(" ");
        char[] iniciales = new char[vPalabras.length];
        
        // Rellena el array con inicial de cada elemento de vPalabras
        for (int i = 0; i < iniciales.length; i++) {
            iniciales[i] = vPalabras[i].toUpperCase().charAt(0);
        }
        
        return iniciales;
    }
    public static void main(String[] args) {
        String frase = "programacion orientada a objetos";
        char[] resultado = extraerIniciales(frase);
        String iniciales = new String(resultado);
        
        System.out.println(iniciales);
    }
}
