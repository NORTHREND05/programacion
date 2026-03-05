package tema7;

import java.util.Scanner;
import java.util.regex.Pattern;
import static mislibrerias.EntradaDatos.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        String entradaNumeros = getListaNumeros(
            "Introduce un conjunto de numeros enteros separados por espacios: ",
            "Error... No coincide con el patron (ej: 10 -5 2)."
        );
        int[] listaNumeros = putNumerosEnArray(entradaNumeros);
        int[] pares = putParesEnArray(listaNumeros);
        int[] impares = putImparesEnArray(listaNumeros);
        
        System.out.println("Vector de pares: " + mostrarArray(pares));
        System.out.println("Vector de impares: " + mostrarArray(impares));
        System.out.println("Vector original: " + mostrarArray(listaNumeros));
    }
    
    // Función que devuelve el conjunto de numeros introducidos por el usuario
    public static String getListaNumeros(String msg, String error) {
        String entrada, entradaNumRegexp = "^\\s*-?\\d+(?:\\s+-?\\d+)*\\s*$";
        
        // Pedir mientras no coincida con la expresión regular
        do {
            entrada = getString(msg);
            if (!Pattern.matches(entradaNumRegexp, entrada)) {
                System.out.println(error);
            }
        } while (!Pattern.matches(entradaNumRegexp, entrada));
        
        return entrada;
    }
    
    // Función que almacena los numeros introducidos en un array
    public static int[] putNumerosEnArray(String numeros) {
        Scanner sc = new Scanner(numeros);
        int tamano = getTamanoArray(numeros);
        int[] vNumeros = new int[tamano];
        
        // Asigna un valor introducido por el usuario a los indices del vector
        for (int i = 0; i < vNumeros.length; i++) {
            vNumeros[i] = sc.nextInt();
        }
        
        return vNumeros;
    }
    
    // Función que devuelve el tamaño del array mediante la entrada
    public static int getTamanoArray(String entrada) {
        Scanner sc = new Scanner(entrada);
        int contador = 0;
        
        // Mientras haya un entero aumenta el contador
        while (sc.hasNextInt()) {            
            sc.nextInt();
            contador++;
        }
        
        return contador;
    }
    
    // Función que devuelve el array con los numeros pares
    public static int[] putParesEnArray(int[] listaNumeros) {
        int iPares = 0, pares = contarNumPares(listaNumeros);
        int[] paresVector = new int[pares];
        
        // Asigna numero al indice del array paresVector
        for (int numero : listaNumeros) {
            if(numero % 2 == 0) {
                paresVector[iPares] = numero;
                iPares++;
            }
        }
        
        return paresVector;
    }
    
    // Función que cuenta y devuelve la cantidad de numeros pares del array
    public static int contarNumPares(int[] listaNumeros) {
        int pares = 0;
        // Bucle que cuenta los pares del array
        for (int i : listaNumeros) {
            if(i % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }
    
    // Función que devuelve el array con los numeros impares
    public static int[] putImparesEnArray(int[] listaNumeros) {
        int iImpares = 0, impares = contarNumImpares(listaNumeros);
        int[] imparesVector = new int[impares];
        // Bucle que asigna el valor numero al indice del array imparesVector
        for (int numero : listaNumeros) {
            if(numero % 2 != 0) {
                imparesVector[iImpares] = numero;
                iImpares++;
            }
        }
        return imparesVector;
    }
    
    // Función que cuenta y devuelve la cantidad de numeros impares del array
    public static int contarNumImpares(int[] listaNumeros) {
        int impares = 0;
        // Bucle que cuenta los impares del array
        for (int i : listaNumeros) {
            if(i % 2 != 0) {
                impares++;
            }
        }
        return impares;
    }
    
    // Muestra el array que se le pasa
    public static String mostrarArray(int[] vector) {
        StringBuilder sb = new StringBuilder();
        
        // Bucle que concatena los numeros
        for (int elemento : vector) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(elemento);
        }
        
        return "[" + sb.toString() + "]";
    }
}
