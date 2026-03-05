package tema7;

import java.util.*;

public class Ejercicio9 {
    // Lee n enteros por teclado, los guarda en un array y los ordena.
    public static int[] leerYOrdenar(int tam, String msg) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[tam];
        
        System.out.println(msg);
        for (int i = 0; i < tam; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }
        
        Arrays.sort(v);
        
        return v;
    }

    // Fusiona dos vectores ordenados en uno nuevo, manteniendo el orden.
    public static int[] fusionarVectores(int[] v1, int[] v2) {
        int[] fusion = new int[v1.length + v2.length];
        int i = 0, j = 0;
        
        // Si v1 tiene elementos disponibles y (v2 se ha acabado o v1 es menor), se toma el valor de v1
        for (int k = 0; k < fusion.length; k++) {
            if (i < v1.length && (j == v2.length || v1[i] < v2[j])) {
                fusion[k] = v1[i];
                i++;
            } else {
                fusion[k] = v2[j];
                j++;
            }
        }
        
        return fusion;
    }
    
    public static void main(String[] args) {
        int tamSerie = 6;
        int[] vector1;
        int[] vector2;
        int[] vFusion;
                
        // Lee y ordena el primer vector
        vector1 = leerYOrdenar(tamSerie, "Introduce los 6 numeros del primer vector:");
        System.out.println("Vector 1 ordenado: " + Arrays.toString(vector1));

        // Lee y ordena el segundo vector
        vector2 = leerYOrdenar(tamSerie, "\nIntroduce los 6 numeros del segundo vector");
        System.out.println("Vector 2 ordenado: " + Arrays.toString(vector2));

        // Fusiona ambos en un tercero
        vFusion = fusionarVectores(vector1, vector2);

        // Muestra el resultado final
        System.out.println("\nVector fusionado y ordenado:\n" + Arrays.toString(vFusion));
    }
}
