package tema9.ejercicio5;

import java.util.*;

public class Oficina implements Comparable<Oficina> {
    // Propiedades
    private int id;
    private String nombre;
    private String ubicacion;
    private String responsable;
    private HashMap<String, Ordenador> ordenadores;
    
    // Constructores
    public Oficina () {
        ordenadores = new HashMap<>();
    }

    public int getId() {
        return id;
    }
    
    public boolean addOrdenador(Ordenador ordenador) {
        // Si el ordenador enviado es nulo entonces no lo añade
        if(ordenador == null) return false;
        
        // Si el ordenador ya existe en el mapa no lo añade
        if(ordenadores.containsKey(ordenador.getNumSerie())) return false;
        
        ordenadores.put(ordenador.getNumSerie(), ordenador);
        return true;
    }
    
    public boolean removeOrdenador(String numSerie) {
        // Si no existe un ordenador con ese numero de serie entonces no borra
        if (!ordenadores.containsKey(numSerie)) return false;
        
        // Si existe lo borra
        ordenadores.remove(numSerie);
        return true;
    }
    
    public TreeSet<Ordenador> getOrdenadoresConMismaRAM(byte ram) {
        ComparaOrdenador comparator = new ComparaOrdenador();
        TreeSet<Ordenador> lista = new TreeSet(comparator);
        
        // Recorre la coleccion y añade los ordenadores a una lista ordenada por RAM
        for (String key : ordenadores.keySet()) {
            Ordenador o = ordenadores.get(key);
            lista.add(o);
        }
        
        return lista;
    }
    
    public double getTotalAlmacenamiento() {
        double total = 0;
        
        // Recorremos la coleccion de ordenadores y acumulamos su almacenamiento
        for (String key : ordenadores.keySet()) {
            Ordenador o = ordenadores.get(key);
            
            total += o.getAlmacenamiento();
        }
        
        return total;
    }
    
    public double getMediaAlmacenamiento() {
        return getTotalAlmacenamiento() / ordenadores.size();
    }
    
//    public Ordenador getMinRAMOrdenador() {
//        Ordenador minRAM;
//        
//        for (String key : ordenadores.keySet()) {
//            Ordenador o = ordenadores.get(key);
//            
//            if(o.getRam())
//        }
//        
//        return minRAM;
//    }
    
    public int getOrdenadoresConMismaCPU(String cpu) {
        int ordenadoresConMismaCPU = 0;
        
        for (String key : ordenadores.keySet()) {
            Ordenador o = ordenadores.get(key);
            
            // Si la cpu del ordenador coincide con la del parametro aumenta el contador
            if(o.getCpu().equals(cpu)) {
                ordenadoresConMismaCPU++;
            }
        }
        
        return ordenadoresConMismaCPU;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        
        Oficina o = (Oficina) obj;
        return this.id == o.id;
    }

    @Override
    public int hashCode() {
        return (3234 * id) % 100;
    }
    
    @Override
    public int compareTo(Oficina o) {
        int x = this.nombre.compareTo(o.nombre);
        
        // Si no se puede por nombre entonces por ubicacion
        if(x == 0) {
            x = this.ubicacion.compareTo(o.ubicacion);
        }
        
        return x;
    }

    @Override
    public String toString() {
        return "Nombre de la oficina: " + nombre + "\n" +
               "Ubicación: " + ubicacion + "\n" +
               "Responsable: " + responsable + "\n" +
               ordenadores;
    }
}
