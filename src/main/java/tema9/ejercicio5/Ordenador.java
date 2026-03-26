package tema9.ejercicio5;

public class Ordenador implements Comparable<Ordenador> {
    private String numSerie;
    private String cpu;
    private byte ram;
    private int almacenamiento;
    
    public Ordenador(String numSerie, byte ram) {
        this.numSerie = numSerie;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "numSerie=" + numSerie + ", cpu=" + cpu + ", ram=" + ram + ", almacenamiento=" + almacenamiento + "\n";
    }

    public String getNumSerie() {
        return numSerie;
    }

    public byte getRam() {
        return ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    public int hashCode() {
        
        return (3234* this.ram * this.numSerie.length()) % 100;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { // Identicos = Iguales
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Ordenador other = (Ordenador) obj;
        return this.numSerie.equals(other.numSerie);
    }

    // ORDEN NATURAL -> POR RAM
    @Override
    public int compareTo(Ordenador t) {
        if (t.ram == this.ram) {
            return this.numSerie.compareTo(t.numSerie);
        }
        return t.ram - this.ram;
    }
}
