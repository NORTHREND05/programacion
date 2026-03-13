package tema9.ejercicio4;

public class Garaje {
    // Propiedades
    private Coche coche;
    private String averia;
    private int numCochesAtentidos;
    
    // Método que acepta los coches si no está atendiendo a nadie
    public boolean aceptarCoche(Coche coche, String averia) {
        // Si está atendiendo a un coche devuelve false
        if(this.coche != null) {
            return false;
        }
        
        // Actualiza las propiedades con los parametros recibidos
        this.coche = coche;
        this.averia = averia;
        
        return true;
    }
    
    // Método que devuelve el coche
    public void devolverCoche() {
        int aceite;
        
        // Manda el coste de la averia
        coche.acumularAveria(Math.random() * 500);
        
        // Si la avería es *aceite* entonces incrementamos los litros de aceite en 10
        if(averia.equalsIgnoreCase("aceite")) {
            aceite = coche.getMotor().getLitrosAceite() + 10;
            coche.getMotor().setLitrosAceite(aceite);
        }
        
        // Deja el coche en null para atender al siguiente
        this.coche = null;
        
        // Acumula el coche atendido
        numCochesAtentidos++;
    }
    
    @Override
    public String toString() {
        return coche.toString() +
               "Avería: " + averia + "\n" +
               "Coches atendidos: " + numCochesAtentidos + "\n";
    }
}
