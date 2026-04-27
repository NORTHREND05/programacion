package tema11.simulacion_torneo_combate_mechas;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Piloto implements Comparable<Piloto>{
    private int id;
    private String nombre;
    private String email;
    private ArrayList<Mecha> mechas;

    public Piloto(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        setEmail(email);
        this.mechas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Error: Email inválido.");
        }
    }
    
    public abstract double calcularPrecioFinal(double precio);
    
    public boolean addMecha(Mecha m) {
        if (m == null) return false;
        // Buscamos si esta repetido por id
        if (mechas.contains(m)) return false;
        // Añadimos el piloto al mecha que acabamos de añadir a la coleccion
        m.setPiloto(this);
        return mechas.add(m);
    }
    
    public ArrayList<Mecha> getMechasOrdenadosPorPotencia() {
        ArrayList<Mecha> lista = new ArrayList<>(mechas);
        // Ordenados por potencia
        Collections.sort(lista);
        return lista;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof Piloto)) return false;

        Piloto p = (Piloto) obj;
        return this.id == p.id;
    }

    @Override
    public int hashCode() {
        return id % 100;
    }

    @Override
    public int compareTo(Piloto o) {
        return this.nombre.compareTo(o.nombre);
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\tEmail: " + email;
    }
}
