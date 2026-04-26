package tema11.gestion_clinica_veterinaria;

import java.time.LocalDate;

public class ClienteVIP extends Cliente {
    private int porcentajeDescuento;
    private LocalDate fechaRegistro;

    public ClienteVIP(int id, String nombre, int telefono) {
        super(id, nombre, telefono);
    }

    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setPorcentajeDescuento(int porcentajeDescuento) {
        if (porcentajeDescuento >= 0 && porcentajeDescuento <= 100) {
            this.porcentajeDescuento = porcentajeDescuento;
        } else {
            throw new IllegalArgumentException("Error: El porcentaje debe estar entre 0 y 100.");
        }
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        if (fechaRegistro != null) {
            this.fechaRegistro = fechaRegistro;
        } else {
            throw new IllegalArgumentException("Error: La fecha no puede ser null.");
        }
    }

    @Override
    public double calcularPrecioFinal(double precio) {
        double descuento = precio * (porcentajeDescuento / 100.0);
        return precio - descuento;
    }
}
