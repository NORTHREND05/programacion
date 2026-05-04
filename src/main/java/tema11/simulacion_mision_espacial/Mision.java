package tema11.simulacion_mision_espacial;

public class Mision {
    private int id;
    private Robot r1;
    private Robot r2;
    private String resultado;
    private int duracion;

    public Mision(int id, Robot r1, Robot r2) throws Exception {
        this.id = id;
        if (r1 == null || r2 == null) {
            throw new Exception("Error: La mision debe tener dos robots.");
        }
        this.r1 = r1;
        this.r2 = r2;
        simularMision();
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getId() {
        return id;
    }

    public String getResultado() {
        return resultado;
    }

    public int getDuracion() {
        return duracion;
    }

    private void simularMision() {
        int energia1 = r1.getEnergiaActual() + r1.getEnergiaMaxima();
        int energia2 = r2.getEnergiaActual() + r2.getEnergiaMaxima();
        
        if (energia1 > energia2) {
            resultado = r1.getOperador().getNombre();
        } else if (energia1 < energia2) {
            resultado = r2.getOperador().getNombre();
        } else {
            resultado = "Empate";
        }
        
        duracion = (int) (Math.random() * 12);
    }
    
    
}
