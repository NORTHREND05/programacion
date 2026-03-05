package tema8;

import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(
            Arrays.asList("Ana", "Luis", "Ana", "Pedro", "Luis", "Marta")
        );
        List<String> nombres2 = new ArrayList<>(nombres);
        List<String> sinRepetidos;
        
        // ===== PRUEBA 1: devuelve una nueva lista =====
        sinRepetidos = limpiaRepetidos(nombres);
        System.out.println("Lista original:");
        System.out.println(nombres);
        System.out.println("Nueva lista sin repetidos:");
        System.out.println(sinRepetidos);

        // ===== PRUEBA 2 y 3: modifica la lista recibida =====
        limpiaRepetidosVacio(nombres2);
        System.out.println("Lista modificada sin repetidos:");
        System.out.println(nombres2);
    }
    
    // Devuelve una lista sin elementos repetidos
    public static List limpiaRepetidos(List c) {
        Set<String> aux = new LinkedHashSet<>(c);
        
        return new ArrayList<>(aux);
    };

    // Modifica la lista recibida eliminando los repetidos;
    public static void limpiaRepetidosVacio(List c){
        Set<String> aux = new LinkedHashSet<>(c);
        c.clear();
        c.addAll(aux);
    };
}
