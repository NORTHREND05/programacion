package tema11.contenedor;

import com.github.javafaker.Faker;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Contenedor<String> c1 = new Contenedor();
        Contenedor<Integer> c2 = new Contenedor();
        List<Double> l = new ArrayList<>();
        Faker f = new Faker();
        
        for (int i = 0; i < 5; i++) {
            c1.agregar(f.name().firstName());
            c2.agregar(f.number().numberBetween(1, 10));
            l.add((double) f.number().numberBetween(1, 10));
        }
        
        Contenedor.imprimirContenedor(c1);
        Contenedor.imprimirContenedor(c2);
        System.out.println("Total: " + Contenedor.sumarNumeros(l));
    }
}
