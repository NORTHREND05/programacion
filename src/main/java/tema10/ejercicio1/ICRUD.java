package tema10.ejercicio1;

public interface ICRUD<T>{
    
    // Inserción
    public abstract boolean insertar(T elemento);

    public abstract boolean borrar(int id);

    public abstract T modificar(int id, T nuevo);

    public abstract T consultaPorId(int id);
}

