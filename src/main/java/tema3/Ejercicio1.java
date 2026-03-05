package tema3;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
    	Scanner t = new Scanner(System.in);
    	int numSolicitado;
   	 
    	System.out.print("Introduce un numero para saber si es par o impar: ");
    	numSolicitado = t.nextInt();
   	 
    	if(numSolicitado % 2 == 0) {
        	System.out.printf("\n%d es par\n", numSolicitado);
    	} else {
        	System.out.printf("\n%d es impar\n", numSolicitado);
    	}
	}
}
