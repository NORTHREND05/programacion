package repaso2Eval.tema6repaso;

import java.util.Scanner;

public class Ejercicio5 {
    static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        String password, intento;
        int nIntentos = 0;
        
        password = getPassword(
            "Jugador 1 introduce la contrasena: ",
            "La contrasena no puede estar vacia."
        );
        
        do {
            intento = getPassword(
                "Jugador 2 adivina la contrasena (rendirse para terminar): ",
                "El intento no debe estar vacio."
            );
            
            if (!intento.equals(password)) {
                nIntentos++;
                System.out.println("Has fallado.");
                System.out.println(mostrarPistas(nIntentos, password, intento));
            }
        } while (!intento.equals(password) && !intento.equalsIgnoreCase("rendirse"));
        
        if (intento.equals(password)) {
            System.out.println("GANASTE");
        } else {
            System.out.println("GAME OVER");
        }
    }
    
    private static String getPassword(String msg, String error) {
        String entrada;
        
        do {
            System.out.print(msg);
            entrada = s.nextLine();
            
            if (entrada.trim().isEmpty()) {
                System.out.println(error);
            }
        } while (entrada.trim().isEmpty());
        return entrada;
    }

    private static String mostrarPistas(int n, String p, String i) {
        StringBuilder sb = new StringBuilder();
        
        if (n == 3) {
            sb.append("La contrasena tiene ").append(p.length()).append(" caracteres.");
        } else if (n == 6) {
            sb.append("Los dos ultimos caracteres son: ")
                    .append(p.substring(p.length() - 2, p.length()));
        } else if (n > 6) {
            if (i.compareTo(p) > 0) {
                sb.append("La contrasena es menor alfabeticamente.");
            } else {
                sb.append("La contrasena es mayor alfabeticamente.");
            }
        }
        return sb.toString();
    }
}
