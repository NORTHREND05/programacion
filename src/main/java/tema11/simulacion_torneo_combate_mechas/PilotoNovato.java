package tema11.simulacion_torneo_combate_mechas;

public class PilotoNovato extends Piloto{

    public PilotoNovato(int id, String nombre, String email) {
        super(id, nombre, email);
    }
    
    @Override
    public double calcularPrecioFinal(double precio) {
        return precio;
    }
}
