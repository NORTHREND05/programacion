package repaso2Eval.tema8repaso;

import java.util.Stack;

public class Ejercicio17 {
    public static void main(String[] args) {
        String exp = "(“x-3)*(y/3+6))”)";
        Stack<Character> pila = new Stack();
        
        System.out.println(estaEquilibrado(pila, exp));
    }

    private static boolean estaEquilibrado(Stack<Character> pila, String exp) {
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '(') {
                pila.push(exp.charAt(i));
            } else if (exp.charAt(i) == ')') {
                if (pila.isEmpty()) {
                    return false;
                } else {
                    pila.pop();
                }
            }
        }
        
        return pila.isEmpty();
    }
}
