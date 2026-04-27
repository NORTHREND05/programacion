package tema11.simulador_carrera_drones;

public class PilotoAficionado extends Piloto{

    public PilotoAficionado(int id, String nombre, String email) {
        super(id, nombre, email);
    }

    @Override
    public double calcularPrecioFinal(double precio) {
        return precio;
    }
    
}
