package tema10.ejercicio1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        VehiculoCRUD_EED crud = new VehiculoCRUD_EED(10);
        Vehiculo v1 = new Vehiculo("Toyota", 120);
        Vehiculo v2 = new Vehiculo("Ford", 150);
        Vehiculo v3 = new Vehiculo("Toyota", 180);
        ArrayList<Vehiculo> lista;

        // Insertar
        crud.insertar(v1);
        crud.insertar(v2);
        crud.insertar(v3);

        System.out.println("Vehículos insertados");

        // Consulta por id
        System.out.println("\nConsulta ID 150:");
        Vehiculo v = crud.consultaPorId(150);

        if (v != null) {
            System.out.println(v.mostrarInformacion());
        }

        // Modificar
        Vehiculo nuevo = new Vehiculo("BMW", 150);
        crud.modificar(150, nuevo);
        System.out.println("\nDespués de modificar:");
        System.out.println(crud.consultaPorId(150).mostrarInformacion());

        // Borrar
        crud.borrar(120);
        System.out.println("\nDespués de borrar 120:");
        if (crud.consultaPorId(120) == null) {
            System.out.println("Vehiculo eliminado correctamente");
        }
    }
}