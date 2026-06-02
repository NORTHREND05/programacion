package repaso2Eval.tema6repaso;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char c;
        
        do {
            System.out.print("Introduce cualquier caracter (F para terminar): ");
            c = s.nextLine().charAt(0);
            
            if (c != 'F') {
                System.out.println(mostrarFunciones(c));
            }
        } while (c != 'F');
        
        System.out.println("Programa Terminado");
    }

    private static String mostrarFunciones(char c) {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Es un numero? ").append(Character.isDigit(c)).append("\n");
        sb.append("Es una letra? ").append(Character.isLetter(c)).append("\n");
        sb.append("Es letra o numero? ").append(Character.isLetterOrDigit(c)).append("\n");
        sb.append("Esta en mayuscula? ").append(Character.isUpperCase(c)).append("\n");
        sb.append("Esta en minuscula? ").append(Character.isLowerCase(c)).append("\n");
        sb.append("Es un espacio en blanco? ").append(Character.isWhitespace(c)).append("\n");
        sb.append("Mayuscula ").append(Character.toUpperCase(c)).append("\n");
        sb.append("Minuscula ").append(Character.toLowerCase(c)).append("\n");
        
        return sb.toString();
    }
}
