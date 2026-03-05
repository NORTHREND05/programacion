package tema4;

public class Ejercicio7 {

    public static void main(String[] args) {
        // Variables
        byte num;
        // Bucle que se salta los numeros pares
        for (num = 1; num < 10; num++) {
            if (num % 2 == 0) {
                continue;
            }
            System.out.printf("%d ", num);
        }
        System.out.println();
    }
}
