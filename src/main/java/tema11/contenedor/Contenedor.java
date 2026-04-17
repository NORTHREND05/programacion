package tema11.contenedor;

import java.util.*;

public class Contenedor<T> {
    private ArrayList<T> al;
    
    public Contenedor() {
        al = new ArrayList<>();
    }
    
    // Método para añadir elementos.
    public boolean agregar(T elemento) {
        if (elemento == null) return false;
        
        al.add(elemento);
        return true;
    }
    
    // Método que devuelve un elemento.
    public T obtener(int indice) {
        return al.get(indice);
    }
    
    // Método que devuelve el número de elementos.
    public int tamano() {
        return al.size();
    }
    
    // Método que recorre el contenedor e imprime todos sus elementos
    public static <T> void imprimirContenedor(Contenedor<T> contenedor) {
        for (int i = 0; i < contenedor.tamano(); i++) {
            System.out.println(contenedor.obtener(i));
        }
    }
    
    // Método que calcula la suma total y devuelve el resultado como double
    public static <T extends Number> double sumarNumeros(List<T> lista) {
        double total = 0.0;
        
        for (T t : lista) {
            total += t.doubleValue();
        }
        
        return total;
    }
}
