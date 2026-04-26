package tema11.gestion_clinica_veterinaria;

import com.github.javafaker.Faker;
import java.util.*;

public class Clinica {
    private String nombre;
    private String ciudad;
    private HashMap<Integer, Mascota> mascotas;

    public Clinica(String nombre, String ciudad, Mascota mascota) throws Exception {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.mascotas = new HashMap<>();
        
        if (mascota == null) {
            throw new Exception("Error: La clinica debe tener al menos una mascota.");
        }
        addMascota(mascota);
        rellenarClinica(35);
    }
    
    public boolean addMascota(Mascota m) {
        if (m == null) return false;
        
        if (mascotas.containsKey(m.getId())) return false;
        
        mascotas.put(m.getId(), m);
        return true;
    }

    private void rellenarClinica(int tam) {
        Faker f = new Faker();
        Mascota m;
        
        do {
            m = new Mascota(f.number().numberBetween(10000000, 99999999), f.cat().name(), f.animal().name());
            m.setEdad((byte) f.number().numberBetween(0, 100));
            m.setPeso((float) f.number().randomDouble(2, 2, 100));
            addMascota(m);
        } while (mascotas.size() < tam);
    }
    
    public ArrayList<Mascota> getMascotasPorEspecie(String especie) {
        ArrayList<Mascota> lista = new ArrayList<>();
        
        if(especie == null) return lista;
        
        for (Mascota m : mascotas.values()) {
            if (m.getEspecie() != null && m.getEspecie().equalsIgnoreCase(especie)) {
                lista.add(m);
            }
        }
        // Ordenadar por orden natural(edad)
        Collections.sort(lista);
        return lista;
    }
    
    public float getPesoTotalMascotas() {
        float total = 0;
        
        for (Mascota m : mascotas.values()) {
            total += m.getPeso();
        }
        return total;
    }
    
    public Mascota getMascotaMasVieja() {
        Mascota masVieja = null;
        
        // Si la mascota m es mayor que la mas mayor entonces pasa a ser la mas mayor
        for (Mascota m : mascotas.values()) {
            if (masVieja == null || m.getEdad() > masVieja.getEdad()) {
                masVieja = m;
            }
        }
        return masVieja;
    }
    
    public String getMascotas() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("MASCOTAS:\n");
        for (Mascota m : mascotas.values()) {
            sb.append(m + "\n");
        }
        
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\tCiudad: " + ciudad;
    }
}
