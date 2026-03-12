package tema9.ejercicio3;

import java.util.*;

public class Instituto implements Comparable<Instituto>{
    // Propiedades
    private HashSet<Curso> listaCursos;
    
    // Constructores
    public Instituto () {
        listaCursos = new HashSet<>();
        String[] nomCurso = {"1ºDAW","2ºDAW","1ºDAM","2ºDAM","1ºASIR","2ºASIR","1ºSMR","2ºSMR","1ºGA","2ºGA"};
        Curso c;
        
        for (int i = 0; i < 10; i++) {
            c = new Curso();
            c.setNombre(nomCurso[i]);
            listaCursos.add(c);
        }
    }
    
    public String consultaAlumno(int nExp) {
        StringBuilder sb = new StringBuilder();
        
        for (Curso c : listaCursos) {
            if (c.consulta(nExp) != null) {
                sb.append(c.consulta(nExp).toString());
            }
        }
        
        return sb.toString();
    }
    
    public String listadoCurso(String nombreCurso) {
        StringBuilder sb = new StringBuilder();
        
        for (Curso c : listaCursos) {
            if(c.getNombre().equalsIgnoreCase(nombreCurso)) {
                sb.append(c.toString());
            }
        }
        
        return sb.toString();
    }
    
    @Override
    public String toString() {
        Iterator it = listaCursos.iterator();
        StringBuilder sb = new StringBuilder();
        Curso c;
        
        while (it.hasNext()) {
            c = (Curso) it.next();
            sb.append(c.getNombre()).append("\n");
            sb.append(c.toString());
        }
        
        return sb.toString();
    }
    
    public boolean equals(Object o) {
        Instituto i = (Instituto) o;
        
        return true;
    }

    @Override
    public int compareTo(Instituto o) {
        return 0;
    }
}
