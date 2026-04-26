package tema11.gestion_libreria;

public class ClienteNormal extends Cliente {

    public ClienteNormal(int id, String nombre, String email) {
        super(id, nombre, email);
    }

    @Override
    public double calcularPrecioFinal(double precio) {
        return precio;
    }
}