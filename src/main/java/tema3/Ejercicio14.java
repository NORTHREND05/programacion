package tema3;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        // Variables
        Scanner t = new Scanner(System.in);
        int numSol, decenas, unidades;

        // Campo solicitado
        System.out.print("Introduce un numero del 1 al 99: ");
        numSol = t.nextInt();

        // Switch y Condiciones para mostrar los números
        if (numSol >= 1 && numSol <= 99) {
            decenas = numSol / 10;
            unidades = numSol % 10;
            // Casos especiales del 10 al 19
            if (numSol >= 10 && numSol <= 15) {
                switch (numSol) {
                    case 10:
                        System.out.println("diez");
                        break;
                    case 11:
                        System.out.println("once");
                        break;
                    case 12:
                        System.out.println("doce");
                        break;
                    case 13:
                        System.out.println("trece");
                        break;
                    case 14:
                        System.out.println("catorce");
                        break;
                    case 15:
                        System.out.println("quince");
                        break;
                }
            } else if (numSol >= 16 && numSol <= 19) {
                switch (unidades) {
                    case 6:
                        System.out.println("dieciseis");
                        break;
                    case 7:
                        System.out.println("diecisiete");
                        break;
                    case 8:
                        System.out.println("dieciocho");
                        break;
                    case 9:
                        System.out.println("diecinueve");
                        break;
                }
            } else {
                // casos del 1 al 9 y del 20 al 99
                switch (decenas) {
                    case 2:
                        if (numSol == 20) {
                            System.out.print("veinte");
                        } else {
                            System.out.print("Veinti");
                        }
                        break;
                    case 3:
                        System.out.print("Treinta");
                        break;
                    case 4:
                        System.out.print("Cuarenta");
                        break;
                    case 5:
                        System.out.print("Cincuenta");
                        break;
                    case 6:
                        System.out.print("Sesenta");
                        break;
                    case 7:
                        System.out.print("Setenta");
                        break;
                    case 8:
                        System.out.print("Ochenta");
                        break;
                    case 9:
                        System.out.print("Noventa");
                        break;
                }
                // La " y " solo la mostramos en numeros de 31 en adelante
                if (decenas >= 3 && unidades != 0) {
                    System.out.print(" y ");
                }

                switch (unidades) {
                    case 1:
                        System.out.println("uno");
                        break;
                    case 2:
                        System.out.println("dos");
                        break;
                    case 3:
                        System.out.println("tres");
                        break;
                    case 4:
                        System.out.println("cuatro");
                        break;
                    case 5:
                        System.out.println("cinco");
                        break;
                    case 6:
                        System.out.println("seis");
                        break;
                    case 7:
                        System.out.println("siete");
                        break;
                    case 8:
                        System.out.println("ocho");
                        break;
                    case 9:
                        System.out.println("nueve");
                        break;
                }
            }
        } else {
            System.out.println("Numero fuera de rango. El numero debe ser entre 1 y 99.");
        }
    }
}