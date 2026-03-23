package tema9.ejercicio4;

public class Motor implements Comparable<Motor>{
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
    public boolean equals(Object obj) {
        Motor m = (Motor) obj;
        
        return (this.litrosAceite == m.litrosAceite && this.cv == m.cv);
    }
    
    @Override
    public int compareTo(Motor o) {
        int x = this.cv - o.cv;
        
        // Si no se puede comparar por caballos entonces por litros de aceite
        if (x == 0) {
            x = this.litrosAceite - o.litrosAceite;
        }
        
        return x;
    }
    
    @Override
    public String toString() {
        return "Aceite: " + litrosAceite + " litros.\n"+
               "CV: " + cv + "\n";
    }
}
