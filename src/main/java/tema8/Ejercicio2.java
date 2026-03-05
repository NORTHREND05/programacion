package tema8;

import java.util.*;

public class Ejercicio2 {
    public static final short TAM = 20;
    public static final short MIN = 0;
    public static final short MAX = 100;
    
    public static void main(String[] args) {
        TreeSet<Byte> tConjunto = new TreeSet<>();
        HashSet<Byte> hConjunto;
        
        hConjunto= rellenaColeccion(TAM, MIN, MAX);
        System.out.println("Lista desordenada\n" + mostrarColeccion(hConjunto));
        
        tConjunto.addAll(hConjunto);
        System.out.println("Lista ordenada\n" + mostrarColeccion(tConjunto));
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
    
    // Metodo que rellena una conjunto
    public static HashSet rellenaColeccion(int t, int min, int max) {
        HashSet hAux = new HashSet<>();
        byte b;
        
        // Añade valor random mientras sea menor que el tamaño
        while (hAux.size() < t) {
            b = (byte) (Math.random() * (max - min) + min);
            hAux.add(b);
        }
        
        return hAux;
    }
}
