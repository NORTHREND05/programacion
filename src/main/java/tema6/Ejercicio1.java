package tema6;

import java.util.Scanner;

public class Ejercicio1 {
    // Muestra las respuestas de todos los metodos de Character
    public static String mostrarMetodosCharacter(char caracter) {
        StringBuilder aux = new StringBuilder();

        aux.append("Es letra o digito? ").append(Character.isLetterOrDigit(caracter)).append("\n");
        aux.append("Es digito? ").append(Character.isDigit(caracter)).append("\n");
        aux.append("Es letra? ").append(Character.isLetter(caracter)).append("\n");
        aux.append("Es mayuscula? ").append(Character.isUpperCase(caracter)).append("\n");
        aux.append("Es minuscula? ").append(Character.isLowerCase(caracter)).append("\n");
        aux.append("En mayuscula: ").append(Character.toUpperCase(caracter)).append("\n");
        aux.append("En minuscula: ").append(Character.toLowerCase(caracter)).append("\n");

        return aux.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char caracter;
        //Pedir un caracter y mostrar las respuestas de los metodos mientras no ponga F
        do {
            System.out.print("Ingresa un caracter (F para terminar): ");
            caracter = sc.nextLine().charAt(0);
            if (caracter != 'F') {
                System.out.print(mostrarMetodosCharacter(caracter));
            }
        } while (caracter != 'F');
    }
}
