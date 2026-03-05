package tema7;

public class Ejercicio12 {
    // Invierte el orden de la frase
    public static char[] invierteFrase(String frase) {
        char[] fraseOriginal = frase.toCharArray();
        char[] fraseInvertida = new char[fraseOriginal.length];
        int index = 0;
        
        // Concatena la frase del reves
        for (int i = fraseOriginal.length - 1; i >= 0; i--) {
            fraseInvertida[index] = fraseOriginal[i];
            index++;
        }
        
        return fraseInvertida;
    }
    
    public static void main(String[] args) {
        String entrada = "programacion orientada a objetos";
        char[] frase = invierteFrase(entrada);
        String fraseInvertida = new String(frase);
        
        System.out.println(fraseInvertida);
    }
}
