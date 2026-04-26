package tema11.gestion_libreria;

import com.github.javafaker.Faker;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Faker f = new Faker();
        Libro libro = new Libro(f.number().numberBetween(10000000, 99999999), f.book().title(), f.book().author());
        Libreria l;
        ClienteNormal cn;
        ClientePremium cp;
        
        try {
            l = new Libreria("Libros Pepe", "Valencia", libro);
            cn = new ClienteNormal(f.number().numberBetween(10000000, 99999999), f.name().fullName(), f.internet().emailAddress());
            cp = new ClientePremium(f.number().numberBetween(10000000, 99999999), f.name().fullName(), f.internet().emailAddress());
            cp.setFechaAlta(LocalDate.now());
            cp.setPorcentajeDescuento(15);
            System.out.println(l);
            System.out.println(l.getCatalogo());
            System.out.println("Libro mas caro: " + l.getLibroMasCaro());
            System.out.println("Precio cliente normal: " + cn.calcularPrecioFinal(l.getLibroMasCaro().getPrecio()));
            System.out.println("Precio cliente premium: " + cp.calcularPrecioFinal(l.getLibroMasCaro().getPrecio()));
            System.out.println("Libros de "+libro.getAutor()+":\n" + l.getLibrosPorAutor(libro.getAutor()));
            System.out.println("Precio total de todos los libros: " + String.format("%.2f€", l.getPrecioTotalLibros()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
