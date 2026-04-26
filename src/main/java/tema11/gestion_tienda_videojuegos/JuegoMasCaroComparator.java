package tema11.gestion_tienda_videojuegos;

import java.util.Comparator;

public class JuegoMasCaroComparator implements Comparator<Videojuego>{

    @Override
    public int compare(Videojuego o1, Videojuego o2) {
        return Double.compare(o2.getPrecio(), o1.getPrecio());
    }
    
}
