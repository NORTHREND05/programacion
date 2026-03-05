package mislibrerias;

import java.util.*;

public class Colecciones {
    // Método polimorfico que muestra un string de la coleccion
    public static String mostrarColeccion(Collection coleccion) {
        Iterator<Object> it = coleccion.iterator();
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append(it.next()).append(" ");
        }
        return sb.toString();
    }
    
    // Metodo que rellena una conjunto
    public static HashSet rellenaColeccion(int t, int min, int max) {
        HashSet hAux = new HashSet<>();
        byte b;
        
        while (hAux.size() != t) {
            b = (byte) (Math.random() * (max - min) + min);
            hAux.add(b);
        }
        
        return hAux;
    }
}
