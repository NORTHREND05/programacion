package repaso2Eval.tema6repaso;

import java.util.Scanner;

public class Ejercicio7 {
    static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        String frase = getFrase(
            "Introduce una frase para mostrarla separada por espacios: ",
            "Debe haber al menos una palabra."
        );
        System.out.println("La frase tiene "+ cuentaEspacios(frase) + " espacios.");
    }
    
    private static String getFrase(String msg, String error) {
        String entrada;
        
        do {
            System.out.print(msg);
            entrada = s.nextLine();
            
            if (entrada.trim().isEmpty()) {
                System.out.println(error);
            }
        } while (entrada.trim().isEmpty());
        return entrada;
    }

    private static int cuentaEspacios(String frase) {
        int n = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            if (Character.isSpaceChar(frase.charAt(i))) {
                n++;
            }
        }
        return n;
    }
}
