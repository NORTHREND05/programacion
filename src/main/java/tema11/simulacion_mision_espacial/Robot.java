package tema11.simulacion_mision_espacial;

public class Robot implements Comparable<Robot>{
    private int id;
    private String modelo;
    private String tipo;
    private int energiaMaxima;
    private int energiaActual;
    private double coste;
    private String[] modulos;
    private Operador operador;

    public Robot(int id, String modelo, String tipo) {
        this.id = id;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEnergiaMaxima() {
        return energiaMaxima;
    }

    public int getEnergiaActual() {
        return energiaActual;
    }

    public double getCoste() {
        return coste;
    }

    public String[] getModulos() {
        return modulos;
    }

    public void setEnergiaMaxima(int energiaMaxima) {
        this.energiaMaxima = energiaMaxima;
    }

    public void setEnergiaActual(int energiaActual) {
        this.energiaActual = energiaActual;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public void setModulos(String[] modulos) {
        this.modulos = modulos;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }
    
    public boolean addModulo(String modulo) throws Exception {
        if (modulo == null) return false;
        
        for (int i = 0; i < modulos.length; i++) {
            if (modulos[i] == null) {
                modulos[i] = modulo;
                return true;
            }
        }
        throw new Exception("Error: La lista de modulos esta llena.");
    }
    
    public String getModulo(String modulo) {
        if (modulo == null) return "";
        
        for (int i = 0; i < modulos.length; i++) {
            if (modulos[i] != null && modulos[i].equalsIgnoreCase(modulo)) {
                return modulos[i];
            }
        }
        return "";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Robot)) return false;
        
        Robot r = (Robot) obj;
        return this.id == r.id;
    }

    @Override
    public int hashCode() {
        return id % 100;
    }

    @Override
    public int compareTo(Robot o) {
        int x = o.energiaActual - this.energiaActual;
        
        if (x == 0) {
            x = o.energiaMaxima - this.energiaMaxima;
        }
        return x;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo
             + "\tTipo: " + tipo
             + "\tEnergia maxima: " + energiaMaxima
             + "\tEnergia actual: " + energiaActual
             + "\tCoste: " + String.format("%.2f€", coste); 
    }
}
