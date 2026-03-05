package tema4;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Variables
        Scanner t = new Scanner(System.in);
        byte valMin, valMax, num;
        // Campos solicitados
        System.out.print("Introduce un valor minimo y uno maximo separados por un espacio: ");
        valMin = t.nextByte();
        valMax = t.nextByte();
        System.out.print("\nAhora introduce un numero para saber si pertenece al rango propuesto: ");
        num = t.nextByte();
        // While infinito mientras el usuario ingrese un valor incorrecto
        while(num > valMax || num < valMin) {
            System.out.print("\nNo pertenece al rango propuesto :(, prueba otra vez: ");
            num = t.nextByte();
        }
        // Mensaje de aprobación del valor
        System.out.printf("\n%d si pertenece al rango propuesto :)\n\n", num);
    }
}