package tema11.gestion_tienda_videojuegos;

public class ClientePremium extends Cliente{
    private float porcentajeDescuento;
    private int puntos;
    
    public ClientePremium(int id, String nombre, String apellidos) {
        super(id, nombre, apellidos);
    }

    public int getPuntos() {
        return puntos;
    }
    
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public float getPorcentajeDescuento() {
        return porcentajeDescuento;
    }
    
    public void setPorcentajeDescuento(float porcentajeDescuento) {
        if (porcentajeDescuento >= 0 && porcentajeDescuento <= 100) {
            this.porcentajeDescuento = porcentajeDescuento;
        }
    }

    @Override
    public double calcularPrecioFinal(double precio) {
        double descuento = precio * (porcentajeDescuento / 100);
        double total = precio - descuento;
        
        acumularPuntos(total);
        return total;
    }
    
    private void acumularPuntos(double precio) {
        // Redondeamos al mas cercano para evitar problemas con centimos
        puntos += (int) precio / 10;
    }
}
