package tema11.gestion_tienda_videojuegos;

import java.util.*;
import tema10.ejercicio1.ICRUD;

public class ClienteDAO implements ICRUD<Cliente>{
    private HashSet<Cliente> clientes;

    public ClienteDAO() {
        clientes = new HashSet<>();
    }

    @Override
    public boolean insertar(Cliente elemento) {
        if (elemento == null) return false;
        if (consultaPorId(elemento.getId()) != null) return false;
        
        return clientes.add(elemento);
    }

    @Override
    public boolean borrar(int id) {
        Cliente c = consultaPorId(id);
        if (c == null) return false;
        
        return clientes.remove(c);
    }

    @Override
    public Cliente modificar(int id, Cliente nuevo) {
        if(nuevo == null) return null;
        
        if (borrar(id)) {
            insertar(nuevo);
            return nuevo;
        }
        return null;
    }

    @Override
    public Cliente consultaPorId(int id) {
        for (Cliente c : clientes) {
            if (c.getId() == id) {
                return c;
            }
        }
        
        return null;
    }
    
}
