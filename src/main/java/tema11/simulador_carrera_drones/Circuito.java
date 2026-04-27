package tema11.simulador_carrera_drones;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Circuito {
    private String nombre;
    private String ciudad;
    private HashMap<Integer, Drone> drones;

    public Circuito(String nombre, String ciudad, Drone drone) throws Exception {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.drones = new HashMap<>();
        
        if (drone == null) {
            throw new Exception("Error: Un circuito debe tener al menos un drone.");
        }
        addDrone(drone);
        rellenarCircuito(40);
    }
    
    public boolean addDrone(Drone d) {
        if (d == null) return false;
        if (drones.containsKey(d.getId())) return false;
        
        drones.put(d.getId(), d);
        return true;
    }
    
    public ArrayList<Drone> getDronesPorCategoria(String categoria) {
        ArrayList<Drone> lista = new ArrayList<>();
        
        if (categoria == null) return lista;
        for (Drone d : drones.values()) {
            if (d.getCategoria() != null && d.getCategoria().equalsIgnoreCase(categoria)) {
                lista.add(d);
            }
        }
        // Ordenados por orden natural de mayor velocidad a menor
        Collections.sort(lista);
        return lista;
    }
    
    public double getPrecioTotalDrones() {
        double total = 0;
        
        for (Drone d : drones.values()) {
            total += d.getPrecio();
        }
        return total;
    }
    
    public Drone getDroneMasRapido() {
        Drone masRapido = null;
        
        for (Drone d : drones.values()) {
            if (masRapido == null || d.getVelocidadMaxima() > masRapido.getVelocidadMaxima()) {
                masRapido = d;
            }
        }
        return masRapido;
    }

    private void rellenarCircuito(int tam) {
        Faker f = new Faker();
        Drone d;
        
        do {
            d = new Drone(f.number().numberBetween(10000000, 99999999), f.company().name(), f.company().industry());
            d.setAutonomia(f.number().numberBetween(100, 500));
            d.setVelocidadMaxima(f.number().numberBetween(160, 200));
            d.setPrecio(f.number().randomDouble(2, 500, 15000));
            addDrone(d);
        } while (drones.size() < tam);
    }
    
    public String getDrones() {
        StringBuilder sb = new StringBuilder();
        ArrayList<Drone> lista = new ArrayList<>(drones.values());
        
        Collections.sort(lista);
        
        sb.append("DRONES:\n");
        for (Drone d : lista) {
            sb.append(d + "\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\tCiudad: " + ciudad;
    }
}
