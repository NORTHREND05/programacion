package tema10.gestion_personal;

import java.util.*;

public class Empresa {
    // Propiedades
    private String cif;
    private String nombre;
    private HashSet<Empleado> empleados;
    
    // Constructor (rellenando los empleados con distintos tipos)
    public Empresa () {
        empleados = new HashSet<>();
        
        for (int i = 0; i < 10; i++) {
            if (i<3) {
                empleados.add(new EmpleadoTemporal());
            } else if (i < 6) {
                empleados.add(new EmpleadoPorHoras());
            } else {
                empleados.add(new EmpleadoFijo());
            }
        }
    }
    
    
    
}
