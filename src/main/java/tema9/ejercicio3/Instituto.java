package tema9.ejercicio3;

import java.util.*;

public class Instituto implements Comparable<Instituto> {
    // Propiedades
    private HashSet<Curso> listaCursos;
    
    // Constructores
    public Instituto () {
        listaCursos = new HashSet<>();
        String[] nomCurso = {"1ºDAW","2ºDAW","1ºDAM","2ºDAM","1ºASIR","2ºASIR","1ºSMR","2ºSMR","1ºGA","2ºGA"};
        Curso c;
        
        for (int i = 0; i < 2; i++) {
            c = new Curso();
            c.setNombre(nomCurso[i]);
            listaCursos.add(c);
        }
    }
    
    public String consultaAlumno(int nExp) {
        // Recorre y busca el alumno, si existe devuelve su toString()
        for (Curso c : listaCursos) {
            if (c.consulta(nExp) != null) {
                return c.consulta(nExp).toString();
            }
        }
        
        return "No existe el alumno con número de expediente: "+nExp;
    }
    
    public String listadoCurso(String nombreCurso) {
        StringBuilder sb = new StringBuilder();
        
        for (Curso c : listaCursos) {
            if(c.getNombre().equalsIgnoreCase(nombreCurso)) {
                sb.append(nombreCurso).append("\n");
                sb.append(c.toString());
            }
        }
        
        return sb.toString();
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Curso c : listaCursos) {
            sb.append("======").append(c.getNombre()).append("======\n");
            sb.append(c.toString());
        }

        return sb.toString();
    }
    
    public boolean equals(Object otroInstituto) {
        Instituto otro = (Instituto) otroInstituto;
        
        // Si no tienen el mismo tamaño no son iguales
        if (this.listaCursos.size() != otro.listaCursos.size()) {
            return false;
        }
        
        // Si todos los cursos de un instituto están en el otro true, sino false
        for (Curso c : listaCursos) {
            if (!otro.listaCursos.contains(c)) {
                return false;
            }
        }
        
        return true;
    }

    @Override
    public int compareTo(Instituto o) {
        // Comparamos por tamaño
        int i = this.listaCursos.size() - o.listaCursos.size();
        
        // En caso de empate comparamos por cursos
        if (i == 0) {
            Iterator<Curso> it1 = this.listaCursos.iterator();
            Iterator<Curso> it2 = o.listaCursos.iterator();
            
            while (it1.hasNext() && it2.hasNext()) {
                i = it1.next().compareTo(it2.next());
                // Si no hay empate devuelve i;
                if(i != 0) return i;
            }
        }
        return i;
    }
}
