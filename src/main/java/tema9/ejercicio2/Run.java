package tema9.ejercicio2;

import com.github.javafaker.Faker;
import java.util.*;

public class Run {
    public static void main(String[] args) {
        HashMap<String, Persona> personas;
        
        personas = rellenarPersonas(3);
        System.out.println(mostrarPersonas(personas));
    }
    
    // Método que rellena el mapa de personas
    public static HashMap<String, Persona> rellenarPersonas(int n) {
        HashMap<String, Persona> personas = new HashMap<>();
        Faker f = new Faker();
        Persona p;
        byte edad;
        
        // Crea la persona y el nif, añadelo al map de personas n veces
        for (int i = 0; i < n; i++) {
            edad = (byte) (Math.random() * 128);
            p = new Persona(f.name().firstName(), f.name().lastName(), f.name().lastName(), edad);
            p.setNif((long) (Math.random() * 99999999));
            
            personas.put(p.getNif(), p);
        }
        
        return personas;
    }
    
    // Método que muestra las personas que hay dentro del mapa
    public static String mostrarPersonas(HashMap<String, Persona> personas) {
        StringBuilder sb = new StringBuilder();
        Set<String> k = personas.keySet();
        
    // Recorre las keys y muestra sus valores
        for (String key : k) {
            sb.append(personas.get(key).mostrarPersona());
        }
        
        return sb.toString();
    }
}
