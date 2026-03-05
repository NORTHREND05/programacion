package tema8;

import java.util.ArrayDeque;

public class Ejercicio16 {
     public static void main(String[] args) {

        // Pruebas unitarias
        System.out.println(estaEquilibrada("x-3*(y/3+6)"));        // true
        System.out.println(estaEquilibrada("((x-3)*(y/3+6))"));   // true
        System.out.println(estaEquilibrada("((x)"));              // false
        System.out.println(estaEquilibrada("x-3)*(y/3+6))"));     // false
    }

    // Comprueba si una expresión matemática está equilibrada en paréntesis
    public static boolean estaEquilibrada(String expresion) {
        ArrayDeque<Character> pila = new ArrayDeque<>();
        char c;

        // Recorre la expresión carácter a carácter
        for (int i = 0; i < expresion.length(); i++) {
            c = expresion.charAt(i);

            // Si es paréntesis de apertura, se apila
            if (c == '(') {
                pila.push(c);
            }

            // Si es paréntesis de cierre, se desapila
            if (c == ')') {
                if (pila.isEmpty()) {
                    return false; // No hay paréntesis de apertura correspondiente
                }
                pila.pop();
            }
        }

        // Si al final la pila está vacía, está equilibrada
        return pila.isEmpty();
    }
}
