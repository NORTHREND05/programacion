package tema8;

import java.util.*;
import static mislibrerias.Colecciones.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        LinkedHashSet<String> nomAlumnos;
        
        nomAlumnos = rellenaConjunto("Nombre(escribe fin para parar): ", "fin");
        
        System.out.println("Nombres de alumnos: \n" + mostrarColeccion(nomAlumnos));
    }
    
    // Rellena un conjunto guardando el orden de inserción
    public static LinkedHashSet<String> rellenaConjunto(String msg, String stop) {
        LinkedHashSet<String> conjunto = new LinkedHashSet();
        Scanner sc = new Scanner(System.in);
        String txt;
        
        // Pedir mientras no introduzca la palabra para parar
        do {
            System.out.print(msg);
            txt = sc.nextLine();
            if(!txt.equalsIgnoreCase(stop)) {
                conjunto.add(txt);
            }
        } while (!txt.equalsIgnoreCase(stop));
        
        return conjunto;
    }
}
