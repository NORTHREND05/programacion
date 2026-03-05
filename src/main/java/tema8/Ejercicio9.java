package tema8;

import java.util.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        LinkedHashMap<String, List<Integer>> grupos = new LinkedHashMap<>();
        
        grupos.put("1DAW", Arrays.asList(18, 19, 20, 20, 21));
        grupos.put("2DAW", Arrays.asList(20, 39, 19, 26, 18));
        grupos.put("1DAM", Arrays.asList(19, 20, 22, 21, 23));
        
        for (String grupo : grupos.keySet()) {
            System.out.println(mostrarGrupo(grupo, grupos.get(grupo)));
        }
    }
    
    // Muestra los grupos con la media calculada
    public static String mostrarGrupo(String nombre, List<Integer> edades) {
        StringBuilder sb = new StringBuilder();
        double media;
        
        sb.append("Alumnos de ").append(nombre).append("\n");
        sb.append(edades).append("\n");

        media = calcularMedia(edades);
        sb.append("Media de edad: ").append(media);
        
        return sb.toString();
    }
    
    // Devuelve la media de edades
    public static double calcularMedia(List<Integer> edades) {
        int suma = 0;
        
        // Acumula el valor de las edades
        for (int edad : edades) {
            suma += edad;
        }
        
        return (double) suma / edades.size();
    }
}
