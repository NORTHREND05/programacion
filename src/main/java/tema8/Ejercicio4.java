package tema8;

import java.util.*;
import static mislibrerias.EntradaDatos.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayDeque<Integer> cola = new ArrayDeque<>();
        int numTique = 1;
        int opcion;
        
        // Pedir opcion mientras sea diferente de 5
        do {
            System.out.println(mostrarMenu());
            opcion = getPositiveNumber("Elige opcion: ", "Error... Debe ser entre 1 y 5.");
            
            // Realizar caso según 
            switch (opcion) {
                case 1:
                    numTique = nuevoPaciente(cola, numTique);
                    break;
                case 2:
                    atenderPaciente(cola);
                    break;
                case 3:
                    mostrarCantidad(cola);
                    break;
                case 4:
                    mostrarSiguiente(cola);
                    break;
                case 5:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opcion no válida.");
            }

        } while (opcion != 5);
    }
    
    // Muestra menu
    public static String mostrarMenu() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("CONSULTA MEDICA");
        sb.append("1. Llega nuevo paciente");
        sb.append("2. Atender paciente");
        sb.append("3. Cuantos quedan");
        sb.append("4. Quien es el siguiente");
        sb.append("5. Salir");
        
        return sb.toString();
    }

    // Añade un paciente con offer()
    public static int nuevoPaciente(ArrayDeque<Integer> cola, int numeroTique) {
        cola.offer(numeroTique);
        System.out.println("Paciente añadido con el numero de tique: " + numeroTique);
        return numeroTique + 1;
    }

    // Atiende un paciente con poll()
    public static String atenderPaciente(ArrayDeque<Integer> cola) {
        StringBuilder sb = new StringBuilder();
        
        // Si esta vacio no hace nada sino elimina el paciente atendido
        if (cola.isEmpty()) {
            sb.append("No hay pacientes en espera.");
        } else {
            sb.append("Paciente atendido: ").append(cola.poll());
        }
        
        return sb.toString();
    }

    // Muestra los pacientes en espera con size()
    public static String mostrarCantidad(ArrayDeque<Integer> cola) {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Pacientes en espera: ").append(cola.size());
        
        return sb.toString();
    }

    // Muestra el siguiente paciente con peek()
    public static String mostrarSiguiente(ArrayDeque<Integer> cola) {
        StringBuilder sb = new StringBuilder();
        
        // Si esta vacio no hace nada sino muestra el siguiente paciente
        if (cola.isEmpty()) {
            sb.append("No hay pacientes en espera.");
        } else {
            sb.append("Siguiente paciente: ").append(cola.peek());
        }
        
        return sb.toString();
    }
}
