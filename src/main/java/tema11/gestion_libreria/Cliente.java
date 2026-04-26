package tema11.gestion_libreria;

public abstract class Cliente implements Comparable<Cliente> {
    private int id;
    private String nombre;
    private String email;

    public Cliente(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Error. El correo debe tener al menos @.");
        }
    }
    
    public abstract double calcularPrecioFinal(double precio);

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Cliente)) return false;
        
        Cliente c = (Cliente) obj;
        return this.id == c.id;
    }

    @Override
    public int hashCode() {
        return id % 100;
    }

    @Override
    public int compareTo(Cliente o) {
        return this.nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\tCorreo electronico: " + email;
    }
}
