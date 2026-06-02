package repaso2Eval.tema7repaso;

import com.github.javafaker.Faker;

public class Ejercicio13 {
    public static void main(String[] args) {
        int[][] v = new int[3][3];
        
        rellenarMatriz(v);
        System.out.println(mostrarMatriz(v));
        if (esMagica(v)) {
            System.out.println("La matriz es magica.");
        } else {
            System.out.println("La matriz no es magica.");
        }
    }

    private static void rellenarMatriz(int[][] v) {
        Faker f = new Faker();
        
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                v[i][j] = f.number().numberBetween(0, 10);
            }
        }
    }
    
    private static String mostrarMatriz(int[][] v) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                sb.append(v[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private static boolean esMagica(int[][] v) {
        int base = 0;
        
        for (int j = 0; j < v[0].length; j++) {
            base += v[0][j];
        }
        
        for (int i = 0; i < v.length; i++) {
            if (!compararFilas(v, base, i)) {
                return false;
            }
        }
        
        for (int j = 0; j < v[0].length; j++) {
            if (!compararColumnas(v, base, j)) {
                return false;
            }
        }
        return true;
    }

    private static boolean compararFilas(int[][] v, int base, int i) {
        int comp = 0;
        
        for (int j = 0; j < v[i].length; j++) {
            comp += v[i][j];
        }
        return comp == base;
    }

    private static boolean compararColumnas(int[][] v, int base, int j) {
        int comp = 0;
        
        for (int i = 0; i < v.length; i++) {
            comp += v[i][j];
        }
        return comp == base;
    }
}
