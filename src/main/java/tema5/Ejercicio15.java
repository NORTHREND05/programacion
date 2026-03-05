package tema5;

import java.util.Scanner;

public class Ejercicio15 {
    public static String mayor(String s) {
        Scanner sc = new Scanner(s);
        int num;
        String aux = "";
        // Bucle va mostrando numeros y se detiene cuando hay un -1
        for (num = sc.nextInt(); num != -1;num = sc.nextInt()) {
            aux+= num + "\n";
        }
        return aux;
    }
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String aux;

        System.out.print("Introduzca una lista de numeros, -1 para finalizar: ");
        aux = t.nextLine();
        System.out.print(mayor(aux));
    }
}
