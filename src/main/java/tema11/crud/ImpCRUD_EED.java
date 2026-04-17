package tema11.crud;

import java.util.*;
import tema9.ejercicio3.Alumno;

public class ImpCRUD_EED implements ICRUD {
    // Propiedades
    private Alumno[] la;
    
    // Constructores
    public ImpCRUD_EED(int tam) {
        la = new Alumno[tam];
    }
    
    // Métodos
    @Override
    public boolean insertar(Alumno a) {
        // Si el alumno no existe ponlo en el indice vacio del array
        if (consultaPorId(a.getnExpediente()) == null) {
            for (int i = 0; i < la.length; i++) {
                if(la[i] == null) {
                    la[i] = a;
                    return true;
                }
            }
        }
        
        System.out.println("No se ha podido insertar el alumno.");
        return false;
    }

    @Override
    public boolean borrar(int numExp) {
        // Si existe, lo buscamos y lo ponemos a null
        if (consultaPorId(numExp) != null) {
            for (int i = 0; i < la.length; i++) {
                if (la[i] != null && la[i].getnExpediente() == numExp) {
                    la[i] = null;
                    return true;
                }
            }
        }
        
        return false;
    }

    @Override
    public Alumno modificar(int numExp, Alumno nuevo) {
        // Si existe lo modificamos y lo devolvemos
        if(consultaPorId(numExp) != null) {
            for (Alumno aux : la) {
                if (aux != null && aux.getnExpediente() == numExp) {
                    aux.setNif(nuevo.getNif());
                    aux.setNombre(nuevo.getNombre());
                    aux.setApellidos(nuevo.getApellidos());
                    aux.setEdad(nuevo.getEdad());
                    aux.setCuentaCorriente(nuevo.getCuentaCorriente());
                    return aux;
                }
            }
        }
        
        return null;
    }

    @Override
    public Alumno consultaPorId(int numExp) {
        // Recorre los alumnos y busca por numExp, si coincide devuelve alumno, sino null
        for (Alumno a : la) {
            if (a != null && a.getnExpediente() == numExp) {
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
