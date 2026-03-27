package tema10.gestion_personal;

import tema9.ejercicio2.NIF;

public abstract class Empleado {
    // Propiedades
    private String nombreCompleto;
    private NIF nif;
    private byte edad;

    public abstract float calculaSueldo();
    
    @Override
    public String toString() {
        return "Nómina del empleado\n" +
               "Nombre: " + nombreCompleto + "\n" +
               "NIF: " + nif + "\n" +
               "Edad: " + edad + " años" + "\n";
    }
}
