package tema10.ejercicio1;

public class Coche extends Vehiculo {
    // Propiedades
    private String marcaTransmicion;
    private int nPuertas;
    
    // Constructores
    public Coche (int cv, String marca, String marcaTransmicion) {
        super(marca, cv);
        this.marcaTransmicion = marcaTransmicion;
    }

    // Setter
    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }
    
    @Override
    public float gastoGasolina() {
        return super.gastoGasolina() + nPuertas;
    }
    
    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
               "Marca de la transmición: " + marcaTransmicion +
               "Número de puertas: " + nPuertas;
    }
}
