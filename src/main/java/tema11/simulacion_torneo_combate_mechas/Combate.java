package tema11.simulacion_torneo_combate_mechas;

public class Combate {
    private int id;
    private Mecha mecha1, mecha2;
    private String ganador;
    private int duracion;

    public Combate(int id, Mecha mecha1, Mecha mecha2) {
        this.id = id;
        if (mecha1 == null || mecha2 == null) {
            throw new IllegalArgumentException("Error: El combate debe tener 2 mechas.");
        }
        this.mecha1 = mecha1;
        this.mecha2 = mecha2;
        simularCombate(mecha1, mecha2);
    }

    public int getId() {
        return id;
    }

    public Mecha getMecha1() {
        return mecha1;
    }

    public Mecha getMecha2() {
        return mecha2;
    }

    public String getGanador() {
        return ganador;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setMecha1(Mecha mecha1) {
        this.mecha1 = mecha1;
    }

    public void setMecha2(Mecha mecha2) {
        this.mecha2 = mecha2;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    private void simularCombate(Mecha m1, Mecha m2) {
        int m1Poder = m1.getPotencia() + m1.getBlindaje();
        int m2Poder = m2.getPotencia() + m2.getBlindaje();
        
        if (m1Poder > m2Poder) {
            ganador = m1.getNombre();
        } else if (m1Poder < m2Poder) {
            ganador = m2.getNombre();
        } else {
            ganador = "Empate";
        }
        duracion = (int) (Math.random() * 10) + 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Combate)) return false;
        
        Combate c = (Combate) obj;
        return this.id == c.id;
    }

    @Override
    public int hashCode() {
        return id % 100;
    }
    
    @Override
    public String toString() {

        return "Combate ID: " + id
                + "\tMecha1: " + mecha1.getNombre()
                + "\tMecha2: " + mecha2.getNombre()
                + "\tGanador: " + ganador
                + "\tDuracion: " + duracion + " min";
    }
}
