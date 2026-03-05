package tema4;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Variables
        byte num;
        // Bucle que evita los multiplos de 7 y finaliza con el 70
        for (num = 1; num <= 100; num++) {
            if (num == 70) {
                break;
            }
            if (num % 7 == 0) {
                continue;
            }
            System.out.printf("%d\n", num);
        }
        System.out.println("El numero 70 esta prohibido en este programa >:(");
    }
}