package tema11.gestion_tienda_videojuegos;

public class Videojuego implements Comparable<Videojuego>{
    private String titulo;
    private String genero;
    private double precio;
    private int anioLanzamiento;
    private String plataforma;
    private int stock;

    public Videojuego(String titulo, String genero, double precio) {
        this.titulo = titulo;
        this.genero = genero;
        this.precio = precio;
    }

    // Getters & Setters
    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        }
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        if (anioLanzamiento >= 1970) {
            this.anioLanzamiento = anioLanzamiento;
        }
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        if (plataforma != null && (plataforma.equalsIgnoreCase("PC")
                                || plataforma.equalsIgnoreCase("PS5")
                                || plataforma.equalsIgnoreCase("XBOX"))) {

            this.plataforma = plataforma;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        }
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo
            + "\tGenero: " + genero
            + "\tPrecio: " + String.format("%.2f€", precio)
            + "\tAño de lanzamiento: " + anioLanzamiento
            + "\tPlataforma: " + plataforma
            + "\tStock: " + stock;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Videojuego)) return false;
        
        Videojuego v = (Videojuego) obj;
        return titulo.equalsIgnoreCase(v.titulo)
            && plataforma != null
            && v.plataforma != null
            && plataforma.equalsIgnoreCase(v.plataforma);
    }

    @Override
    public int hashCode() {
        return (titulo.toLowerCase() + plataforma.toLowerCase()).hashCode();
    }

    @Override
    public int compareTo(Videojuego o) {
        return Double.compare(this.precio, o.getPrecio());
    }
}
