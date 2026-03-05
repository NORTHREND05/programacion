package tema3;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
    	// Variables
    	Scanner t = new Scanner(System.in);
    	int numSolicitado1, numSolicitado2;
    	String s;
   	 
    	// Campos solicitados
    	System.out.print("Introduce dos numeros enteros separados por un espacio para ordenarlos de forma creciente: ");
    	numSolicitado1 = t.nextInt();
    	numSolicitado2 = t.nextInt();
   	 
    	// Ternario y Resultado
    	s = numSolicitado1 < numSolicitado2 ? numSolicitado1 + " " + numSolicitado2 : numSolicitado2 + " " + numSolicitado1;
    	System.out.println(s);
	}
}
