package tema11.gestion_tienda_videojuegos;

import java.util.*;

public class Pedido {
    private int id;
    private Cliente cliente;
    private ArrayList<Videojuego> videojuegos;

    public Pedido(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.videojuegos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public ArrayList<Videojuego> getVideojuegos() {
        return videojuegos;
    }
    
    public boolean addVideojuego(Videojuego v) {
        if (v == null) return false;
        
        // Si no se supera el limite y hay stock se añade a la lista
        if (videojuegos.size() < 10 && v.getStock() > 0) {
            videojuegos.add(v);
            return true;
        }
        return false;
    }
    
    public double calcularTotal() {
        double total = 0;
        
        for (Videojuego v : videojuegos) {
            total += v.getPrecio();
            v.setStock(v.getStock() - 1);
        }
        total = cliente.calcularPrecioFinal(total);
        return total;
    }
    
    public ArrayList<Videojuego> videojuegosMasCaros() {
        ArrayList<Videojuego> masCaros = new ArrayList<>();
        JuegoMasCaroComparator comp = new JuegoMasCaroComparator();
        
        masCaros.addAll(videojuegos);
        masCaros.sort(comp);
        
        return masCaros;
    }
}
