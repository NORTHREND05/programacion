package repaso2Eval.tema7repaso;

import java.util.Scanner;

public class Ejercicio5 {
    static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] favoritos = {1, 2, 3, 4};
        int indice, elementos = favoritos.length;
        
        do {
            indice = getNumero(
                "Introduce el numero del elemento que quieres borrar: ",
                "El numero debe estar entre 0 y " + (favoritos.length - 1),
                favoritos.length
            );

            if (indice >= 0 && elementos != 0) {
                if (favoritos[indice] != -1) {
                    favoritos[indice] = -1;
                    elementos--;
                    System.out.println("Elemento borrado.");
                } else {
                    System.out.println("Ese elemento ya habia sido borrado.");
                }
            }
        } while (indice >= 0 && elementos != 0);
        
        if (elementos == 0) {
            System.out.println("Ya no quedan elementos por borrar.");
        } else {
            System.out.println("Borrado terminado");
            System.out.println(mostrarFavoritos(favoritos));
        }
    }

    private static String mostrarFavoritos(int[] favoritos) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < favoritos.length; i++) {
            if (favoritos[i] != -1) {
                sb.append(favoritos[i]).append(" ");
            }
        }
        return sb.toString();
    }

    private static int getNumero(String msg, String error, int tam) {
        int n;
        
        do {   
            System.out.print(msg);
            n = s.nextInt();
            
            if (n >= tam) {
                System.out.println(error);
            }
        } while (n >= tam);
        return n;
    }
}
