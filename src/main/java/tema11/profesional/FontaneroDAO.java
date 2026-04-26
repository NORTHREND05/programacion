package tema11.profesional;

import java.util.*;
import tema10.ejercicio1.ICRUD;

public class FontaneroDAO implements ICRUD<Fontanero> {
    private HashSet<Fontanero> fontaneros;

    public FontaneroDAO() {
        fontaneros = new HashSet<>();
    }
    
    @Override
    public boolean insertar(Fontanero elemento) {
        if (elemento == null) return false;
        
        // Si el elemento no existe lo insertamos
        if (consultaPorId(elemento.getId()) == null) {
            fontaneros.add(elemento);
            return true;
        }
        
        return false;
    }

    @Override
    public boolean borrar(int id) {
        if (consultaPorId(id) != null) {
            fontaneros.remove(consultaPorId(id));
            return true;
        }
        
        return false;
    }

    @Override
    public Fontanero modificar(int id, Fontanero nuevo) {
        if (nuevo == null) return null;
        
        if (consultaPorId(id) != null) {
            borrar(id);
            insertar(nuevo);
            return nuevo;
        }
        
        return null;
    }

    @Override
    public Fontanero consultaPorId(int id) {
        for (Fontanero f : fontaneros) {
            if (f.getId() == id) {
                return f;
            }
        }
        
        return null;
    }
}
