package tema11.profesional;

public abstract class Profesional implements Comparable<Profesional>{
    // Propiedades
    private int id;
    private String nombre;
    private double salario;

    // Constructor
    public Profesional(int id, String nombre, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public abstract double calcularSalario();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        
        Profesional p = (Profesional) obj;
        return this.id == p.id;
    }

    @Override
    public int hashCode() {
        return 47 * this.id % 100;
    }

    @Override
    public int compareTo(Profesional o) {
        return (int) (o.salario - this.salario);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " -  Salario: " + salario + "€";
    }
}
