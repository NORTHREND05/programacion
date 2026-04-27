package tema11.simulador_carrera_drones;

public class Drone implements Comparable<Drone>{
    private int id;
    private String modelo;
    private String categoria;
    private int velocidadMaxima;
    private int autonomia;
    private double precio;

    public Drone(int id, String modelo, String categoria) {
        this.id = id;
        this.modelo = modelo;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        if (velocidadMaxima > 0) {
            this.velocidadMaxima = velocidadMaxima;
        }
    }

    public void setAutonomia(int autonomia) {
        if (autonomia > 0) {
            this.autonomia = autonomia;
        }
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Drone)) return false;
        
        Drone d = (Drone) obj;
        return this.id == d.id;
    }

    @Override
    public int hashCode() {
        return id % 100;
    }

    @Override
    public int compareTo(Drone o) {
        return o.velocidadMaxima - this.velocidadMaxima;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\tModelo: " + modelo
             + "\tCategoria: " + categoria
             + "\tVelocidad maxima: " + velocidadMaxima + " km/h"
             + "\tAutonomia: " + autonomia + " min"
             + "\tPrecio: " + String.format("%.2f€", precio);
    }
}
