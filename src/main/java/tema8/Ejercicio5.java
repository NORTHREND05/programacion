package tema8;

import java.util.*;
import static mislibrerias.EntradaDatos.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        String texto = getString("Introduce una palabra o frase: ");

        if (esPalindromo(texto)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }
    }

    public static boolean esPalindromo(String texto) {
        StringBuilder invertido = new StringBuilder();
        Stack<Character> pila = new Stack<>();
        texto = limpiarTexto(texto);

        // Introducimos los caracteres en la pila
        for (int i = 0; i < texto.length(); i++) {
            pila.push(texto.charAt(i));
        }

        // Construimos la palabra invertida usando pop()
        while (!pila.isEmpty()) {
            invertido.append(pila.pop());
        }

        return texto.equals(invertido.toString());
    }

    public static String limpiarTexto(String texto) {
        return texto.replaceAll("\\s+", "").toLowerCase();
    }
}
