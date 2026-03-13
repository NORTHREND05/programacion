package tema9.ejercicio3;

import java.util.TreeSet;

public class Run {

    public static void main(String[] args) {
        TreeSet<Instituto> institutos = new TreeSet<>();
        int expedientePrueba = 8;

        // Crear institutos
        Instituto inst1 = new Instituto();
        Instituto inst2 = new Instituto();

        // Probar equals
        System.out.println("===== PRUEBA EQUALS =====");
        System.out.println("¿Instituto 1 e Instituto 2 son iguales?");
        System.out.println(inst1.equals(inst2));

        // Probar consulta de alumno
        System.out.println("===== BUSQUEDA DE ALUMNO =====");
        System.out.println(inst1.consultaAlumno(expedientePrueba));

        // Probar listado de curso
        System.out.println("===== LISTADO DE CURSO =====");
        System.out.println(inst1.listadoCurso("1ºDAW"));

        // Probar compareTo con TreeSet
        System.out.println("===== PRUEBA compareTo (TreeSet) =====");

        institutos.add(inst1);
        institutos.add(inst2);

        for (Instituto i : institutos) {
            System.out.println(i);
            System.out.println("----------------------------------");
        }

    }
}