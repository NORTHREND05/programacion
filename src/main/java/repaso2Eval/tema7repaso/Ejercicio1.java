package repaso2Eval.tema7repaso;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float[] v = new float[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un numero decimal: ");
            v[i] = s.nextFloat();
        }
        System.out.println(mostrarVector(v));
    }

    private static String mostrarVector(float[] v) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < v.length; i++) {
            sb.append(v[i]).append(" ");
        }
        return sb.toString();
    }
}
