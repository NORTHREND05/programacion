package tema10.gestion_personal;

import java.time.LocalDate;

public class EmpleadoFijo extends Empleado {
    private int añoIncorporacion;
    private float complementoAnualFijo;
    
    public EmpleadoFijo () {
        complementoAnualFijo = 75;
    }

    public void setComplementoAnualFijo(float complementoAnualFijo) {
        this.complementoAnualFijo = complementoAnualFijo;
    }

    @Override
    public float calculaSueldo() {
        return ParametrosLaborales.getSmi() + (complementoAnualFijo * (LocalDate.now().getYear() - añoIncorporacion));
    }
}
