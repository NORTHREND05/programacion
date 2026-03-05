package tema3;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        // Variables
        Scanner t = new Scanner(System.in);
        int numSolicitado;
        
        // Campo a rellenar
        System.out.print("Introduce 1 numero entero entre 1 y 7 para mostrarte el dia de la semana correspondiente: ");
        numSolicitado = t.nextInt();
        
        // Switch para mostrar día según caso
        switch (numSolicitado) {
            case 1:
                System.out.println("Corresponde al Lunes");
                break;
            case 2:
                System.out.println("Corresponde al Martes");
                break;
            case 3:
                System.out.println("Corresponde al Miercoles");
                break;
            case 4:
                System.out.println("Corresponde al Jueves");
                break;
            case 5:
                System.out.println("Corresponde al Viernes");
                break;
            case 6:
                System.out.println("Corresponde al Sabado");
                break;
            case 7:
                System.out.println("Corresponde al Domingo");
                break;
            default:
                System.out.println("El numero no corresponde con lo que pedimos >:(");
        }
    }
}
