package mislibrerias;

import java.util.Scanner;

public class EntradaDatos {
    static Scanner t = new Scanner(System.in);
    public static int getPositiveNumberOrZero(String msg, String error) {
        int num;
        do {
            System.out.print(msg);
            num = t.nextInt();
            if (num < 0) {
                System.out.println(error);
            }
        } while (num < 0);
        return num;
    }
    public static int getPositiveNumber(String msg, String error) {
        int num;
        do {
            System.out.print(msg);
            num = t.nextInt();
            if (num < 1) {
                System.out.println(error);
            }
        } while (num < 1);
        return num;
    }
    public static int getNumberGreaterThan(String msg, String error, int mayorQue) {
        int num;
        do {
            System.out.print(msg);
            num = t.nextInt();
            if (num <= mayorQue) {
                System.out.println(error);
            }
        } while (num <= mayorQue);
        return num;
    }
    public static int getPositiveNumberEImpar(String msg, String error) {
        int num;
        do {
            System.out.print(msg);
            num = t.nextByte();
            if(num<1 || num%2 == 0){
                System.out.println(error);
            }
        } while (num<1 || num%2 == 0);
        return num;
    }
    
    // Devuelve un string introducido por el usuario
    public static String getString(String msg) {
        String entrada;
        
        System.out.print(msg);
        entrada = t.nextLine();
    
        return entrada;
    }
    
    // Devuelve un string introducido por el usuario
    public static int getNumero(String msg) {
        int entrada;
        
        System.out.print(msg);
        entrada = t.nextInt();
    
        return entrada;
    }
}