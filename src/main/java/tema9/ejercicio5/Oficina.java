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
        id = (int) (Math.random() * 99999999);
    }
    
    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
    
    // Método que añade un ordenador a la colección
    public boolean addOrdenador(Ordenador ordenador) {
        // Si el ordenador enviado es nulo entonces no lo añade
        if(ordenador == null) return false;
        
        // Si el ordenador ya existe en el mapa no lo añade
        if(ordenadores.containsKey(ordenador.getNumSerie())) return false;
        
        ordenadores.put(ordenador.getNumSerie(), ordenador);
        return true;
    }
    
    // Método que elimina un ordenador de la colección
    public boolean removeOrdenador(String numSerie) {
        // Si no existe un ordenador con ese numero de serie entonces no borra
        if (!ordenadores.containsKey(numSerie)) return false;
        
        ordenadores.remove(numSerie);
        return true;
    }
    
    // Método que devuelve una lista de ordenadores con la misma ram, ordenados por numSerie
    public TreeSet<Ordenador> getOrdenadoresMismaRAM(byte ram) {
        ComparaOrdenador comparator = new ComparaOrdenador();
        TreeSet<Ordenador> lista = new TreeSet<>(comparator);
        Ordenador o;
        // Recorre la coleccion y añade los ordenadores con misma ram
        for (String key : ordenadores.keySet()) {
            o = ordenadores.get(key);
            
            if (o.getRam() == ram) {
                lista.add(o);
            }
        }
        
        return lista;
    }
    
    // Método que calcula la suma total del almacenamiento de los ordenadores de la oficina
    public int getTotalAlmacenamiento() {
        int total = 0;
        Ordenador o;
        
        // Recorremos la coleccion de ordenadores y acumulamos su almacenamiento
        for (String key : ordenadores.keySet()) {
            o = ordenadores.get(key);    
            total += o.getAlmacenamiento();
        }
        
        return total;
    }
    
    // Método que calcula la media del almacenamiento de los ordenadores.
    public double getMediaAlmacenamiento() {
        // Si no hay ordenadores devuelve 0
        if(ordenadores.isEmpty()) return 0;
        
        return getTotalAlmacenamiento() / ordenadores.size();
    }
    
    // Método que devuelve el ordenador con menor cantidad de RAM.
    public Ordenador getOrdenadorMenosRAM() {
        Ordenador o, menor = null;
        
        for (String key : ordenadores.keySet()) {
            o = ordenadores.get(key);
            
            // Si menor es nulo asignale o, sino, si la ram de o es > a 
            // la de menor, guardalo como menor 
            if (menor == null) {
                menor = o;
            } else if (o.getRam() < menor.getRam()) {
                menor = o;
            }
        }
        
        return menor;
    }
    
    // Método que cuenta los ordenadores que tienen una misma CPU
    public int getOrdenadoresMismaCPU(String cpu) {
        int contador = 0;
        Ordenador o;
        
        for (String key : ordenadores.keySet()) {
            o = ordenadores.get(key);
            
            // Si la cpu del ordenador coincide con la del parametro aumenta el contador
            if(cpu != null && cpu.equals(o.getCpu())) {
                contador++;
            }
        }
        
        return contador;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { // Identicos = Iguales
            return true;
        }
        if (obj == null) {
            return false;
        }
        if(this.getClass() != obj.getClass()) {
            return false;
        }
        Oficina o = (Oficina) obj;
        return this.id == o.id;
    }

    @Override
    public int hashCode() {
        return (3234 * id) % 100;
    }
    
    @Override
    public int compareTo(Oficina o) {
        // Si no se puede por nombre entonces por ubicacion
        if(this.nombre.compareTo(o.nombre) == 0) {
            return this.ubicacion.compareTo(o.ubicacion);
        }
        
        return this.nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return "Nombre de la oficina: " + nombre + "\n" +
               "Ubicación: " + ubicacion + "\n" +
               "Responsable: " + responsable + "\n" +
               ordenadores.values().toString();
    }
}
