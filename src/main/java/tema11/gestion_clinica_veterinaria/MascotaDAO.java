package tema11.gestion_clinica_veterinaria;

import java.util.HashSet;
import tema10.ejercicio1.ICRUD;

public class MascotaDAO implements ICRUD<Mascota>{
    private HashSet<Mascota> mascotas;

    public MascotaDAO() {
        mascotas = new HashSet<>();
    }

    @Override
    public boolean insertar(Mascota elemento) {
        if (elemento == null) return false;
        if (consultaPorId(elemento.getId()) != null) return false;
        
        return mascotas.add(elemento);
    }

    @Override
    public boolean borrar(int id) {
        Mascota m = consultaPorId(id);
        
        if (m == null) return false;
        return mascotas.remove(m);
    }

    @Override
    public Mascota modificar(int id, Mascota nuevo) {
        if (nuevo == null) return null;
        
        if (borrar(id)) {
            insertar(nuevo);
            return nuevo;
        }
        return null;
    }

    @Override
    public Mascota consultaPorId(int id) {
        for (Mascota m : mascotas) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }
    
}
