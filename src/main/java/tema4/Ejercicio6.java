package tema4;

public class Ejercicio6 {
    public static final short CANTIDAD = 10;
    public static void main(String[] args) {
        // Variables
        int num = 1, producto = 1, contador = 0;
        // While para obtener el producto de los primeros 10 num impares
        // Solución mía optimizada
        for (contador = 0; contador < CANTIDAD; contador++) {
            producto *= num;
            num += 2;
        }
        System.out.printf("%d\n", producto);
        // Solución del profesor
//        while (contador < CANTIDAD) {
//            producto *= num;
//            num += 2;
//            contador++;
//        }
//        System.out.printf("%d\n", producto);
    }
}
