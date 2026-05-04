package tema11.simulacion_mision_espacial;

import java.time.LocalDate;

public class OperadorSenior extends Operador{
    private int porcentajeReduccion;
    private LocalDate fechaIngreso;

    public OperadorSenior(int id, String nombre, String email) {
        super(id, nombre, email);
    }

    public int getPorcentajeReduccion() {
        return porcentajeReduccion;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setPorcentajeReduccion(int porcentajeReduccion) {
        if (porcentajeReduccion >= 0 && porcentajeReduccion <= 100) {
            this.porcentajeReduccion = porcentajeReduccion;
        }
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        if (fechaIngreso != null) {
            this.fechaIngreso = fechaIngreso;
        }
    }
    @Override
    public double calcularCosteOperacion(double coste) {
        double reduccion = coste * (porcentajeReduccion / 100.0);
        return coste - reduccion;
    }

    @Override
    public String toString() {
        return super.toString()
             + "Porcentaje de reduccion: " + porcentajeReduccion + "%"
             + "Fecha de ingreso: " + fechaIngreso;
    
    }
}
