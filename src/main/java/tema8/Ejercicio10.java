package tema8;

import java.util.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        ArrayDeque<Integer> cola1 = new ArrayDeque<>();
        ArrayDeque<Integer> cola2 = new ArrayDeque<>();
        ArrayList<Integer> resultado;
        // Datos del enunciado
        cola1.addAll(Arrays.asList(18, 12, 15, 19, 13));
        cola2.addAll(Arrays.asList(20, 13, 17, 18, 23));
        
        resultado = acomodarEspectadores(cola1, cola2);
        
        System.out.println(resultado);
    }
    
    public static ArrayList<Integer> acomodarEspectadores(ArrayDeque<Integer> cola1, ArrayDeque<Integer> cola2) {
        ArrayList<Integer> salida = new ArrayList<>();
        int e1, e2;
        
        // Mientras las colas no esten vacias
        while (!cola1.isEmpty() || !cola2.isEmpty()) {
            // Si una cola está vacía, entra la otra
            if (cola1.isEmpty()) {
                salida.add(cola2.poll());
            } else if (cola2.isEmpty()) {
                salida.add(cola1.poll());
            } else {
                e1 = cola1.peek();
                e2 = cola2.peek();

                if (e1 >= e2) { // prioridad cola 1 en empate
                    salida.add(cola1.poll());
                } else {
                    salida.add(cola2.poll());
                }
            }
        }

        return salida;
    }
    
    public static String mostrarCola(ArrayList<Integer> resultado) {
        StringBuilder sb = new StringBuilder();
        Iterator<Integer> it = resultado.iterator();
        
        // Concatena los valores de la cola
        while (it.hasNext()) {
            sb.append(it.next()).append(" ");
        }
        
        return sb.toString();
    }
}
