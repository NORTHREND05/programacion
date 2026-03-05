package tema6;

import static mislibrerias.EntradaDatos.*;

public class Ejercicio3 {
    // Separa frase o string por espacio
    public static String separarFraseConEspacio(String frase) {
        StringBuilder aux = new StringBuilder();
        
        for (int i = 0; i < frase.length(); i++) {
            aux.append(frase.charAt(i)).append(" ");
        }
        
        return aux.toString();
    }
    public static void main(String[] args) {
        String frase;
        // Pedir frase y separar con espacio mientras no ponga fin
        do {
            frase = getString("Introduce una frase: ");
            if(!frase.equalsIgnoreCase("fin")) {
                System.out.println(separarFraseConEspacio(frase));
            }
        } while(!frase.equalsIgnoreCase("fin"));
    }
}
