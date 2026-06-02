package repaso2Eval.tema7repaso;

import java.util.Scanner;

public class Ejercicio4 {
    static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n;
        int[] v;
        
        n = getNumeroPositivo("Introduce un numero: ", "El numero debe ser positivo.");
        
        System.out.println("Introduce ahora numeros " + n + " veces.");
        v = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Numero: ");
            v[i] = s.nextInt();
        }
        
        System.out.println("La media de los positivos es: " + getMediaPositivos(v));
        System.out.println("La media de los negativos es: " + getMediaNegativos(v));
        System.out.println("Hay " + contarCeros(v) + " ceros.");
    }

    private static int getNumeroPositivo(String msg, String error) {
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

    private static float getMediaPositivos(int[] v) {
        int suma = 0, cont = 0;
        
        for (int i = 0; i < v.length; i++) {
            if (v[i] > 0) {
                suma += v[i];
                cont++;
            }
        }
        
        if (cont == 0) return (float) 0;
        
        return (float) suma / cont;
    }
    
    private static float getMediaNegativos(int[] v) {
        int suma = 0, cont = 0;
        
        for (int i = 0; i < v.length; i++) {
            if (v[i] < 0) {
                suma += v[i];
                cont++;
            }
        }
        
        if (cont == 0) return (float) 0;
        
        return (float) suma / cont;
    }

    private static int contarCeros(int[] v) {
        int n = 0;
        
        for (int i = 0; i < v.length; i++) {
            if (v[i] == 0) {
                n++;
            }
        }
        return n;
    }
}
