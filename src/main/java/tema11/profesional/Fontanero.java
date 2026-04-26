package tema11.profesional;

import tema10.gestion_personal.ParametrosLaborales;

public class Fontanero extends Profesional {
    // Propiedades
    private boolean esAutonomo;

    public Fontanero(int id, String nombre, boolean esAutonomo) {
        super(id, nombre);
        this.esAutonomo = esAutonomo;
        setSalario(calcularSalario());
    }

    public boolean isAutonomo() {
        return esAutonomo;
    }

    public void setEsAutonomo(boolean esAutonomo) {
        this.esAutonomo = esAutonomo;
        setSalario(calcularSalario());
    }

    @Override
    public double calcularSalario() {
        double salario, smi = ParametrosLaborales.getSmi();
        
        if (esAutonomo) {
            salario = 3 * (smi + 200);
        } else {
            salario = smi + 200;
        }
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() + "\tAutonomo: "+ (esAutonomo ? "Si" : "No");
    }
}
