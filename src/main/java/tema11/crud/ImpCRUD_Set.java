package tema11.crud;

import java.util.*;
import tema9.ejercicio3.Alumno;

public class ImpCRUD_Set implements ICRUD {
    // Propiedades
    private LinkedHashSet<Alumno> la;
    
    // Constructores
    public ImpCRUD_Set () {
        la = new LinkedHashSet<>();
    }

    // Métodos
    @Override
    public boolean insertar(Alumno a) {
        // Si no existe ningun alumno con el id de a entonces lo insertamos
        if (consultaPorId(a.getnExpediente()) == null) {
            la.add(a);
            return true;
        }
        
        System.out.println("No se ha podido insertar el alumno.");
        return false;
    }

    @Override
    public boolean borrar(int numExp) {
        Alumno a = consultaPorId(numExp);
        
        // Si existe y coincide, lo elimina y devuelve true;
        if (a != null) {
            la.remove(a);
            return true;
        }
        
        return false;
    }

    @Override
    public Alumno modificar(int numExp, Alumno nuevo) {
        Alumno a = consultaPorId(numExp);
        
        // Si el alumno existe, lo modificamos con los nuevos datos y lo devolvemos
        if (a != null) {
            a.setNif(nuevo.getNif());
            a.setCuentaCorriente(nuevo.getCuentaCorriente());
            a.setNombre(nuevo.getNombre());
            a.setApellidos(nuevo.getApellidos());
            a.setEdad(nuevo.getEdad());
        }
        
        return a;
    }

    @Override
    public Alumno consultaPorId(int numExp) {
        // Recorre los alumnos y devuelve la coincidencia con el numExp, sino null
        for (Alumno a : la) {
            if(a.getnExpediente() == numExp) {
                return a;
            }
        }
        
        return null;
    }

    @Override
    public ArrayList<Alumno> consultaPorNombre(String nombre) {
        ArrayList<Alumno> listaA = new ArrayList<>();
        
        // Recorre los alumnos y busca por nombre, si coincide añade el alumno a la lista y devuelve la lista
        for (Alumno a : la) {
            if (a != null && a.getNombre().equalsIgnoreCase(nombre)) {
                listaA.add(a);
            }
        }
        
        return listaA;
    }
}
