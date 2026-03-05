package tema5;

import static mislibrerias.EntradaDatos.*;
import static mislibrerias.Figuras.*;

public class Ejercicio10 {    
    public static void main(String[] args) {
        int n;
        n = getNumberGreaterThan("Introduce un numero > 3: ", "Ese numero no es mayor que 3!!", 3);
        System.out.print(figuraEjercicio10(n));
    }
}
