package tema3;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
    	// Variables
    	Scanner t = new Scanner(System.in);
    	float numSolicitado;
   	 
    	// Campos solicitados
    	System.out.print("Introduce un numero real para saber si es casi-cero: ");
    	numSolicitado = t.nextFloat();
   	 
    	System.out.println("\nEstamos haciendo los calculos... :)\n");
   	 
    	// Condición y Resultado
    	if (numSolicitado > -1 && numSolicitado < 1 && numSolicitado != 0){
        	System.out.printf("\n%f es un numero casi 0 :)\n", numSolicitado);
    	} else {
        	System.out.printf("\n%f no es un numero casi 0 :(\n", numSolicitado);
    	}
	}
}
