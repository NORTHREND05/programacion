package tema11.simulacion_mision_espacial;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class BaseEspacial {
    private String nombre;
    private String planeta;
    private HashMap<Integer, Robot> robots;
    private ArrayList<Mision> misiones;

    public BaseEspacial(String nombre, String planeta, Robot robot) throws Exception {
        this.nombre = nombre;
        this.planeta = planeta;
        this.robots = new HashMap<>();
        this.misiones = new ArrayList<>();
        
        if (robot == null) {
            throw new Exception("Error: Debe haber al menos un robot.");
        }
        addRobot(robot);
        rellenarBase(50);
    }

    private void rellenarBase(int tam) {
        Faker f = new Faker();
        OperadorJunior oj;
        OperadorSenior os;
        Robot r;
        
        for (int i = 0; i < tam; i++) {
            r = new Robot(f.number().numberBetween(1000, 9999), f.job().field(), f.music().genre());
            if (i < tam / 2) {
                oj = new OperadorJunior(f.number().numberBetween(1000, 9999), f.name().fullName(), f.internet().emailAddress());
                r.setOperador(oj);
            } else {
                os = new OperadorSenior(f.number().numberBetween(1000, 9999), f.name().fullName(), f.internet().emailAddress());
                r.setOperador(os);
            }
            
        }
    }
    
    public boolean addRobot(Robot r) {
        if (r == null) return false;
        
        if (robots.containsKey(r.getId())) return false;
        robots.put(r.getId(), r);
        return true;
    }
    
    public boolean registrarMision(Mision m) {
        if (m == null) return false;
        
        if (misiones.contains(m)) return false;
        
        return misiones.add(m);
    }
    
    public ArrayList<Robot> getRobotsPorTipo(String tipo) {
        ArrayList<Robot> lista = new ArrayList<>();
        
        for (Robot r : robots.values()) {
            if (r.getTipo() != null && r.getTipo().equalsIgnoreCase(tipo)) {
                lista.add(r);
            }
        }
        Collections.sort(lista);
        return lista;
    }
    
    public Robot getRobotConMasEnergia() {
        Robot masEnergia = null;
        
        for (Robot r : robots.values()) {
            if (masEnergia == null && r.getEnergiaActual() > masEnergia.getEnergiaActual()) {
                masEnergia = r;
            }
        }
        return masEnergia;
    }
    
    public double getCosteTotalRobots() {
        double total = 0;
        
        for (Robot value : robots.values()) {
            total += value.getCoste();
        }
        return total;
    }
    
    public ArrayList<Mision> getMisionesGanadasPorRobot(String nombre) {
        ArrayList<Mision> lista = new ArrayList<>();
        if(nombre == null) return lista;
        for (Mision m : misiones) {
            if (m.getResultado() != null && m.getResultado().equalsIgnoreCase(nombre)) {
                lista.add(m);
            }
        }
        return lista;
    }
}
