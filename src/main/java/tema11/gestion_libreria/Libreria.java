package tema11.gestion_libreria;

import com.github.javafaker.Faker;
import java.util.*;

public class Libreria {
    private String nombre;
    private String ciudad;
    private HashMap<Integer, Libro> libros;

    public Libreria(String nombre, String ciudad, Libro libro) throws Exception {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.libros = new HashMap<>();
        
        if (libro == null) {
            throw new Exception("Error: La libreria debe tener al menos un libro.");
        }
        addLibro(libro);
        
        rellenarLibros();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    public boolean addLibro(Libro l) {
        if (l == null) return false;
        if (libros.containsKey(l.getIsbn())) return false;
        
        libros.put(l.getIsbn(), l);
        return true;
    }
    
    public ArrayList<Libro> getLibrosPorAutor(String autor) {
        ArrayList<Libro> lista = new ArrayList<>();
        
        if(autor == null) return lista;
        
        for (Libro l : libros.values()) {
            if (l.getAutor() != null && l.getAutor().equalsIgnoreCase(autor)) {
                lista.add(l);
            }
        }
        // Ordenar por orden natural de los libros(precio)
        Collections.sort(lista);
        return lista;
    }
    
    public double getPrecioTotalLibros() {
        double total = 0;
        
        for (Libro l : libros.values()) {
            total += l.getPrecio();
        }
        return total;
    }
    
    public Libro getLibroMasCaro() {
        Libro masCaro = null;
        
        // Si todavia no hay masCaro o l es mas caro que masCaro, masCaro obtendra el valor l
        for (Libro l : libros.values()) {
            if (masCaro == null || l.getPrecio() > masCaro.getPrecio()) {
                masCaro = l;
            }
        }
        return masCaro;
    }

    private void rellenarLibros() {
        Faker f = new Faker();
        Libro l;
        
        do {            
            l = new Libro(f.number().numberBetween(10000000, 99999999), f.book().title(), f.book().author());
            l.setPrecio(f.number().randomDouble(2, 5, 500));
            addLibro(l);
        } while (libros.size() < 50);
    }
    
    public String getCatalogo() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("CATALOGO:\n");
        for (Libro l : libros.values()) {
            sb.append(l + "\n");
        }
        
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\tCiudad: " + ciudad;
    }
}
