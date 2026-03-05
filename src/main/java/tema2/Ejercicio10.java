package tema2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        // Aquí declaramos las variables
        Scanner t = new Scanner(System.in);
        byte edad;
        short fRep;
        double fMax;
        double pObjetivo70, pObjetivo80,pObjetivo90,pObjetivo100;
        
        // Aquí solicitamos la información
        System.out.print("Introduce tu edad: ");
        edad = t.nextByte();
        System.out.print("Introduce tu frecuencia cardiaca en reposo: ");
        fRep = t.nextShort();
        
        // Aquí hacemos los calculos necesarios
        fMax = 208 - (0.7 * edad);
        pObjetivo70 = (fMax - fRep) * 0.7 + fRep;
        pObjetivo80 = (fMax - fRep) * 0.8 + fRep;
        pObjetivo90 = (fMax - fRep) * 0.9 + fRep;
        pObjetivo100 = (fMax - fRep) * 1.0 + fRep;
        
        // Aquí mostramos la tabla
        System.out.println("*****************************");
        System.out.println("* Porcentaje |   Valor      *");
        System.out.println("*****************************");
        System.out.println("* 70%        | " + (short)pObjetivo70 + "          *");
        System.out.println("* 80%        | " + (short)pObjetivo80 + "          *");
        System.out.println("* 90%        | " + (short)pObjetivo90 + "          *");
        System.out.println("* 100%       | " + (short)pObjetivo100 + "          *");
        System.out.println("*****************************");
    }
}
