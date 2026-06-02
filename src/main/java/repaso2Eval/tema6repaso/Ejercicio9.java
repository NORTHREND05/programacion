package repaso2Eval.tema6repaso;

import java.util.Scanner;

public class Ejercicio9 {
    static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        String entrada = getCadena("Introduce una cadena: ", "La cadena no puede estar vacia.");
        System.out.println(reverse(entrada));
    }
    
    private static String getCadena(String msg, String error) {
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

    private static String reverse(String entrada) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = entrada.length() - 1; i >= 0; i--) {
            sb.append(entrada.charAt(i));
        }
        
        return sb.toString();
    }
}
