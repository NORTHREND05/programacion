package tema11.gestion_clinica_veterinaria;

public class ClienteNormal extends Cliente {

    public ClienteNormal(int id, String nombre, int telefono) {
        super(id, nombre, telefono);
    }

    @Override
    public double calcularPrecioFinal(double precio) {
        return precio;
    }
}
