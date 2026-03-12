package tema9.ejercicio3;

import tema9.ejercicio1.Cuenta;
import tema9.ejercicio2.NIF;

public class Alumno {
    // Propiedades
    private int nExpediente;
    private NIF nif;
    private Cuenta cuentaCorriente;
    private String nombre;
    private String apellidos;
    private byte edad;
    
    // Constructores
    public Alumno() {
        nExpediente = 0;
        nif = new NIF();
        cuentaCorriente = new Cuenta();
        nombre = "DESCONOCIDO";
        apellidos = "DESCONOCIDO";
        edad = -1;
    }
    
    public Alumno(int nExpediente, NIF nif, Cuenta cuentaCorriente, String nombre, String apellidos, byte edad) {
        this.nExpediente = nExpediente;
        this.nif = nif;
        this.cuentaCorriente = cuentaCorriente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    public Alumno(int nExpediente, NIF nif, Cuenta cuentaCorriente) {
        this.nExpediente = nExpediente;
        this.nif = nif;
        this.cuentaCorriente = cuentaCorriente;
    }
    
    public Alumno(String nombre) {
        this.nExpediente = 0;
        this.nombre = nombre;
    }
    
    // Getters
    public int getnExpediente() {
        return nExpediente;
    }

    public NIF getNif() {
        return nif;
    }

    public Cuenta getCuentaCorriente() {
        return cuentaCorriente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public byte getEdad() {
        return edad;
    }
    
    // Setters
    public void setnExpediente(int nExpediente) {
        this.nExpediente = nExpediente;
    }

    public void setNif(NIF nif) {
        this.nif = nif;
    }

    public void setCuentaCorriente(Cuenta cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }
    
    @Override
    public boolean equals(Object alumno) {
        Alumno otro = (Alumno) alumno;
        
        // Si el nexpediente o el nif no coinciden devolver false        
        return (this.getnExpediente() == otro.getnExpediente() && this.getNif().mostrarNIF().equalsIgnoreCase(otro.getNif().mostrarNIF()));
    }
    
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        
        s.append("Número de expediente: ").append(getnExpediente()).append("\n");
        s.append("NIF: ").append(getNif().mostrarNIF()).append("\n");
        s.append("Cuenta corriente: ").append(getCuentaCorriente().getNumCuenta()).append("\n");
        s.append("Nombre: ").append(getNombre()).append("\n");
        s.append("Apellidos: ").append(getApellidos()).append("\n");
        s.append("Edad: ").append(getEdad()).append(" años").append("\n");
        
        return s.toString();
    }
}
