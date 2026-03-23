package tema9.ejercicio4;

import java.util.Objects;

public class Coche implements Comparable<Coche>{
    // Propiedades
    private Motor motor;
    private String marca;
    private String modelo;
    private double totalGastoAverias;
    
    // Constructores
    public Coche (String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters
    public Motor getMotor() {
        return motor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public double getPrecioAcumuladoAverias() {
        return totalGastoAverias;
    }
    
    // Método que acumula el precio de una nueva averia al total del gasto en averias
    public void acumularAveria(double nuevaAveria) {
        totalGastoAverias += nuevaAveria;
    }

    @Override
    public boolean equals(Object obj) {
        Coche c = (Coche) obj;
        
        return (this.motor.equals(c.motor) &&
                this.marca.equalsIgnoreCase(c.marca) &&
                this.modelo.equalsIgnoreCase(c.modelo) &&
                this.totalGastoAverias == c.totalGastoAverias);
    }
    
    @Override
    public int compareTo(Coche o) {
        int x = this.marca.compareTo(o.marca);
        
        // Si no se puede comparar por marca entonces por modelo
        if(x == 0) {
            x = this.modelo.compareTo(o.modelo);
        }
        
        return x;
    }
    
    @Override
    public String toString() {
        return motor.toString() +
               "Marca: " + marca + "\n"+
               "Modelo: " + modelo + "\n" +
               "Gasto en averías: " + totalGastoAverias + "\n";
    }
}
