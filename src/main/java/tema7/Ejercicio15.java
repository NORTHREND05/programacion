package tema7;

public class Ejercicio15 {
    public static void main(String[] args) {
        int tam = 4;
        int[][] matriz = new int[tam][tam];

        rellenaMatrizConSecuencia(matriz);
        
        System.out.println(muestraTabla(matriz));
    }

    // Rellena la matriz con la secuencia 1 2 3
    public static void rellenaMatrizConSecuencia(int[][] v) {
        int valorActual = 1;
        
        // rellena con secuencia 1 2 3
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                v[i][j] = valorActual;
                valorActual++;
                if (valorActual > 3) {
                    valorActual = 1;
                }
            }
        }
    }

    // Muestra la tabla
    public static String muestraTabla(int[][] v) {
        StringBuilder sb = new StringBuilder();

        // concatena valores separados por espacio
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                sb.append(v[i][j]).append(" ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
