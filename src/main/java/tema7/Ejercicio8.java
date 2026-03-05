package tema7;

import java.util.Arrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[] vectorNumeros = {23, 23, 3, 4, 0, 0, 5};
        int[] vectorSinRepetidos = sinRepetidos(vectorNumeros);
        
        System.out.println("Original: " + Arrays.toString(vectorNumeros));
        System.out.println("Sin repetidos: " + Arrays.toString(vectorSinRepetidos));
    }
    
    // Función devuelve un array sin numeros repetidos
    public static int[] sinRepetidos(int[] t) {
        int[] vector = new int[t.length];
        int unicos = 0;
        
        // Si el número no está repetido, se añade al array y se incrementa el contador de únicos
        for (int i = 0; i < t.length; i++) {
            if (contiene(vector, t[i], unicos) == -1) {
                vector[unicos] = t[i];
                unicos++;
            }
        }
        
        // Devolvemos un array con el tamaño de elementos únicos
        return Arrays.copyOf(vector, unicos);
    }
    
    // Función que busca un número en un array hasta un límite dado
    public static int contiene(int[] array, int n, int limite) {
        // Recorre buscando un numero igual a n, cuando lo encuentra lo devuelve sino -1
        for (int i = 0; i < limite; i++) {
            if (array[i] == n) {
                return i;
            }
        }
        
        return -1;
    }
}
