package repaso2Eval.tema6repaso;

import java.util.Scanner;

public class Ejercicio6 {
    static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        String password = getPassword("Introduce una contrasena: ", "La contrasena no debe estar vacia");
        
        System.out.println(ofuscaPassword(password));
    }
    
    private static String getPassword(String msg, String error) {
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

    private static String ofuscaPassword(String password) {
        StringBuilder sb = new StringBuilder(password);
        
        for (int i = 0; i < sb.length(); i++) {
            switch (sb.charAt(i)) {
                case 'a': case 'A': case 'á': case 'Á':
                    sb.setCharAt(i, '@');
                    break;
                case 'e': case 'E': case 'é': case 'É':
                    sb.setCharAt(i, '3');
                    break;
                case 'i': case 'I': case 'í': case 'Í':
                    sb.setCharAt(i, '1');
                    break;
                case 'o': case 'O': case 'ó': case 'Ó':
                    sb.setCharAt(i, '0');
                    break;
                case 'u': case 'U': case 'ú': case 'Ú':
                    sb.setCharAt(i, 'V');
                    break;
            }
        }
        
        return sb.toString();
    }
}
