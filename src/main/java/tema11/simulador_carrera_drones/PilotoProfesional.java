package tema11.simulador_carrera_drones;

import java.time.LocalDate;

public class PilotoProfesional extends Piloto{
    private int porcentajeDescuento;
    private LocalDate fechaAlta;

    public PilotoProfesional(int id, String nombre, String email) {
        super(id, nombre, email);
    }

    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setPorcentajeDescuento(int porcentajeDescuento) {
        if (porcentajeDescuento >= 0 && porcentajeDescuento <= 100) {
            this.porcentajeDescuento = porcentajeDescuento;
        }
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        if (fechaAlta != null) {
            this.fechaAlta = fechaAlta;
        }
    }

    @Override
    public double calcularPrecioFinal(double precio) {
        double descuento = precio * (porcentajeDescuento / 100.0);
        return precio - descuento;
    }

    @Override
    public String toString() {
        return super.toString()
             + "\tPorcentaje de descuento: " + porcentajeDescuento + "%"
             + "\tFecha de alta: " + (fechaAlta != null ? fechaAlta : "No asignada");
    }
}
