package tema5;

import static mislibrerias.Matematicas.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        // 1 para mostrar el area y 2 para el volumen
        int altura = 10, radio = 5;
        double resultado = getAreaOrVolumenCilindro(2, altura, radio);
        System.out.println(resultado);
    }
}
