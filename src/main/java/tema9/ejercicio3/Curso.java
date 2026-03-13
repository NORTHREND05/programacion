package tema9.ejercicio3;

import java.util.*;
import com.github.javafaker.Faker;
import tema9.ejercicio1.Cuenta;
import tema9.ejercicio2.NIF;

public class Curso implements Comparable<Curso> {
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
        int n;
        
        // Crea el alumno, añadelo al map de alumnos n veces
        for (int i = 0; i < 5; i++) {
            nif = new NIF();
            cuenta = new Cuenta();
            a = new Alumno();
            do {
                n = (int) (Math.random() * 20);
            } while (curso.containsKey(n));
            a.setnExpediente(n);
            a.setNif(nif);
            a.setCuentaCorriente(cuenta);
            a.setNombre(f.name().name());
            a.setApellidos(f.name().lastName() + " " + f.name().lastName());
            a.setEdad((byte) (Math.random() * 100));
            
            curso.put(a.getnExpediente(), a);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Alumno consulta(int nExpediente) {
        Alumno a = curso.get(nExpediente);
        
        // Si el alumno no existe, entonces devuelve null, sino el alumno
        if(a == null) return null;
        
        return a;
    }
    
    public boolean modificacion(Alumno alumno, int nExpediente) {
        Alumno aux = consulta(nExpediente);
        
        if(aux != null) {
            curso.put(nExpediente, alumno);
            return true;
        }
        
        return false; // No se ha modificado
    }
    
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
    
    @Override
    public boolean equals(Object otroCurso) {
        Curso c = (Curso) otroCurso;
        
        // Si el el tamaño de los cursos es diferente no son iguales
        if(this.curso.size() != c.curso.size()) {
            return false;
        }
        
        // Recorre todos los alumnos y sino son iguales devuelve false
        for (Integer nExp : curso.keySet()) {
            Alumno a1 = curso.get(nExp);
            Alumno a2 = c.curso.get(nExp);
            
            if (a2 == null || !a1.equals(a2)) {
                return false;
            }
        }
        
        return true;
    }

    @Override
    public int compareTo(Curso o) {
        // Comparamos por tamaño del curso
        int i = this.curso.size() - o.curso.size();
        
        // En caso de empate por nombre del curso
        if(i == 0) {
            return this.nombre.compareTo(o.nombre);
        }
        
        return i;
    }
}
