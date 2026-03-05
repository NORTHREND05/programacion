package tema7;

import static mislibrerias.EntradaDatos.*;

public class Ejercicio2 {
    // Función que rellena el array con datos introducidos por el usuario
    public static int[] rellenarArray(int n, String msg) {
        int[] vNum = new int[n];
        
        // Pide tantos numeros como el valor de n
        for (int i = 0; i < n; i++) {
            vNum[i] = getNumero(msg);
        }
        
        return vNum;
    }
    
    // Función que muestra el array del revés
    public static String mostrarArrayInverso(int[] v) {
        StringBuilder sb = new StringBuilder();
        
        // Concatena los numeros del array v de forma inversa
        for (int i = v.length - 1; i >= 0; i--) {
            sb.append(v[i]).append(" ");
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        int n = getPositiveNumber("Cuantos numeros desea introducir? : ", "Ese numero no es valido");
        int[] vNum = rellenarArray(n, "Numero: ");
        
        System.out.println("\n" + mostrarArrayInverso(vNum));
    }
}
