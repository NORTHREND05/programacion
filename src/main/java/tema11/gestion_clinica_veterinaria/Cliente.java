package tema11.gestion_clinica_veterinaria;

public abstract class Cliente implements Comparable<Cliente> {
    private int id;
    private String nombre;
    private int telefono;

    public Cliente(int id, String nombre, int telefono) {
        this.id = id;
        this.nombre = nombre;
        setTelefono(telefono);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        if (telefono >= 100000000) {
            this.telefono = telefono;
        } else {
            throw new IllegalArgumentException("Error: El telefono debe tener 9 digitos.");
        }
    }
    
    public abstract double calcularPrecioFinal(double precio);

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(!(obj instanceof Cliente)) return false;
        
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
        return "Nombre: " + nombre + "\tTelefono: " + telefono;
    }
}
