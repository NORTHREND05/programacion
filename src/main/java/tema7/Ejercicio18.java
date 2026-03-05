package tema7;

import static mislibrerias.EntradaDatos.*;

public class Ejercicio18 {
    public static void main(String[] args) {
        int nCasos, n;
        int[][] tabla;
        
        nCasos = getPositiveNumber("Cuantos casos a probar: ", "Error... Al menos 1 caso.");
        
        // Pide tantos n como casos y muestra la tabla correspondiente
        for (int i = 0; i < nCasos; i++) {
            n = getPositiveNumber("", "Error... Tiene que ser positivo.");
            
            tabla = new int[n][n];
            
            rellenaTabla(tabla);
            System.out.println("\nPara n=" + n + "\n" + muestraTabla(tabla));
        }
    }

    // Rellena la tabla
    public static void rellenaTabla(int[][] tabla) {
        // Rellena la tabla con la suma de i+j en cada indice
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = i+j;
            }
        }
    }

    // Muestra los valores de la tabla
    public static String muestraTabla(int[][] tabla) {
        StringBuilder sb = new StringBuilder();
        
        // Concatena los valores de la tabla
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                sb.append(tabla[i][j]).append(" ");
            }
            sb.append("\n");
        }
        
        return sb.toString();
    }
    
    
}
