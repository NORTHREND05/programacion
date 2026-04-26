package tema11.gestion_tienda_videojuegos;

import com.github.javafaker.Faker;
import java.util.*;

public class Tienda {
    private String nombre;
    private HashSet<Videojuego> videojuegos;
    private LinkedHashSet<Cliente> clientes;
    private TreeMap<Integer, Pedido> pedidos;

    public Tienda(String nombre) {
        this.nombre = nombre;
        videojuegos = new HashSet<>();
        clientes = new LinkedHashSet<>();
        pedidos = new TreeMap<>();
        
        rellenarVideojuegos(30);
        rellenarClientes(10);
    }
    
    public String getNombre() {
        return nombre;
    }

    public TreeMap<Integer, Pedido> getPedidos() {
        return pedidos;
    }

    public HashSet<Videojuego> getVideojuegos() {
        return videojuegos;
    }
    
    

    private void rellenarVideojuegos(int tam) {
        Faker f = new Faker();
        Videojuego v;
        String[] plataforma = {"PS5", "XBOX", "PC"};
        
        for (int i = 0; i < tam; i++) {
            v = new Videojuego(f.esports().game(), f.music().genre(), f.number().randomDouble(2, 1, 150));
            v.setAnioLanzamiento(f.number().numberBetween(1970, 2026));
            v.setPlataforma(plataforma[f.number().numberBetween(0, 2)]);
            v.setStock(f.number().numberBetween(0, 1000));
            addVideojuego(v);
        }
    }

    private void rellenarClientes(int tam) {
        Faker f = new Faker();
        ClienteNormal cn;
        ClientePremium cp;
        
        for (int i = 0; i < tam; i++) {
            if (i < tam / 2) {
                cn = new ClienteNormal(f.number().numberBetween(10000000, 99999999), f.name().firstName(), f.name().lastName());
                cn.setEmail(f.internet().emailAddress());
                clientes.add(cn);
            } else {
                cp = new ClientePremium(f.number().numberBetween(10000000, 99999999), f.name().firstName(), f.name().lastName());
                cp.setEmail(f.internet().emailAddress());
                cp.setPuntos(0);
                cp.setPorcentajeDescuento(f.number().numberBetween(0, 100));
                clientes.add(cp);
            }
        }
    }
    
    public boolean addVideojuego(Videojuego v) {
        if (v == null) return false;
        if (videojuegos.contains(v)) return false;
        
        videojuegos.add(v);
        return true;
    }
    
    public Videojuego videojuegoMasBarato() {
        if (videojuegos.isEmpty()) return null;

        Videojuego masBarato = null;

        for (Videojuego v : videojuegos) {
            if (masBarato == null || v.getPrecio() < masBarato.getPrecio()) {
                masBarato = v;
            }
        }

        return masBarato;
    }
    
    public ArrayList<Videojuego> videojuegosPorGenero(String genero) {
        ArrayList<Videojuego> lista = new ArrayList<>();
        if (genero == null) return lista;
        
        for (Videojuego v : videojuegos) {
            if (v.getGenero() != null && v.getGenero().equalsIgnoreCase(genero)) {
                lista.add(v);
            }
        }
        // De menor a mayor precio
        Collections.sort(lista);
        return lista;
    }
    
    public Pedido crearPedido(Cliente c) {
        if (c == null) return null;
        Faker f = new Faker();
        Pedido p;
        
        // Crear pedido mientras el id exista en la lista de pedidos
        do {
            p = new Pedido(f.number().numberBetween(0, 99999999), c);
        } while (pedidos.containsKey(p.getId()));
        
        pedidos.put(p.getId(), p);
        return p;
    }
    
    public ArrayList<ClienteNormal> getClientesNormales() {
        ArrayList<ClienteNormal> lista = new ArrayList<>();
        
        for (Cliente c : clientes) {
            if (c instanceof ClienteNormal) {
                lista.add((ClienteNormal) c);
            }
        }
        
        return lista;
    }
    
    public ArrayList<ClientePremium> getClientesPremium() {
        ArrayList<ClientePremium> lista = new ArrayList<>();
        
        for (Cliente c : clientes) {
            if (c instanceof ClientePremium) {
                lista.add((ClientePremium) c);
            }
        }
        
        return lista;
    }
    
    public String getCatalogo() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("CATALOGO:\n");
        for (Videojuego v : videojuegos) {
            sb.append(v + "\n");
        }
        
        return sb.toString();
    }
    
    public String getClientesPremiumString() {
        StringBuilder sb = new StringBuilder();
        ArrayList<ClientePremium> lista = getClientesPremium();
        
        sb.append("CLIENTES PREMIUM:\n");
        for (ClientePremium c : lista) {
            sb.append(c + "\n");
        }
        
        return sb.toString();
    }
    
    public String getVideojuegosMasCaros() {
        StringBuilder sb = new StringBuilder();
        ArrayList<Videojuego> lista = new ArrayList<>();
        JuegoMasCaroComparator comp = new JuegoMasCaroComparator();
        
        lista.addAll(videojuegos);
        lista.sort(comp);
        
        sb.append("JUEGOS MAS CAROS:\n");
        for (Videojuego v : lista) {
            sb.append(v + "\n");
        }
        
        return sb.toString();
    }
}
