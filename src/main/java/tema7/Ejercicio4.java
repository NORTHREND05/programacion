package tema7;

import java.util.Scanner;
import static mislibrerias.EntradaDatos.*;

public class Ejercicio4 {
    // Devuelve un array de n numeros introducidos por el usuario
    public static int[] getNumeros(String msg, int num) {
        Scanner t = new Scanner(System.in);
        int[] listaNumeros = new int[num];
        
        // rellena el array con numero n veces
        for (int i = 0; i < num; i++) {
            System.out.print(msg);
            listaNumeros[i] = t.nextInt();
        }
        
        return listaNumeros;
    }
    
    // Función que devuelve la media de los numeros positivos del array
    public static float getMediaNumPositivos(int[] numeros) {
        int contNumPos = 0, acumulador = 0;
        float media;
        
        // Recorre el array y si el numero es + aumenta el contador de numPos y acumula su valor
        for (int numero : numeros) {
            if (numero > 0) {
                contNumPos++;
                acumulador += numero;
            }
        }
        
        // Si hay numeros positivos hacer la media sino 0 directamente
        if (contNumPos > 0) {
            media = (float) acumulador / contNumPos;
        } else {
            media = (float) 0.0;
        }
        
        return media;
    }
    
    // Función que devuelve la media de numeros negativos del array
    public static float getMediaNumNegativos(int[] numeros) {
        int contNumNeg = 0, acumulador = 0;
        float media;
                
        // Recorre el array y si el numero es - aumenta el contador de numNeg y acumula su valor
        for (int numero : numeros) {
            if (numero < 0) {
                contNumNeg++;
                acumulador += numero;
            }
        }
        
        // Si hay numeros negativos hacer la media sino 0 directamente
        if (contNumNeg > 0) {
            media = (float) acumulador / contNumNeg;
        } else {
            media = (float) 0.0;
        }
        
        return media;
    }
    
    // Función que devuelve el numero de 0 introducidos
    public static int getNCeros(int[] numeros) {
        int contador = 0;
        
        // Bucle que cuenta los 0
        for (int numero : numeros) {
            if(numero == 0) {
                contador++;
            }
        }
        
        return contador;
    }
    
    public static void main(String[] args) {
        int num = getPositiveNumber(
                "Introduce un numero > 0 (luego deberas teclear numeros n veces): ",
                "Error.\nEl numero debe ser > 0."
        );
        int[] numeros = getNumeros("Numero: ", num);
        
        System.out.println("La media de los numeros positivos es: " + getMediaNumPositivos(numeros));
        System.out.println("La media de los numeros negativos es: " + getMediaNumNegativos(numeros));
        System.out.println("El numero de ceros introducidos es: " + getNCeros(numeros));
    }
}
