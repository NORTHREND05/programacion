package tema4;

public class Ejercicio10 {
    public static int CANTIDAD = 10;
    public static void main(String[] args) {
        int num = 1, contador;
        for(contador = 1; contador < CANTIDAD; contador++) {
            System.out.printf("%d*", num);
            num += 2;
        }
        System.out.printf("%d\n", num);
    }
}
