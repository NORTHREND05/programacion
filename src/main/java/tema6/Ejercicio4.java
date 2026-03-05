package tema6;

import static mislibrerias.EntradaDatos.*;

public class Ejercicio4 {
    // Muestra pistas segun los casos
    public static String mostrarPistas(int nIntentos, String password, String intento) {
        StringBuilder aux = new StringBuilder();
        
        if (nIntentos == 3) {
            aux.append("La contrasena tiene ")
                    .append(password.length())
                    .append(" caracteres.\n");
        } else if (nIntentos == 6 && password.length() > 2) {
            aux.append("Los dos ultimos caracteres son ")
                    .append(password.substring(password.length() - 2))
                    .append(".\n");
        } else if (nIntentos >= 9) {
            aux.append(intento.compareTo(password) > 0 ? "La contrasena es menor alfabeticamente\n" : "La contrasena es mayor alfabeticamente\n");
        }
        
        return aux.toString();
    }
    
    // Muestra resultado segun si ha ganado o se ha rendido
    public static String mostrarResultado(String password, String intento) {
        if (intento.equals(password)) {
            return "Has acertado la contrasena :)";
        } else {
            return "Te has rendido :(\nLa contrasena era: "+ password;
        }
    }
    
    public static void main(String[] args) {
        String password, intento;
        int nIntentos = 0;
        
        password = getString("Introduce una contrasena: ");
        
        // Comprobación de intentos y llamada a función para mostrar pistas mientras no gane o se rinda
        do {
            intento = getString("Intenta adivinar la contrasena: ");
            // Si es diferente de la contraseña y es diferente de rendirse suma intentos y muestra pistas
            if (!intento.equals(password) && !intento.equalsIgnoreCase("rendirse")) {
                nIntentos++;
                System.out.print(mostrarPistas(nIntentos, password, intento));
            }
        } while (!intento.equals(password) && !intento.equalsIgnoreCase("rendirse"));
        
        System.out.println(mostrarResultado(password, intento));
    }
}
