package tema8;

import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        TreeSet<Integer> conjunto = rellenaColeccion(20, 0, 25);
        int limite = 10;
        
        System.out.println("Original:\n" + conjunto.toString());
        System.out.println("Numeros menores de 10:\n" + mostrarMenoresDe(conjunto, limite));
    }
    
    public static TreeSet<Integer> rellenaColeccion(int t, int min, int max) {
        TreeSet<Integer> tsAux = new TreeSet();
        int n;
        
        // Rellena el conjunto de numeros random
        while (tsAux.size() < t) {
            n = (int) ((Math.random() * max - min) + min);
            tsAux.add(n);
        }
        
        return tsAux;
    }

    public static String mostrarMenoresDe(TreeSet<Integer> conjunto, int limite) {
        StringBuilder sb = new StringBuilder();
        Iterator it = conjunto.iterator();
        int num;
        
        // Mientras haya valores concatena los menores 
        while (it.hasNext()) {
            num = (int) it.next();
            if(num < limite) {
                sb.append(num).append(" ");
            } else {
                break; 
            }
        }
        
        return sb.toString();
    }
}
