package tema9.ejercicio4;

public class Motor {
    // Propiedades
    private int litrosAceite;
    private int cv;
    
    // Constructores
    public Motor (int cv) {
        litrosAceite = 0;
        this.cv = cv;
    }

    // Getters
    public int getLitrosAceite() {
        return litrosAceite;
    }

    public int getCv() {
        return cv;
    }

    // Setters
    public void setLitrosAceite(int litrosAceite) {
        this.litrosAceite = litrosAceite;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }
    
    @Override
    public String toString() {
        return "Aceite: " + litrosAceite + " litros.\n"+
               "CV: " + cv + "\n";
    }
}
