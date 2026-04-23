package tema10.ejercicio1;

public class VehiculoCRUD_EED implements ICRUD<Vehiculo> {
    // Propiedades
    private Vehiculo[] vehiculos;

    // Constructor
    public VehiculoCRUD_EED(int tamano) {
        vehiculos = new Vehiculo[tamano];
    }
    
    @Override
    public boolean insertar(Vehiculo elemento) {
        if (elemento == null) return false;

        // Si el vehiculo no existe en el array ponlo en un indice vacio
        if (consultaPorId(elemento.getCv()) == null) {
            for (int i = 0; i < vehiculos.length; i++) {
                if (vehiculos[i] == null) {
                    vehiculos[i] = elemento;
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public boolean borrar(int id) {
        if (consultaPorId(id) != null) {
            for (int i = 0; i < vehiculos.length; i++) {
                if (vehiculos[i] != null && vehiculos[i].getCv() == id) {
                    vehiculos[i] = null;
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public Vehiculo modificar(int id, Vehiculo nuevo) {
        if (consultaPorId(id) != null) {
            for (int i = 0; i < vehiculos.length; i++) {
                if (vehiculos[i] != null && vehiculos[i].getCv() == id) {
                    vehiculos[i] = nuevo;
                    return vehiculos[i];
                }
            }
        }

        return null;
    }

    @Override
    public Vehiculo consultaPorId(int id) {
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] != null && vehiculos[i].getCv() == id) {
                return vehiculos[i];
            }
        }

        return null;
    }
}
