package tema7;

import static mislibrerias.EntradaDatos.*;

public class Ejercicio14 {

    public static void main(String[] args) {
        String[][] tabla = new String[5][];

        tabla[0] = new String[1];
        tabla[1] = new String[2];
        tabla[2] = new String[3];
        tabla[3] = new String[4];
        tabla[4] = new String[5];

        pedirYRellenarTabla(tabla);
        System.out.println(muestraTabla(tabla));
    }

    // Pide los caracteres y rellena la tabla
    public static void pedirYRellenarTabla(String[][] tabla) {
        String entrada = getString("Introduce caracteres separados por espacios: ");
        String[] datos = entrada.split(" ");
        int index = 0;

        // Rellena tabla con los elementos de datos
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (index < datos.length) {
                    tabla[i][j] = datos[index];
                    index++;
                } else {
                    tabla[i][j] = "?";
                }
            }
        }
    }

    public static String muestraTabla(String[][] tabla) {
        StringBuilder sb = new StringBuilder();

        // Concatena valores de la tabla irregular
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                sb.append(tabla[i][j]).append(" ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
