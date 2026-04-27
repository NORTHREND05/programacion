package tema11.simulacion_torneo_combate_mechas;

public class Mecha implements Comparable<Mecha>{
    private int id;
    private String nombre;
    private String tipo;
    private int potencia;
    private int blindaje;
    private double precio;
    private String[] armas;
    private Piloto piloto;

    public Mecha(int id, String nombre, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        armas = new String[4];
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getBlindaje() {
        return blindaje;
    }

    public double getPrecio() {
        return precio;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPotencia(int potencia) {
        if (potencia > 0) {
            this.potencia = potencia;
        }
    }

    public void setBlindaje(int blindaje) {
        if (blindaje >= 0) {
            this.blindaje = blindaje;
        }
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        }
    }

    public void setPiloto(Piloto piloto) {
        if (piloto != null) {
            this.piloto = piloto;
        }
    }
    
    public boolean addArma(String arma) throws Exception {
        if (arma == null) return false;
        if (tieneArma(arma)) return false;
        
        for (int i = 0; i < armas.length; i++) {
            if (armas[i] == null) {
                armas[i] = arma;
                return true;
            }
        }
        throw new Exception("Error: La lista de armas ya está completa.");
    }
    
    public boolean tieneArma(String arma) {
        if (arma == null) return false;
        
        for (int i = 0; i < armas.length; i++) {
            if (armas[i] != null && armas[i].equalsIgnoreCase(arma)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Mecha)) return false;
        
        Mecha m = (Mecha) obj;
        return this.id == m.id;
    }

    @Override
    public int hashCode() {
        return id % 100;
    }

    @Override
    public int compareTo(Mecha o) {
        int orden = o.potencia - this.potencia;
        
        if (orden == 0) {
            orden = o.blindaje - this.blindaje;
        }
        return orden;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
             + "\tTipo: " + tipo
             + "\tPotencia: " + potencia
             + "\tBlindaje: " + blindaje
             + "\tPrecio: " + String.format("%.2f€", precio);
    }
}
