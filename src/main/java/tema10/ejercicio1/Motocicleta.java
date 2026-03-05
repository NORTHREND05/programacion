package tema10.ejercicio1;

public class Motocicleta extends Vehiculo {
    // Propiedades
    private boolean hasBaulCascos;
    private boolean hasCarenado;
    
    // Constructores
    public Motocicleta (String marca, boolean hasBaulCascos, boolean hasCarenado) {
        super(marca);
        this.hasBaulCascos = hasBaulCascos;
        this.hasCarenado = hasCarenado;
    }
    
    @Override
    public float gastoGasolina () {
        float aux = 0;
        
        // Si tiene carenado consume un 15% menos
        if(hasCarenado) {
            aux = (float) (super.gastoGasolina() * 0.15);
        }
        
        return aux;
    }
    
    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
               "Tiene baúl para cascos?: " + hasBaulCascos +
               "Tiene carenado?: " + hasCarenado;
    }
}
