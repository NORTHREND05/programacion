package tema10.gestion_personal;

import java.time.LocalDate;
import tema9.ejercicio2.NIF;

public class EmpleadoTemporal extends Empleado {

    // Propiedades
    private LocalDate fechaAlta;
    private LocalDate fechaBaja;

    public EmpleadoTemporal(String nombreCompleto, NIF nif, byte edad,
            LocalDate fechaAlta, LocalDate fechaBaja) {
        super(nombreCompleto, nif, edad);
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    @Override
    public float calculaSueldo() {
        return ParametrosLaborales.getSmi();
    }

    @Override
    public String toString() {
        return super.toString()
                + "Fecha alta: " + fechaAlta + "\n"
                + "Fecha baja: " + fechaBaja + "\n";
    }
}
