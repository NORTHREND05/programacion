package tema11.simulacion_torneo_combate_mechas;

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
        } else {
            throw new IllegalArgumentException("Error: El porcentaje de descuento debe ser entre 0 y 100.");
        }
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        if (fechaAlta != null) {
            this.fechaAlta = fechaAlta;
        }
    }

    @Override
    public double calcularPrecioFinal(double precio) {
        if (precio < 0) return 0;
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
