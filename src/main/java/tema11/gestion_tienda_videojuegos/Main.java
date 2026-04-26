package tema11.gestion_tienda_videojuegos;

public class Main {
    public static void main(String[] args) {
        Tienda t = new Tienda("Game");
        ClienteNormal normal = t.getClientesNormales().get(1);
        ClientePremium premium = t.getClientesPremium().get(1);
        Pedido p1 = t.crearPedido(normal);
        Pedido p2 = t.crearPedido(premium);
        int i = 0;
        
        for (Videojuego v : t.getVideojuegos()) {
            if (i < 5) {
                p1.addVideojuego(v);
            } else if (i < 10) {
                p2.addVideojuego(v);
            }
            i++;
        }
        
        System.out.println(t.getCatalogo());
        System.out.println("VIDEOJUEGO MAS BARATO:\n" + t.videojuegoMasBarato() + "\n");
        System.out.println("Total pedido 1: " + p1.calcularTotal() + "\n");
        System.out.println("Total pedido 2: " + p2.calcularTotal() + "\n");
        System.out.println(t.getClientesPremiumString());
        System.out.println(t.getVideojuegosMasCaros());
    }
}
