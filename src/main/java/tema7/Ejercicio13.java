package tema7;

public class Ejercicio13 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        
        rellenaMatriz(matriz);
        System.out.println("Matriz:\n" + mostrarMatriz(matriz));
        
        if (esMagico(matriz)) {
            System.out.println("La matriz es magica.");
        } else {
            System.out.println("La matriz no es magica.");
        }
    }

    // Rellena el vector con numeros randoms dentro del rango del vector
    public static void rellenaMatriz(int[][] vector) {
        // Añade un valor random al indice correspondiente
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                vector[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    
    // Comprueba si es una matriz magica
    public static boolean esMagico(int[][] vector) {
        int sumaReferencia = 0, sumaFila, sumaColumna;
        
        // Suma de la primera fila
        for (int i = 0; i < vector[0].length; i++) {
            sumaReferencia += vector[0][i];
        }
        
        // Comprobar filas
        for (int i = 0; i < vector.length; i++) {
            sumaFila = 0;
            for (int j = 0; j < vector[i].length; j++) {
                sumaFila += vector[i][j];
            }
            
            if (sumaFila != sumaReferencia) {
                return false;
            }
        }
        
        // Comprobar columnas
        for (int j = 0; j < vector[0].length; j++) {
            sumaColumna = 0;
            for (int i = 0; i < vector.length; i++) {
                sumaColumna += vector[i][j];
            }
            
            if(sumaColumna != sumaReferencia) {
                return false;
            }
        }
        
        return true;
    }

    // Muestra la matriz
    public static String mostrarMatriz(int[][] vector) {
        StringBuilder sb = new StringBuilder();
        
        // Concatena valores de la matriz para mostrarla
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                sb.append(vector[i][j]).append(" ");
            }
            sb.append("\n");
        }
        
        return sb.toString();
    }
}
