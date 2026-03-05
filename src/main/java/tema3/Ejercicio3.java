package tema3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
    	Scanner t = new Scanner(System.in);
    	int numSolicitado1, numSolicitado2;
   	 
    	System.out.print("Introduce dos numeros distintos separados por un espacio para saber cual es mayor: ");
    	numSolicitado1 = t.nextInt();
    	numSolicitado2 = t.nextInt();
   	 
    	System.out.println("Estamos haciendo los calculos... :)");
   	 
    	if (numSolicitado1 > numSolicitado2){
        	System.out.printf("%d es mayor que %d", numSolicitado1, numSolicitado2);
    	} else if (numSolicitado1 < numSolicitado2){
        	System.out.printf("%d es mayor que %d", numSolicitado2, numSolicitado1);
    	}
	}
}
