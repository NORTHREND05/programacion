package tema11.profesional;

import tema10.gestion_personal.ParametrosLaborales;

public class Entrenador extends Profesional {
    // Propiedades
    private String estilo;
    private int anyosExperiencia;
    private int titulos;

    // Constructor
    public Entrenador(int id, String nombre, String estilo) {
        super(id, nombre);
        this.estilo = estilo;
        setSalario(calcularSalario());
    }

    // Getters & Setters
    public String getEstilo() {
        return estilo;
    }

    public int getAnyosExperiencia() {
        return anyosExperiencia;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public void setAnyosExperiencia(int anyosExperiencia) {
        if (anyosExperiencia >= 0) {
            this.anyosExperiencia = anyosExperiencia;
        }
    }

    public void setTitulos(int titulos) {
        if (titulos >= 0) {
            this.titulos = titulos;
        }
    }

    @Override
    public double calcularSalario() {
        return ParametrosLaborales.getSmi() * 10;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\tEstilo: " + estilo
                + "\tAños experiencia: " + anyosExperiencia
                + "\tTítulos: " + titulos;
    }
}
