package tema10.gestion_personal;

import java.time.LocalDate;
import tema9.ejercicio2.NIF;

public class EmpleadoFijo extends Empleado {
    private int anyoIncorporacion;
    private float complementoAnualFijo;

    public EmpleadoFijo(String nombreCompleto, NIF nif, byte edad, int anyoIncorporacion) {
        super(nombreCompleto, nif, edad);
        this.anyoIncorporacion = anyoIncorporacion;
        complementoAnualFijo = 75;
    }

    public int getAnyoIncorporacion() {
        return anyoIncorporacion;
    }
    
    public void setComplementoAnualFijo(float complementoAnualFijo) {
        this.complementoAnualFijo = complementoAnualFijo;
    }

    @Override
    public float calculaSueldo() {
        int anyosAntiguedad = LocalDate.now().getYear() - anyoIncorporacion;
        
        return ParametrosLaborales.getSmi() + (complementoAnualFijo * anyosAntiguedad);
    }
}
