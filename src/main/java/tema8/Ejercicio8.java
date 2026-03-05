package tema8;

import java.util.*;
import static mislibrerias.EntradaDatos.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        String frase = getString("Introduce una frase(con palabras separadas por espacios): ");
        ArrayList<String> palabras = rellenaLista(frase);
        
        System.out.println("Palabras repetidas: " + mostrarRepetidas(palabras));
        System.out.println("Palabras no repetidas: " + mostrarNoRepetidas(palabras));
    }

    // Convierte la frase en una lista de palabras
    public static ArrayList<String> rellenaLista(String frase) {
        return new ArrayList<>(Arrays.asList(frase.split(" ")));
    }

    // Devuelve las palabras repetidas (sin repetirlas en la salida)
    public static String mostrarRepetidas(ArrayList<String> lista) {
        ArrayList<String> repetidas = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        // Concatena las palabras repetidas y las añade a repetidas si sus 
        // indices no coinciden y si no estan ya en repetidas
        for (String palabra : lista) {
            if(lista.indexOf(palabra) != lista.lastIndexOf(palabra) && !repetidas.contains(palabra)) {
                sb.append(palabra).append(" ");
                repetidas.add(palabra);
            }
        }
        
        return sb.toString();
    }
    
    // Devuelve las palabras no repetidas
    public static String mostrarNoRepetidas(ArrayList<String> lista) {
        StringBuilder sb = new StringBuilder();
        
        // concatena las palabras no repetidas si sus indices coinciden
        for (String palabra : lista) {
            if (lista.indexOf(palabra) == lista.lastIndexOf(palabra)) {
                sb.append(palabra).append(" ");
            }
        }

        return sb.toString();
    }
}
