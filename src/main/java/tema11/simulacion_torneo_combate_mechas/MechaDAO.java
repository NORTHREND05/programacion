package tema11.simulacion_torneo_combate_mechas;

import java.util.HashSet;
import tema10.ejercicio1.ICRUD;

public class MechaDAO implements ICRUD<Mecha>{
    private HashSet<Mecha> mechas;

    public MechaDAO() {
        mechas = new HashSet<>();
    }
    
    @Override
    public boolean insertar(Mecha elemento) {
        if (elemento == null) return false;
        
        if (consultaPorId(elemento.getId()) != null) return false;
        return mechas.add(elemento);
    }

    @Override
    public boolean borrar(int id) {
        Mecha m = consultaPorId(id);
        if (m == null) return false;
        
        return mechas.remove(m);
    }

    @Override
    public Mecha modificar(int id, Mecha nuevo) {
        if (nuevo == null) return null;
        
        if (borrar(id)) {
            insertar(nuevo);
            return nuevo;
        }
        return null;
    }

    @Override
    public Mecha consultaPorId(int id) {
        for (Mecha m : mechas) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }
    
}
