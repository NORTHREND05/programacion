package tema10.gestion_personal;

public class EmpleadoPorHoras extends Empleado {
    private static final float PRECIO_HORA = 15;
    private int horasTrabajadas;
    
    

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public float calculaSueldo() {
        return (PRECIO_HORA * horasTrabajadas) + ParametrosLaborales.getSmi();
    }
}
