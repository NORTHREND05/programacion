package tema12;

import static mislibrerias.EntradaDatos.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        int n1, n2, cociente;
        
        try {
            n1 = getNumero("Introduce un numero: ");
            n2 = getNumero("Introduce otro numero: ");
            
            cociente = n1 / n2;
            
            System.out.println("El resultado de la division es: " + cociente);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir un numero entre 0.");
        }
    }
}
