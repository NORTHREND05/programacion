package tema7;

import java.util.Arrays;

public class Ejercicio7 {
    public static void main(String[] args) {
        int cantidad = 20;
        int[] secuencia = generarSecuencia(cantidad);
      
        System.out.println(Arrays.toString(secuencia));
    }
    
    // Función que genera los 20 primeros números de la secuencia y los guarda en un array.
    public static int[] generarSecuencia(int cantidad) {
        int[] secuencia = new int[cantidad];
        int valorActual = 3, baseImpar = 3, contador = 1;
        
        // Recorre y va asignando valores segun el caso
        for (int i = 0; i < cantidad; i++) {
            secuencia[i] = valorActual;
            switch (contador) {
                case 1:
                    valorActual *= 2;
                    contador++;
                    break;
                case 2:
                    valorActual += 1;
                    contador++;
                    break;
                default:
                    baseImpar +=2;
                    valorActual = baseImpar;
                    contador = 1;
                    break;
            }
        }
        return secuencia;
    }
}
