package tema10.gestion_personal;

import com.github.javafaker.Faker;
import java.time.LocalDate;
import java.util.*;
import tema9.ejercicio2.NIF;

public class Empresa {
    // Propiedades
    private String cif;
    private String nombre;
    private String localidad;
    private HashSet<Empleado> empleados;
    
    // Constructor (rellenando los empleados con distintos tipos)
    public Empresa () {
        cif = "B12345678";
        nombre = "Conservas Cameros S.L.";
        localidad = "Logroño";
        empleados = new HashSet<>();
        
        Faker f = new Faker();
        NIF nif;
        String nombreCompleto;
        byte edad;
        LocalDate fechaAlta, fechaBaja;
        int anyoIncorporacion;
        EmpleadoTemporal et;
        EmpleadoPorHoras eh;
        EmpleadoFijo ef;
                
        for (int i = 0; i < 10; i++) {
            nombreCompleto = f.name().fullName();
            nif = new NIF(f.number().numberBetween(10000000L, 99999999L));
            edad = (byte) f.number().numberBetween(18, 65);
            
            if (i<3) {
                fechaAlta = LocalDate.now().minusMonths(f.number().numberBetween(1, 12));
                fechaBaja = fechaAlta.plusMonths(f.number().numberBetween(1, 12));
                
                et = new EmpleadoTemporal(
                    nombreCompleto, nif, edad, fechaAlta, fechaBaja
                );
                empleados.add(et);
            } else if (i < 6) {
                eh = new EmpleadoPorHoras(
                    nombreCompleto, nif, edad
                );
                eh.setHorasTrabajadas(f.number().numberBetween(80, 320));
                empleados.add(eh);
            } else {
                anyoIncorporacion = f.number().numberBetween(2000, 2026);
                ef = new EmpleadoFijo(
                    nombreCompleto, nif, edad, anyoIncorporacion
                );
                empleados.add(ef);
            }
        }
    }
    
    public String getCosteLaboral() {
        StringBuilder sb = new StringBuilder();
        float subtotalET = 0, subtotalEH = 0, subtotalEF = 0, costeTotal;
        ArrayList<EmpleadoTemporal> listaET = getEmpleadosTemporales();
        ArrayList<EmpleadoPorHoras> listaEH = getEmpleadosPorHoras();
        ArrayList<EmpleadoFijo> listaEF = getEmpleadosFijos();
        
        sb.append("COSTE LABORAL DE LA EMPRESA: " + nombre + "\n");
        sb.append("CIF: " + cif + "\n");
        sb.append("Localidad: " + localidad + "\n");
        sb.append("EMPLEADOS DE LA EMPRESA\n\n");
        
        sb.append("Empleados temporales: " + listaET.size() + "\n");
        for (EmpleadoTemporal et : listaET) {
            sb.append("• "+et.getNif()+" "+et.getNombreCompleto()+" - " +"Salario: "+String.format("%.2f", et.calculaSueldo())+"\n");
            subtotalET += et.calculaSueldo();
        }
        sb.append("\t\t\tSubtotal empleados temporales: "+String.format("%.2f €", subtotalET)+"\n");
        
        sb.append("Empleados por horas: " + listaEH.size() + "\n");
        for (EmpleadoPorHoras eh : listaEH) {
            sb.append("• "+eh.getNif()+" "+eh.getNombreCompleto()+" - " +"Salario: "+String.format("%.2f", eh.calculaSueldo())+"\n");
            subtotalEH += eh.calculaSueldo();
        }   
        sb.append("\t\t\tSubtotal empleados por horas: " + String.format("%.2f €", subtotalEH) +"\n");
        
        sb.append("Empleados fijos: " + listaEF.size() + "\n");
        for (EmpleadoFijo ef : listaEF) {
            sb.append("• "+ef.getNif()+" "+ef.getNombreCompleto()+" - " +"Salario: "+String.format("%.2f", ef.calculaSueldo())+"\n");
            subtotalEF += ef.calculaSueldo();
        }   
        sb.append("\t\t\tSubtotal empleados fijos: "+String.format("%.2f €", subtotalEF)+"\n");
        
        costeTotal = subtotalEF + subtotalEH + subtotalET;
        sb.append("\t\t\tCOSTE TOTAL DEL MES: "+String.format("%.2f €", costeTotal)+"\n");
        
        return sb.toString();
    }
    
    public ArrayList<EmpleadoTemporal> getEmpleadosTemporales () {
        ArrayList<EmpleadoTemporal> et = new ArrayList<>();
        
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoTemporal) {
                et.add((EmpleadoTemporal) empleado);
            }
        }
        
        return et;
    }
    
    public ArrayList<EmpleadoFijo> getEmpleadosFijos () {
        ArrayList<EmpleadoFijo> ef = new ArrayList<>();
        
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoFijo) {
                ef.add((EmpleadoFijo) empleado);
            }
        }
        
        return ef;
    }
    
    public ArrayList<EmpleadoPorHoras> getEmpleadosPorHoras () {
        ArrayList<EmpleadoPorHoras> eh = new ArrayList<>();
        
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPorHoras) {
                eh.add((EmpleadoPorHoras) empleado);
            }
        }
        
        return eh;
    }
}
