package tema3;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
    	Scanner t = new Scanner(System.in);
    	int numSolicitado1, numSolicitado2;
   	 
    	System.out.print("Introduce dos numeros separados por un espacio para saber si son iguales o no: ");
    	numSolicitado1 = t.nextInt();
    	numSolicitado2 = t.nextInt();
   	 
    	if(numSolicitado1 == numSolicitado2) {
        	System.out.printf("\n%d y %d son iguales\n", numSolicitado1, numSolicitado2);
    	} else {
        	System.out.printf("\n%d y %d no son iguales\n", numSolicitado1, numSolicitado2);
    	}
	}
}
