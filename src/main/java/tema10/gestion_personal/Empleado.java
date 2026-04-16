package tema10.gestion_personal;

import tema9.ejercicio2.NIF;

public abstract class Empleado {
    // Propiedades
    private String nombreCompleto;
    private NIF nif;
    private byte edad;
    
    // Constructor
    public Empleado(String nombreCompleto, NIF nif, byte edad) {
        this.nombreCompleto = nombreCompleto;
        this.nif = nif;
        this.edad = edad;
    }
    
    // Método abstracto
    public abstract float calculaSueldo();

    // Getters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public NIF getNif() {
        return nif;
    }

    public byte getEdad() {
        return edad;
    }
    
    @Override
    public String toString() {
        return "Nómina del empleado\n" +
               "Nombre: " + nombreCompleto + "\n" +
               "NIF: " + nif + "\n" +
               "Edad: " + edad + " años" + "\n";
    }
}
