package tema8;

import java.util.*;

public class Ejercicio3 {
    public static final short TAM = 20;
    public static final short MIN = 0;
    public static final short MAX = 100;
    
    public static void main(String[] args) {
        LinkedList<Integer> lista;
        
        lista = rellenaColeccion(TAM, MIN, MAX);
        System.out.println("Lista por orden de inserción\n" + mostrarColeccion(lista));
    }
    
    // Método polimorfico que muestra un string de la coleccion
    public static String mostrarColeccion(Collection coleccion) {
        Iterator<Object> it = coleccion.iterator();
        StringBuilder sb = new StringBuilder();
        
        // Mientras haya un valor concatenalo
        while (it.hasNext()) {
            sb.append(it.next()).append(" ");
        }
        
        return sb.toString();
    }
    
    // Metodo que rellena una lista por orden de inserción
    public static LinkedList<Integer> rellenaColeccion(int t, int min, int max) {
        LinkedList<Integer> aux = new LinkedList<>();
        int b;
        
        // Añade valor random mientras sea menor que el tamaño
        while (aux.size() < t) {
            b = (int) (Math.random() * (max - min) + min);
            aux.add(b);
        }
        
        return aux;
    }
}
