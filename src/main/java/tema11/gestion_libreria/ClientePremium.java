package tema11.gestion_libreria;

import java.time.LocalDate;

public class ClientePremium extends Cliente {
    private float porcentajeDescuento;
    private LocalDate fechaAlta;

    public ClientePremium(int id, String nombre, String email) {
        super(id, nombre, email);
    }

    public float getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setPorcentajeDescuento(float porcentajeDescuento) {
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
        double descuento = precio * (porcentajeDescuento / 100);
        return precio - descuento;
    }

    @Override
    public String toString() {
        return super.toString()
            + "\tPorcentaje de descuento: " + porcentajeDescuento + "%"
            + "\tFecha de alta: " + fechaAlta;
    }
}