package tema9.ejercicio1;

public class Cuenta {
    //Propiedades
    private int numCuenta;
    private float saldo;
    private String nombre;
    private String apellidos;
    private int telefono;

    //Constructores
    public Cuenta() {
        numCuenta = 0;
        saldo = 0;
        nombre = "DESCONOCIDO";
        apellidos = "DESCONOCIDO";
        telefono = -1;
    }

    public Cuenta(String pNombre, String pApellido) {
        saldo = 0;
        nombre = pNombre;
        apellidos = pApellido;
    }

    public Cuenta(float cantidad) {
        saldo = cantidad;
    }
    
    public Cuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    // Setters
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    // Getters
    public String getSaldo() {
        String aux;
        aux = "SALDO DE " + nombre + " " + apellidos + ": " + saldo + "€";
        return aux;
    }

    public long getNumCuenta() {
        return numCuenta;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public int getTelefono() {
        return telefono;
    }

    public void enviarBizum(float cantidad) {
        reintegro(cantidad);
    }

    public void ingresar(float cantidad) {
        if (cantidad < 0) {
            System.out.println("NO ES POSIBLE INGRESAR EN NEGATIVO");
        } else {
            saldo = saldo + cantidad;
        }

    }

    public float reintegro(float cantidad) {
        if (saldo > cantidad) {
            System.out.println("SALDO INSUFICIENTE");
            return 0;
        } else {
            saldo = saldo - cantidad;
            return cantidad;
        }
    }

    public void cambiarNombre(String nuevoNombre, String nuevoApellidos) {
        if (nombre.equalsIgnoreCase(nuevoNombre)) {
            System.out.println("ERES MUUUUU TONTOOOOO!!!");
        } else {
            nombre = nuevoNombre;
            apellidos = nuevoApellidos;
        }
    }
}
