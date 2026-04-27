package tema11.simulacion_torneo_combate_mechas;

import com.github.javafaker.Faker;
import java.time.LocalDate;
import java.util.*;

public class Arena {
    private String nombre;
    private String ciudad;
    private HashMap<Integer, Mecha> mechas;
    private ArrayList<Combate> combates;

    public Arena(String nombre, String ciudad, Mecha mecha) throws Exception {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.mechas = new HashMap<>();
        this.combates = new ArrayList<>();
        
        if (mecha == null) {
            throw new IllegalArgumentException("Error: No puede existir una arena sin al menos un mecha.");
        }
        addMecha(mecha);
        rellenarArena(40);
    }

    public boolean addMecha(Mecha m) {
        if (m == null) return false;
        if (mechas.containsKey(m.getId())) return false;
        
        mechas.put(m.getId(), m);
        return true;
    }

    private void rellenarArena(int tam) throws Exception {
        Faker f = new Faker();
        Mecha m;
        PilotoNovato pn;
        PilotoProfesional pp;
        
        do {
            m = new Mecha(f.number().numberBetween(1000, 9999), f.name().username(), f.app().version());
            m.setBlindaje(f.number().numberBetween(1, 200));
            m.setPotencia(f.number().numberBetween(500, 1000));
            m.setPrecio(f.number().randomDouble(2, 1000, 15000));
            if (mechas.size() < tam / 2) {
                pn = new PilotoNovato(f.number().numberBetween(1000, 9999), f.name().fullName(), f.internet().emailAddress());
                pn.addMecha(m);
            } else {
                pp = new PilotoProfesional(f.number().numberBetween(1000, 9999), f.name().fullName(), f.internet().emailAddress());
                pp.setPorcentajeDescuento(15);
                pp.setFechaAlta(LocalDate.now());
                pp.addMecha(m);
            }
            addMecha(m);
        } while (mechas.size() < tam);
    }
    
    public ArrayList<Mecha> getMechasPorTipo(String tipo) {
        ArrayList<Mecha> lista = new ArrayList<>();
        if(tipo == null) return lista;
        
        for (Mecha m : mechas.values()) {
            if (m.getTipo() != null && m.getTipo().equalsIgnoreCase(tipo)) {
                lista.add(m);
            }
        }
        Collections.sort(lista);
        return lista;
    }
    
    public Mecha getMechaMasPotente() {
        Mecha masPotente = null;
        
        for (Mecha m : mechas.values()) {
            if (masPotente == null || m.getPotencia() > masPotente.getPotencia()) {
                masPotente = m;
            }
        }
        return masPotente;
    }
    
    public double getPrecioTotalMechas() {
        double total = 0;
        
        for (Mecha m : mechas.values()) {
            total += m.getPrecio();
        }
        return total;
    }
    
    public boolean registrarCombate(Combate c) {
        if (c == null) return false;
        // No comprobamos duplicidad ya que un combate se puede repetir por revancha
        return combates.add(c);
    }
    
    public ArrayList<Combate> getCombatesGanadosPorMecha(String nombre) {
        ArrayList<Combate> lista = new ArrayList<>();
        
        if (nombre == null) return lista;
        
        for (Combate c : combates) {
            if (c.getGanador() != null && c.getGanador().equalsIgnoreCase(nombre)) {
                lista.add(c);
            }
        }
        return lista;
    }
    
    public String getCatalogoMechas() {
        StringBuilder sb = new StringBuilder();
        ArrayList<Mecha> lista = new ArrayList<>(mechas.values());
        
        Collections.sort(lista);
        
        sb.append("MECHAS DISPONIBLES:\n");
        for (Mecha m : lista) {
            sb.append(m + "\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\tCiudad: " + ciudad;
    }
}
