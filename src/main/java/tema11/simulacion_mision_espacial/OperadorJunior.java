package tema11.simulacion_mision_espacial;

public class OperadorJunior extends Operador{

    public OperadorJunior(int id, String nombre, String email) {
        super(id, nombre, email);
    }

    @Override
    public double calcularCosteOperacion(double coste) {
        return coste;
    }
    
}
