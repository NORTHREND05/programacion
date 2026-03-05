package tema8;

import java.util.*;

public class Ejercicio11 {
    public static void main(String[] args) {
        TreeMap<String, String> alumnos;
        
        alumnos = rellenaAlumnos("Dni: ", "Nombre completo: ", "FIN");
        
        System.out.println("Listado de Alumnos de DAW1");
        System.out.println("DNI\t\tNombre");
        System.out.println("\n" + mostrarAlumnos(alumnos));
    }
    
    // Función que rellena el map con el dni como key y el nombre como value (fin para terminar)
    public static TreeMap<String, String> rellenaAlumnos(String msg1, String msg2, String stop) {
        TreeMap<String, String> tAux = new TreeMap();
        Scanner sc = new Scanner(System.in);
        String dni, nombre;
        
        // Pedir tantos dni hasta que ponga FIN
        do {
            System.out.print(msg1);
            dni = sc.nextLine();
            
            if(!dni.equalsIgnoreCase(stop)) {
                System.out.print(msg2);
                nombre = sc.nextLine();
                tAux.put(dni, nombre);
            }
        } while (!dni.equalsIgnoreCase(stop));
        
        return tAux;
    }
    
    // Función que muestra el dni y el nombre completo de los alumnos dentro del map
    public static String mostrarAlumnos(Map<String, String> miMapa) {
        StringBuilder sb = new StringBuilder();
        Set<String> dni = miMapa.keySet();
        
        // Concatena la clave dni y el valor nombre
        for (String aux : dni) {
            sb.append(aux).append("\t\t").append(miMapa.get(aux)).append("\n");
        }
        
        return sb.toString();
    }
}
