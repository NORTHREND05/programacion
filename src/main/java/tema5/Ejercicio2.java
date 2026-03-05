package tema5;

import java.util.Scanner;

public class Ejercicio2 {
    // Función que devuelve T o F si el char es vocal
    public static boolean esVocal(char caract) {
    	boolean vocal = false;
    	if(caract=='a'||caract=='e'||caract=='i'||caract=='o'||caract=='u') {
            vocal = true;
    	}
    	if(caract=='A'||caract=='E'||caract=='I'||caract=='O'||caract=='U') {
            vocal = true;
    	}
    	if(caract=='á'||caract=='é'||caract=='í'||caract=='ó'||caract=='ú') {
            vocal = true;
    	}
    	if(caract=='Á'||caract=='É'||caract=='Í'||caract=='Ó'||caract=='Ú') {
            vocal = true;
    	}
    	return vocal;
    }
    public static void main(String[] args) {
        // Variables
        Scanner t = new Scanner(System.in);
        char caracter;
        boolean vocal;
        // Solicitud
        System.out.print("Introduce un caracter: ");
        caracter = t.next().charAt(0);
        // Resultado obtenido llamando a la función esVocal
        vocal = esVocal(caracter);
        if (vocal) {
            System.out.println("Es vocal");
        } else {
            System.out.println("No es vocal");
        }
    }
}
