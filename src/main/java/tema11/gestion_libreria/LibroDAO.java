package tema11.gestion_libreria;

import java.util.*;
import tema10.ejercicio1.ICRUD;

public class LibroDAO implements ICRUD<Libro>{
    private HashSet<Libro> libros;

    public LibroDAO() {
        libros = new HashSet<>();
    }

    @Override
    public boolean insertar(Libro elemento) {
        if (elemento == null) return false;
        if (consultaPorId(elemento.getIsbn()) != null) return false;
        
        return libros.add(elemento);
    }

    @Override
    public boolean borrar(int id) {
        Libro borrado = consultaPorId(id);
        
        if (borrado == null) return false;
        return libros.remove(borrado);
    }

    @Override
    public Libro modificar(int id, Libro nuevo) {
        if (nuevo == null) return null;
        
        if (borrar(id)) {
            insertar(nuevo);
            return nuevo;
        }
        return null;
    }

    @Override
    public Libro consultaPorId(int id) {
        for (Libro l : libros) {
            if (l.getIsbn() == id) {
                return l;
            }
        }
        return null;
    }
    
}
