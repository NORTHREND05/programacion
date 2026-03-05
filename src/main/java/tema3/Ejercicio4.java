package tema3;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
    	Scanner t = new Scanner(System.in);
    	int numSolicitado1, numSolicitado2;
   	 
    	System.out.print("Introduce dos numeros separados por un espacio para saber cual es mayor: ");
    	numSolicitado1 = t.nextInt();
    	numSolicitado2 = t.nextInt();
   	 
    	System.out.println("\nEstamos haciendo los calculos... :)\n");
   	 
    	if (numSolicitado1 == numSolicitado2){
        	System.out.printf("\n%d y %d son iguales prueba con otro numero la proxima :)\n", numSolicitado1, numSolicitado2);
    	} else if (numSolicitado1 > numSolicitado2){
        	System.out.printf("\n%d es mayor que %d\n", numSolicitado1, numSolicitado2);
    	} else if (numSolicitado1 < numSolicitado2){
        	System.out.printf("\n%d es mayor que %d\n", numSolicitado2, numSolicitado1);
    	}
	}
}
