package tema9.ejercicio5;

import java.util.*;

public class ComparaOrdenador implements Comparator {
    
    /**
     * Compara objeto 1 con 2 como ordenadores. Devuelve negativo si es menor,
     * positivo si es mayor y 0 si son iguales.
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(Object o1, Object o2) {
        Ordenador or1 = (Ordenador) o1;
        Ordenador or2 = (Ordenador) o2;
        
        return or1.getNumSerie().compareTo(or2.getNumSerie());
    }
}
