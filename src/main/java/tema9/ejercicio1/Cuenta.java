package tema9.ejercicio1;

public class Cuenta {
    //Propiedades
    private long numCuenta;
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
    
    public Cuenta(long numCuenta) {
        this.numCuenta = numCuenta;
    }

    //Metodos
    public void indicarNombre(String n) {
        nombre = n;
    }

    public void indicarApellido(String a) {
        apellidos = a;
    }

    public void indicarTelefono(int t) {
        telefono = t;
    }

    public void ingresar(float cantidad) {
        if (cantidad < 0) {
            System.out.println("NO ES POSIBLE INGREASR EN NEGATIVO");
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

    public String getSaldo() {
        String aux;
        aux = "SALDO DE " + nombre + " " + apellidos + ": " + saldo + "€";
        return aux;
    }

    public long getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(long numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void enviarBizum(float cantidad) {
        reintegro(cantidad);
    }

    public void cambiarNombre(String nuevoNombre, String nuevoApellido) {
        if (nombre.equalsIgnoreCase(nuevoNombre)) {
            System.out.println("ERES MUUUUU TONTOOOOO!!!");
        } else {
            nombre = nuevoNombre;
            apellidos = nuevoApellido;
        }
    }
}
