package tema10.gestion_personal;

import java.time.LocalDate;

public class EmpleadoTemporal extends Empleado {
    // Propiedades
    private LocalDate fechaAlta;
    private LocalDate fechaBaja;
    
    @Override
    public float calculaSueldo() {
        return ParametrosLaborales.getSmi();
    }
}
