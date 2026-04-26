package tema11.profesional;

public abstract class Profesional implements Comparable<Profesional>{
    // Propiedades
    private int id;
    private String nombre;
    private double salario;

    // Constructor
    public Profesional(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public abstract double calcularSalario();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Profesional)) return false;
        
        Profesional p = (Profesional) obj;
        return this.id == p.id;
    }

    @Override
    public int hashCode() {
        return 47 * this.id % 1000;
    }

    @Override
    public int compareTo(Profesional o) {
        return Double.compare(o.salario, this.salario);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\tSalario: " + salario + "€";
    }
}
