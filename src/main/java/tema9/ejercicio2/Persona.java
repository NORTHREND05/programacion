package tema9.ejercicio2;

public class Persona {
    // Propiedades
    private String nombre;
    private String ape1;
    private String ape2;
    private byte edad;
    private NIF nif;
    
    // Constructores
    public Persona() {
        nombre = "";
        ape1 = "";
        ape2 = "";
        edad = -1;
        nif = new NIF();
    }
    
    public Persona(String nombre, String ape1, String ape2, byte edad) {
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
        this.edad = edad;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public byte getEdad() {
        return edad;
    }
    
    public NIF getNif() {
        return nif;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }
    
    public void setNif(long nif) {
        this.nif = new NIF(nif);
    }
    
    // Método que muestra a una persona por completo
    public String mostrarPersona() {
        StringBuilder s = new StringBuilder();
        
        s.append("Nombre: ").append(getNombre()).append("\n");
        s.append("Primer apellido: ").append(getApe1()).append("\n");
        s.append("Segundo apellido: ").append(getApe2()).append("\n");
        s.append("Edad: ").append(getEdad()).append(" años").append("\n");
        s.append("NIF: ").append(getNif()).append("\n\n");
        
        return s.toString();
    }
}
