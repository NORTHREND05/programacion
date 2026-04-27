package tema11.simulador_carrera_drones;

public abstract class Piloto implements Comparable<Piloto>{
    private int id;
    private String nombre;
    private String email;

    public Piloto(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        setEmail(email);
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
            throw new IllegalArgumentException("Error. El email debe contener al menos @.");
        }
    }
    
    public abstract double calcularPrecioFinal(double precio);
    
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
        return "ID: " + id
             + "\tNombre: " + nombre
             + "\tEmail: " + email;
    }
}
