package repaso2Eval.tema6repaso;

import java.util.Scanner;

public class Ejercicio8 {
    static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        String nombre;
        nombre = getNombreCompleto("Introduce tu nombre completo: ", "Tu nombre no puede estar vacio.");
        
        System.out.println(sinVocales(nombre));
    }
    
    private static String getNombreCompleto(String msg, String error) {
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

    private static String sinVocales(String nombre) {
        StringBuilder sb = new StringBuilder(nombre);
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ";
        
        for (int i = 0; i < sb.length(); i++) {
            if (vocales.indexOf(sb.charAt(i)) != -1) {
                sb.deleteCharAt(i);
                i--;
            }
        }
        
        return sb.toString();
    }
}
