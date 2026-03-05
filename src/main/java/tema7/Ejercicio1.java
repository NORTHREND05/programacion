package tema7;

import java.util.Scanner;

public class Ejercicio1 {
    // Función que rellena el array con el dato introducido por el usuario
    public static float[] rellenaArray(int num, String msg) {
        Scanner t = new Scanner(System.in);
        float[] vector = new float[num];

        // Bucle que pide tantos numeros como el valor de num
        for (int i = 0; i < num; i++) {
            System.out.print(msg);
            vector[i] = t.nextFloat();
        }
        
        return vector;
    }
    
    // Función que muestra el array
    public static String mostrarArray(float[] v) {
        StringBuilder sb = new StringBuilder();
        
        // Concatena el elemento con indice i con espacio
        for (int i = 0; i < v.length; i++) {
            sb.append(v[i]).append(" ");
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        float[] v;
        
        System.out.println("Introduce cinco numeros decimales\n");
        v = rellenaArray(5, "Numero: ");
        
        System.out.println("\n" + mostrarArray(v));
    }
}
