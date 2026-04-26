package tema11.profesional;

import tema10.gestion_personal.ParametrosLaborales;

public class Futbolista extends Profesional{
    // Propiedades
    private String seleccion;
    private String posicion;

    // Constructor
    public Futbolista(int id, String nombre, String posicion) {
        super(id, nombre);
        this.posicion = posicion;
        setSalario(calcularSalario());
    }

    // Getters & Setters
    public String getSeleccion() {
        return seleccion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setSeleccion(String seleccion) {
        this.seleccion = seleccion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
        setSalario(calcularSalario());
    }

    @Override
    public double calcularSalario() {
        double salario, smi = ParametrosLaborales.getSmi();
        
        if (posicion.equalsIgnoreCase("Delantero")) {
            salario = smi * 5;
        } else if (posicion.equalsIgnoreCase("Defensa")) {
            salario = smi * 4;
        } else {
            salario = smi * 3;
        }
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tSelección: " + seleccion +
                "\tPosicion: " + posicion;
    }
}
