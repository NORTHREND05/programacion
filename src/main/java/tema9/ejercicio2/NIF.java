package tema9.ejercicio2;

import java.util.*;

public class NIF {
    // Propiedades
    private long dni;
    private char letra;
    
    // Constructores
    public NIF() {
        this.dni = 0;
        this.letra = ' ';
    }
    
    public NIF(long dni) {
        this.dni = dni;
        this.letra = calcularLetra(dni);
    }
    
    // Getters
    public long getDni() {
        return dni;
    }
    
    // Setters
    public void setDni(long dni) {
        this.dni = dni;
        this.letra = calcularLetra(dni);
    }
    
    // Método que lee un número de dni y le asigna la letra calculada
    public long leer() {
        Scanner s = new Scanner(System.in);
        String dniRegexp = "^\\d{8}$", entrada;
        
        // Comprobacion de los digitos del dni
        do {
            System.out.print("Introduce el numero de DNI(8 digitos): ");
            entrada = s.nextLine();
            
            if(!entrada.matches(dniRegexp)) {
                System.out.println("Error. Debe tener 8 digitos exactos.");
            }
        } while (!entrada.matches(dniRegexp));
        
        setDni(Long.parseLong(entrada));
        
        return this.dni;
    }
    
    // Método que devuelve el NIF con numero de dni y letra correspondiente
    @Override
    public String toString() {
        return dni + "-" + letra;
    }
    
    // Método que calcula y devuelve la letra correspondiente al dni
    private char calcularLetra(long nDni) {
        char[] letras = {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J',
            'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };
        return letras[(int) (nDni % 23)];
    }
}
