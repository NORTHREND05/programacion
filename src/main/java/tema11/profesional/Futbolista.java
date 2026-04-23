package tema11.profesional;

import tema10.gestion_personal.ParametrosLaborales;

public class Futbolista extends Profesional{
    // Propiedades
    private String seleccion;
    private String posicion;

    public Futbolista(int id, String nombre, double salario) {
        super(id, nombre, salario);
    }

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
    }

    @Override
    public double calcularSalario() {
        double salario;
        
        if (posicion.equalsIgnoreCase("Delantero")) {
            salario = ParametrosLaborales.getSmi() * 5;
        } else if (posicion.equalsIgnoreCase("Defensa")) {
            salario = ParametrosLaborales.getSmi() * 4;
        } else {
            salario = ParametrosLaborales.getSmi() * 3;
        }
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() +
                " - Selección: " + seleccion +
                " - Posicion: " + posicion +
                " - Salario: " + calcularSalario() + "€";
    }
}
