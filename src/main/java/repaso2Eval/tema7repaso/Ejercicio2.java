package repaso2Eval.tema7repaso;

import java.util.Scanner;

public class Ejercicio2 {
    static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = getNumero("Cuantos numeros desea introducir? ", "El numero debe ser positivo.");
        int[] v = new int[n];
        
        for (int i = 0; i < v.length; i++) {
            System.out.print("Numero: ");
            v[i] = s.nextInt();
        }
        
        System.out.println(mostrarVectorInverso(v));
    }

    private static int getNumero(String msg, String error) {
        int n;
        
        do {
            System.out.print(msg);
            n = s.nextInt();
            
            if (n <= 0) {
                System.out.println(error);
            }
        } while (n <= 0);
        
        return n;
    }

    private static String mostrarVectorInverso(int[] v) {
        StringBuilder sb = new StringBuilder();
        
        // Recorre el vector desde el final
        for (int i = v.length - 1; i >= 0; i--) {
            sb.append(v[i]).append(" ");
        }
        return sb.toString();
    }
}
