package tema11.gestion_tienda_videojuegos;

public abstract class Cliente {
    private int id;
    private String nombre;
    private String apellidos;
    private String email;

    public Cliente(int id, String nombre, String apellidos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
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
        return this.id % 100;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\tApellidos: " + apellidos + "\tCorreo electronico: " + email;
    }
}
