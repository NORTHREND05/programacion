package tema11.profesional;

import java.util.ArrayList;
import java.util.Collections;

public class Equipo {
    // Propiedades
    private String nombre;
    private String liga;
    private Entrenador entrenador;
    private Futbolista[] futbolistas;

    // Constructor
    public Equipo(String nombre, String liga, Entrenador entrenador) {
        this.nombre = nombre;
        this.liga = liga;
        this.entrenador = entrenador;
        this.futbolistas = new Futbolista[26];
    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public String getLiga() {
        return liga;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }
    
    public boolean addFutbolista(Futbolista f) {
        if (f == null) return false;
        
        for (int i = 0; i < futbolistas.length; i++) {
            if (futbolistas[i] == null) {
                futbolistas[i] = f;
                return true;
            }
        }
        
        return false;
    }
    
    public ArrayList<Futbolista> getFutbolistasSinSeleccion() {
        ArrayList<Futbolista> lista = new ArrayList<>();
        
        for (Futbolista f : futbolistas) {
            if (f != null && f.getSeleccion() == null) {
                lista.add(f);
            }
        }
        
        return lista;
    }
    
    public String getSalariosNoSeleccionados() {
        StringBuilder sb = new StringBuilder();
        ArrayList<Futbolista> lista = getFutbolistasSinSeleccion();
        
        Collections.sort(lista);
        sb.append("Salarios de jugadores del "+nombre+" que no juegan en la seleccion:\n");
        for (Futbolista f : lista) {
            sb.append(f).append("\n");
        }
        
        return sb.toString();
    }
}
