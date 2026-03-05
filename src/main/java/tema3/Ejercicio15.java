package tema3;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        // Variables
        Scanner t = new Scanner(System.in);
        String mes;

        // Campos a rellenar
        System.out.print("Introduce el nombre del mes(ej. Enero) y te diremos el numero de dias que tiene: ");
        mes = t.next();

        // Casos
        switch (mes) {
            case "Enero":
                System.out.println("Tiene 31 dias");
                break;
            case "Febrero":
                System.out.println("Tiene 28 dias o 29 si es bisiesto");
                break;
            case "Marzo":
                System.out.println("Tiene 31 dias");
                break;
            case "Abril":
                System.out.println("Tiene 30 dias");
                break;
            case "Mayo":
                System.out.println("Tiene 31 dias");
                break;
            case "Junio":
                System.out.println("Tiene 30 dias");
                break;
            case "Julio":
                System.out.println("Tiene 31 dias");
                break;
            case "Agosto":
                System.out.println("Tiene 31 dias");
                break;
            case "Septiembre":
                System.out.println("Tiene 30 dias");
                break;
            case "Octubre":
                System.out.println("Tiene 31 dias");
                break;
            case "Noviembre":
                System.out.println("Tiene 30 dias");
                break;
            case "Diciembre":
                System.out.println("Tiene 31 dias");
                break;
            default:
                System.out.println("Lo has escrito mal o ese mes no existe, procura poner mayuscula la primera.");
        }
    }
}
