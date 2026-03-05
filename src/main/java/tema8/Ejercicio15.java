package tema8;

import java.util.*;

public class Ejercicio15 {
    public static void main(String[] args) {
        HashMap<String, String[]> tendencias = new HashMap<>();
        ArrayList<String> fechas = new ArrayList<>();

        tendencias.put("08-22-2016", new String[]{"#Rio2016", "#BSC", "#ECU"});
        tendencias.put("08-25-2016", new String[]{"#GYE", "#BRA"});
        tendencias.put("08-27-2016", new String[]{"#YoSoyEspol", "#GYE", "#BSC"});

        fechas.add("08-25-2016");
        fechas.add("08-27-2016");
        
        System.out.println("Tendencias en TODAS las fechas:");
        System.out.println(reportarTodasTendencias(tendencias, fechas));
        
        System.out.println("Tendencias en AL MENOS una fecha:");
        System.out.println(reportarTendencias(tendencias, fechas));
        
        System.out.println("Tendencias EXCLUYENTES:");
        System.out.println(tendenciasExcluyentes(tendencias, "08-25-2016", "08-27-2016"));
    }

    // -------------------------------------------------
    // Hashtags que fueron tendencia en TODAS las fechas
    // -------------------------------------------------
    public static String reportarTodasTendencias(HashMap<String, String[]> tendencias,ArrayList<String> fechas) {
        HashSet<String> comunes = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        String[] hashtags;
        int i;

        // Inicializa el conjunto con los hashtags de la primera fecha
        hashtags = tendencias.get(fechas.get(0));
        comunes.addAll(Arrays.asList(hashtags));

        // Realiza la intersección de hashtags con el resto de fechas
        for (i = 1; i < fechas.size(); i++) {
            hashtags = tendencias.get(fechas.get(i));
            comunes.retainAll(Arrays.asList(hashtags));
        }
        
        // Construye la salida con los hashtags comunes
        for (String h : comunes) {
            sb.append(h).append("\n");
        }

        return sb.toString();
    }

    // -------------------------------------------------
    // Hashtags que fueron tendencia en AL MENOS una fecha
    // -------------------------------------------------
    public static String reportarTendencias(HashMap<String, String[]> tendencias,ArrayList<String> fechas) {
        HashSet<String> resultado = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        String[] hashtags;
        
        // Une los hashtags de todas las fechas sin repetir
        for (String fecha : fechas) {
            hashtags = tendencias.get(fecha);
            resultado.addAll(Arrays.asList(hashtags));
        }
        
        // Construye la salida con los hashtags resultantes
        for (String h : resultado) {
            sb.append(h).append("\n");
        }

        return sb.toString();
    }

    // -------------------------------------------------
    // Hashtags exclusivos entre dos fechas
    // -------------------------------------------------
    public static String tendenciasExcluyentes(HashMap<String, String[]> tendencias,String fecha1,String fecha2) {
        HashSet<String> set1 = new HashSet<>(Arrays.asList(tendencias.get(fecha1)));
        HashSet<String> set2 = new HashSet<>(Arrays.asList(tendencias.get(fecha2)));
        HashSet<String> resultado = new HashSet<>(set1);
        StringBuilder sb = new StringBuilder();;
        
        // Calcula la diferencia simétrica entre los dos conjuntos
        resultado.addAll(set2);
        set1.retainAll(set2);
        resultado.removeAll(set1);
        
        // Construye la salida con los hashtags excluyentes
        for (String h : resultado) {
            sb.append(h).append("\n");
        }

        return sb.toString();
    }
}
