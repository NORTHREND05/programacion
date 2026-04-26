package tema11.gestion_clinica_veterinaria;

public class Mascota implements Comparable<Mascota>{
    private int id;
    private String nombre;
    private String especie;
    private byte edad;
    private float peso;

    public Mascota(int id, String nombre, String especie) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public byte getEdad() {
        return edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setEdad(byte edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }

    public void setPeso(float peso) {
        if (peso > 0) {
            this.peso = peso;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(!(obj instanceof Mascota)) return false;
        
        Mascota m = (Mascota) obj;
        return this.id == m.id;
    }

    @Override
    public int hashCode() {
        return id % 100;
    }
    
    @Override
    public int compareTo(Mascota o) {
        return Byte.compare(o.edad, this.edad);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
            + "\tEspecie: " + especie
            + "\tEdad: " + edad + " años"
            + "\tPeso: " + String.format("%.2fkg", peso);
    }
}
