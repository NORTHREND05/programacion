package tema11.ejercicio1;

import java.util.ArrayList;
import tema9.ejercicio3.Alumno;
import tema9.ejercicio2.NIF;
import tema9.ejercicio1.Cuenta;

public class Run {

    public static void main(String[] args) {

        System.out.println("===== PRUEBA IMPLEMENTACION ARRAY =====");
        ICRUD crudArray = new ImpCRUD_EED(10);
        probarCRUD(crudArray);

        System.out.println("\n===== PRUEBA IMPLEMENTACION SET =====");
        ICRUD crudSet = new ImpCRUD_Set();
        probarCRUD(crudSet);
    }

    public static void probarCRUD(ICRUD crud) {

        // Crear NIF
        NIF nif1 = new NIF(12345678);
        NIF nif2 = new NIF(87654321);
        NIF nif3 = new NIF(11223344);

        // Crear cuentas
        Cuenta c1 = new Cuenta(1001);
        Cuenta c2 = new Cuenta(1002);
        Cuenta c3 = new Cuenta(1003);

        // Crear alumnos
        Alumno a1 = new Alumno(1, nif1, c1, "Juan", "Perez", (byte)20);
        Alumno a2 = new Alumno(2, nif2, c2, "Ana", "Lopez", (byte)21);
        Alumno a3 = new Alumno(3, nif3, c3, "Juan", "Garcia", (byte)22);

        // INSERTAR
        System.out.println("Insertar a1: " + crud.insertar(a1));
        System.out.println("Insertar a2: " + crud.insertar(a2));
        System.out.println("Insertar a3: " + crud.insertar(a3));

        // CONSULTA POR ID
        System.out.println("\nConsulta por ID 2:");
        System.out.println(crud.consultaPorId(2));

        // CONSULTA POR NOMBRE
        System.out.println("\nConsulta por nombre 'Juan':");
        ArrayList<Alumno> lista = crud.consultaPorNombre("Juan");

        for (Alumno a : lista) {
            System.out.println(a);
        }

        // MODIFICAR
        System.out.println("\nModificando alumno 1...");
        Alumno nuevo = new Alumno(1, nif1, c1, "Juan", "Modificado", (byte)25);
        crud.modificar(1, nuevo);

        System.out.println(crud.consultaPorId(1));

        // BORRAR
        System.out.println("\nBorrando alumno 2...");
        crud.borrar(2);

        System.out.println("Consulta ID 2 tras borrar:");
        System.out.println(crud.consultaPorId(2));
    }
}