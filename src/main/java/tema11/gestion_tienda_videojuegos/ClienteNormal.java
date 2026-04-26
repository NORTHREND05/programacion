package tema11.gestion_tienda_videojuegos;

public class ClienteNormal extends Cliente{

    public ClienteNormal(int id, String nombre, String apellidos) {
        super(id, nombre, apellidos);
    }

    @Override
    public double calcularPrecioFinal(double precio) {
        return precio;
    }
}
