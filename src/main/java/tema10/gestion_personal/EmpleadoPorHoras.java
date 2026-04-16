package tema10.gestion_personal;

import tema9.ejercicio2.NIF;

public class EmpleadoPorHoras extends Empleado {
    private static final float PRECIO_HORA = 15;
    private int horasTrabajadas;

    public EmpleadoPorHoras(String nombreCompleto, NIF nif, byte edad) {
        super(nombreCompleto, nif, edad);
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public float calculaSueldo() {
        return (PRECIO_HORA * horasTrabajadas) + ParametrosLaborales.getSmi();
    }
}
