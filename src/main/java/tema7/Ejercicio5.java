package tema7;

import java.util.Arrays;
import static mislibrerias.EntradaDatos.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] nFavoritos = {3, 8, 10, 11, 19, 30};
        int tamMax = nFavoritos.length - 1;
        
        System.out.println(Arrays.toString(nFavoritos));
        doBorradoLogico(nFavoritos, tamMax);
        
        System.out.println(mostrarElementosNoBorrados(nFavoritos));
    }
    
    // Función que hace el borrado logico hasta que se introduzca un n negativo
    public static void doBorradoLogico(int[] entrada, int tamMax) {
        int indice, numOriginal, elementos = entrada.length;
        
        // Hacer borrado lógico mientras el indice sea >= 0
        do {
            // Si ya se se borraron todos los elementos -1 sino pedir otro
            indice = getIndice(
                "Introduce un numero entre 0 y " + tamMax + ": ",
                "Error... Ese numero no esta entre 0 y " + tamMax + ".",
                tamMax
            );
            
            // Si el indice es >= 0 seguir borrando y reduciendo la cantidad de elementos por cada borrado
            if(indice>=0) {
                numOriginal = entrada[indice];
                System.out.println(borrarElemento(entrada, indice));
                
                if(numOriginal != -1 && entrada[indice] == -1) {
                    elementos--;
                }
            }
        } while (indice >= 0 && elementos > 0);
        
        if(elementos == 0) {
            System.out.println("Has borrado todos los elementos.");
        } else {
            System.out.println("Borrado terminado.");
        }
    }
    
    // Función que pide un indice del array
    public static int getIndice(String msg, String error, int tam) {
        int indice;
        
        // Pedir indice mientras sea positivo y esté fuera de rango
        do {
            indice = getNumero(msg);
            
            if(indice >= 0 && indice > tam) {
                System.out.println(error);
            }
        } while (indice >= 0 && indice > tam);
        
        return indice;
    }
    
    // Función que borra el elemento de manera logica
    public static String borrarElemento(int[] numFavoritos, int indice) {
        StringBuilder sb = new StringBuilder();
        
        // Si está dentro de rango
        if (indice >= 0 && indice < numFavoritos.length) {
            // Si no está borrado(lógico), bórralo, sino indica que ya fue borrado
            if (numFavoritos[indice] != -1) {
                numFavoritos[indice] = -1;
                sb.append("El elemento del indice ")
                  .append(indice)
                  .append(" ha sido borrado.");
            } else {
                sb.append("El elemento del indice ")
                  .append(indice)
                  .append(" ya habia sido borrado, prueba con otro indice.");
            }
        }
        
        return sb.toString();
    }
    
    // Función que muestra los elementos que NO HAN SIDO BORRADOS
    public static String mostrarElementosNoBorrados(int[] numFavoritos) {
        StringBuilder sb = new StringBuilder();
        
        // For que concatena los elementos no borrados para mostralos
        for (int num : numFavoritos) {
            if (num != -1) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(num);
            }
        }
        
        return "["+ sb.toString() +"]";
    }
}
