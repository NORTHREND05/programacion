package tema11.profesional;

import com.github.javafaker.Faker;
import java.util.*;

public class Empresa {
    private String cif;
    private String nombre;
    private boolean esPrivada;
    private TreeMap<Integer, Profesional> profesionales;

    public Empresa(String cif, String nombre, Profesional p) throws Exception {
        this.cif = cif;
        this.nombre = nombre;
        this.profesionales = new TreeMap<>();
        
        if (p == null) {
            throw new Exception("Una empresa debe tener al menos un profesional.");
        } else {
            profesionales.put(p.getId(), p);
        }
        
        rellenarEmpresa();
    }

    public String getCif() {
        return cif;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esPrivada() {
        return esPrivada;
    }
    
    public void setEsPrivada(boolean esPrivada) {
        this.esPrivada = esPrivada;
    }
    
    public boolean addProfesional(Profesional  p) {
        if (p == null) return false;
        
        // Comprobamos que no esté repetido
        if (profesionales.containsKey(p.getId())) return false;
        
        profesionales.put(p.getId(), p);
        return true;
    }

    private void rellenarEmpresa() {
        Faker f = new Faker();
        Futbolista fut;
        Fontanero fon;
        Entrenador ent;
        String[] posiciones = {"Delantero", "Medio", "Defensa", "Portero"};
        boolean[] opcion = {true, false};
        String[] estilos = {"Posesion", "Juego directo", "Contraataque", "Presion alta"};
        String[] paises = {"España", "Alemania", "Francia", "Inglaterra", "Italia", null};
        
        for (int i = 0; i < 64; i++) {
            if (i < 30) {
                fut = new Futbolista(f.number().numberBetween(10000000, 99999999), f.name().fullName(), posiciones[f.number().numberBetween(0, 3)]);
                fut.setSeleccion(paises[f.number().numberBetween(0, 5)]);
                addProfesional(fut);
            } else if (i < 62) {
                fon = new Fontanero(f.number().numberBetween(10000000, 99999999), f.name().fullName(), opcion[f.number().numberBetween(0, 1)]);
                addProfesional(fon);
            } else {
                ent = new Entrenador(f.number().numberBetween(10000000, 99999999), f.name().fullName(), estilos[f.number().numberBetween(0, 3)]);
                addProfesional(ent);
            }
        }
    }
    
    public ArrayList<Futbolista> getFutbolistas() {
        ArrayList<Futbolista> futbolistas = new ArrayList<>();
        
        for (Profesional p : profesionales.values()) {
            if (p instanceof Futbolista) {
                futbolistas.add((Futbolista) p);
            }
        }
        
        return futbolistas;
    }
    
    public ArrayList<Fontanero> getFontaneros() {
        ArrayList<Fontanero> fontaneros = new ArrayList<>();
        
        for (Profesional p : profesionales.values()) {
            if (p instanceof Fontanero) {
                fontaneros.add((Fontanero) p);
            }
        }
        
        return fontaneros;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ProfesionalNombreComparator comp = new ProfesionalNombreComparator();
        ArrayList<Futbolista> futbolistas = getFutbolistas();
        ArrayList<Fontanero> fontaneros = getFontaneros();
        
        sb.append("\nFUTBOLISTAS: \n");
        futbolistas.sort(comp);
        for (Profesional p : futbolistas) {
            sb.append(p.toString() + "\n");
        }
        
        sb.append("\nFONTANEROS: \n");
        fontaneros.sort(comp);
        for (Profesional p : fontaneros) {
            sb.append(p.toString() + "\n");
        }
        
        return sb.toString();
    }
}
