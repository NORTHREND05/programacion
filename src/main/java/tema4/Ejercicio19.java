package tema4;

public class Ejercicio19 {
    public static void main(String[] args) {
        byte cont1=1, cont2=2;
        for (int i = 0; i < 20; i++) {
            System.out.printf("%d %d ", cont1, cont2);
            cont1 += 4;
            cont2 += 2;
        }
    }
}
