package tema11.simulador_carrera_drones;

import java.util.HashSet;
import tema10.ejercicio1.ICRUD;

public class DroneDAO implements ICRUD<Drone>{
    private HashSet<Drone> drones;

    public DroneDAO() {
        drones = new HashSet<>();
    }

    @Override
    public boolean insertar(Drone elemento) {
        if (elemento == null) return false;
        if (consultaPorId(elemento.getId()) != null) return false;
        
        return drones.add(elemento);
    }

    @Override
    public boolean borrar(int id) {
        Drone d = consultaPorId(id);
        
        if (d == null) return false;
        return drones.remove(d);
    }

    @Override
    public Drone modificar(int id, Drone nuevo) {
        if (nuevo == null) return null;
        
        if (borrar(id)) {
            insertar(nuevo);
            return nuevo;
        }
        return null;
    }

    @Override
    public Drone consultaPorId(int id) {
        for (Drone d : drones) {
            if (d.getId() == id) {
                return d;
            }
        }
        return null;
    }
    
}
