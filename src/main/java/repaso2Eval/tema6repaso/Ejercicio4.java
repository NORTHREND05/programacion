package repaso2Eval.tema6repaso;

import java.util.Scanner;

public class Ejercicio4 {
    static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        String entrada;
        
        do {
            entrada = getFrase();
            if (!entrada.equalsIgnoreCase("FIN")) {
                System.out.println(mostrarFraseSeparadaPorEspacios(entrada));
            }
        } while (!entrada.equalsIgnoreCase("FIN"));
        
        System.out.println("Programa Terminado");
    }

    private static String getFrase() {
        String entrada;
        
        do {
            System.out.print("Introduce una frase para mostrarla separada por espacios: ");
            entrada = s.nextLine();
            
            if (entrada.trim().isEmpty()) {
                System.out.println("Debe haber al menos una palabra.");
            }
        } while (entrada.trim().isEmpty());
        return entrada;
    }

    private static String mostrarFraseSeparadaPorEspacios(String entrada) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < entrada.length(); i++) {
            sb.append(entrada.charAt(i)).append(" ");
        }
        return sb.toString();
    }
}
