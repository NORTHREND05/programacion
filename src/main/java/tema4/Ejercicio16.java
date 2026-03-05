package tema4;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        // Variables
        Scanner t = new Scanner(System.in);
        byte tamano, n;
        // Campo solicitado y validación
        do{
            System.out.print("Introduce un numero: ");
            n = t.nextByte();
            if(n < 0){
                System.out.println("Numero no valido, prueba otra vez");
            }
        }while(n < 0);
        // Bucle para dibujar el triangulo
        for (; n > 0; n--) {
            for (tamano = n; tamano > 0; tamano--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
