package repaso2Eval.tema8repaso;

import java.util.*;

public class Ejercicio15 {
    public static void main(String[] args) {
        TreeMap<String, String[]> diccionario = new TreeMap<>();
        
        diccionario.put(
            "08-22-2016",
            new String[]{"#Rio2016", "#BSC", "#ECU"}
        );

        diccionario.put(
            "08-25-2016",
            new String[]{"#GYE", "#BRA"}
        );

        diccionario.put(
            "08-27-2016",
            new String[]{"#YoSoyEspol", "#GYE", "#BSC"}
        );
        ArrayList<String> l = new ArrayList<>();
        l.add("08-25-2016");
        l.add("08-27-2016");
//        System.out.println(tendenciasExcluyentes(diccionario, "08-25-2016", "08-27-2016"));
//        System.out.println(reportarTendencias(diccionario, l));
        System.out.println(reportarTodasTendencias(diccionario, l));
    }

    private static String tendenciasExcluyentes(TreeMap<String, String[]> d, String fecha1, String fecha2) {
        StringBuilder sb = new StringBuilder();
        
        if (!d.containsKey(fecha1) || !d.containsKey(fecha2)) {
            return "Fecha no encontrada";
        }
        
        for (String hash : d.get(fecha1)) {
            if (!contiene(d.get(fecha2), hash)) {
                sb.append(hash).append(" ");
            }
        }
        
        for (String hash : d.get(fecha2)) {
            if (!contiene(d.get(fecha1), hash)) {
                sb.append(hash).append(" ");
            }
        }
        return sb.toString();
    }
    
    public static String reportarTendencias(TreeMap<String, String[]> tendencias,ArrayList<String> fechas) {
        LinkedHashSet<String> resultado = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        String[] hashtags;
        
        // Une los hashtags de todas las fechas sin repetir
        for (String fecha : fechas) {
            if (!tendencias.containsKey(fecha)) {
                return "Fecha no encontrada";
            }
            hashtags = tendencias.get(fecha);
            resultado.addAll(Arrays.asList(hashtags));
        }
        
        // Construye la salida con los hashtags resultantes
        for (String h : resultado) {
            sb.append(h).append(" ");
        }

        return sb.toString();
    }
    
    public static String reportarTodasTendencias(TreeMap<String, String[]> tendencias, ArrayList<String> fechas) {
        StringBuilder sb = new StringBuilder();
        boolean estaEnTodas;

        if (fechas.isEmpty()) {
            return "No hay fechas";
        }

        for (String hash : tendencias.get(fechas.getFirst())) {
            estaEnTodas = true;

            for (int i = 0; i < fechas.size(); i++) {
                if (!contiene(tendencias.get(fechas.get(i)), hash)) {
                    estaEnTodas = false;
                    break;
                }
            }

            if (estaEnTodas) {
                sb.append(hash).append(" ");
            }
        }
        return sb.toString();
    }

    private static boolean contiene(String[] hashtags, String hash) {
        for (String hashtag : hashtags) {
            if (hashtag.equals(hash)) {
                return true;
            }
        }
        return false;
    }
}
