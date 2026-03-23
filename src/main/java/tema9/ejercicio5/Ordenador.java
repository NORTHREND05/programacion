package tema9.ejercicio5;

public class Ordenador implements Comparable<Ordenador>{
    // Propiedades
    private String numSerie;
    private String tipoCPU;
    private int memoriaRAM;
    private int almacenamiento;
    
    // Constructores
    public Ordenador (String numSerie, int memoriaRAM) {
        this.numSerie = numSerie;
        this.memoriaRAM = memoriaRAM;
    }

    public String getNumSerie() {
        return numSerie;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        
        Ordenador o = (Ordenador) obj;
        return this.numSerie.equals(o.numSerie);
    }

    @Override
    public int hashCode() {
        int longitudNumSerie = String.valueOf(numSerie).length();
        return (memoriaRAM + longitudNumSerie) % 10;
    }
    
    @Override
    public int compareTo(Ordenador o) {
        int x = o.memoriaRAM - this.memoriaRAM;
        
        // Si no se puede por RAM entonces por número de serie en orden alfabético
        if (x == 0) {
            x = this.numSerie.compareTo(o.numSerie);
        }
        
        return x;
    }
    
    @Override
    public String toString() {
        return "Número de serie: " + numSerie + "\n"+
               "CPU: " + tipoCPU + "\n"+
               "RAM: " + memoriaRAM + " GB\n";
    }
}
