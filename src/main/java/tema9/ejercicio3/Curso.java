package tema9.ejercicio3;

import java.util.*;
import com.github.javafaker.Faker;
import tema9.ejercicio1.Cuenta;
import tema9.ejercicio2.NIF;

public class Curso {
    // Propiedades
    private HashMap<Integer, Alumno> curso;
    private String nombre;
    // Constructor
    public Curso() {
        nombre = "INDEFINIDO";
        curso = new HashMap<>();
        Faker f = new Faker();
        Alumno a;
        NIF nif;
        Cuenta cuenta;
        
        // Crea el alumno, añadelo al map de alumnos n veces
        for (int i = 0; i < 20; i++) {
            nif = new NIF();
            cuenta = new Cuenta();
            a = new Alumno();
            a.setnExpediente((int) (Math.random() * 99999999));
            a.setNif(nif);
            a.setCuentaCorriente(cuenta);
            a.setNombre(f.name().name());
            a.setApellidos(f.name().lastName() + " " + f.name().lastName());
            a.setEdad((byte) (Math.random() * 127));
            curso.put(a.getnExpediente(), a);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Método que muestra los alumnos en formato tabular
    @Override
    public String toString () {
        StringBuilder sb = new StringBuilder();
        Alumno a;
        // Mientras haya alumnos los muestra en formato tabular
        for (Integer k : curso.keySet()) {
            a = curso.get(k);
            sb.append(a.toString()).append("\n");
        }
        
        return sb.toString();
    }
    
    public Alumno consulta(int nExpediente) {
        Alumno objetivo = curso.get(nExpediente);
        
        if(objetivo == null) {
            System.out.println("No existe un alumno con el expediente " + nExpediente);
        }
        
        return objetivo;
    }
    
    public boolean modificacion(Alumno alumno, int nExpediente) {
        Alumno aux = consulta(nExpediente);
        
        if(aux != null) {
            curso.put(nExpediente, aux);
            return true;
        }
        
        return false; // No se ha modificado
    }
}
