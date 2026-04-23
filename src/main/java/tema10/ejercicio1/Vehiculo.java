package tema10.ejercicio1;

public class Vehiculo{
    // Propiedades
    private int cv;
    private String tipoMotor;
    private int velocidadMax;
    private String marca;
    
    // Constructores
    public Vehiculo (String marca, int cv) {
        this.marca = marca;
        this.cv = cv;
    }
    
    public Vehiculo (String marca) {
        this(marca, -1);
    }

    public int getCv() {
        return cv;
    }

    public String getMarca() {
        return marca;
    }
    
    // Setters
    public void setCv(int cv) {
        this.cv = cv;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
    
    // Método que permite calcular el gasto de gasolina
    public float gastoGasolina() {
        float aux;
        
        aux = (float) (cv*0.1 + velocidadMax / 100);
        
        return aux;
    }
    
    // Método que muestra la información del vehiculo
    public String mostrarInformacion() {
        return "Caballos de fuerza: " + cv + "\n" +
               "Tipo de motorización: " + tipoMotor + "\n" +
               "Velocidad máxima: " + velocidadMax + "\n" +
               "Marca: " + marca + "\n";
    }
}
