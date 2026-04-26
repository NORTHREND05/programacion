package tema11.gestion_libreria;

public class Libro implements Comparable<Libro>{
    private int isbn;
    private String titulo;
    private String autor;
    private double precio;

    public Libro(int isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Libro)) return false;
        
        Libro l = (Libro) obj;
        return this.isbn == l.isbn;
    }

    @Override
    public int hashCode() {
        return this.isbn % 1000;
    }

    @Override
    public int compareTo(Libro o) {
        return Double.compare(o.precio, this.precio);
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn
             + "\tTitulo: " + titulo
             + "\tAutor: " + autor
             + "\tPrecio: " + String.format("%.2f€", precio);
    }
}
