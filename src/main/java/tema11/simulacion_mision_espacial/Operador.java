package tema11.simulacion_mision_espacial;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Operador implements Comparable<Operador>{
    private int id;
    private String nombre;
    private String email;
    private ArrayList<Robot> robots;

    public Operador(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        if (email != null && email.contains("@")) {
            this.email = email;
        }
        this.robots = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    
    
    public boolean addRobot(Robot r) {
        if (r == null) return false;
        if (robots.contains(r)) return false;
        
        r.setOperador(this);
        return robots.add(r);
    }
    
    public ArrayList<Robot> getRobotsOrdenadosPorEnergia() {
        ArrayList<Robot> lista = new ArrayList<>(robots);
        Collections.sort(lista);
        return lista;
    }
    
    public abstract double calcularCosteOperacion(double coste);

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Operador)) return false;
        
        Operador o = (Operador) obj;
        return this.id == o.id;
    }
    
    @Override
    public int compareTo(Operador o) {
        return this.nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\tEmail: " + email;
    }
}
