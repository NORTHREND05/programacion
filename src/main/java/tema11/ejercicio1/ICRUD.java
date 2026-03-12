package tema11.ejercicio1;

import java.util.*;
import tema9.ejercicio3.Alumno;

public interface ICRUD {
    // Inserción
    public abstract boolean insertar(Alumno a);

    public abstract boolean borrar(int numExp);

    public abstract Alumno modificar(int numExp, Alumno nuevo);

    public abstract Alumno consultaPorId(int numExp);

    public abstract ArrayList<Alumno> consultaPorNombre(String nombre);

}
