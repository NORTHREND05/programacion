package tema7;

import java.util.Scanner;
import java.util.regex.Pattern;
import static mislibrerias.EntradaDatos.*;

public class Ejercicio3 {
    static Scanner t = new Scanner(System.in);
    
    //Función que devuelve un String con la explicación del juego
    public static String getExplicacionJuego() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ahora debes decir una fila y una columna.\n");
        sb.append("Si coincide con la posicion de la salida y tienes la llave, ganaras.\n");
        sb.append("Si no es asi, deberas buscar la llave para salir.\n");
        sb.append("Si coincide con la posicion de una bomba, perderas.\n");
        sb.append("Y las casillas marcadas con X ya han sido disparadas.\n");
        sb.append("Comencemos!!!\n");
        return sb.toString();
    }
    
    // Función que pide la dificultad al usuario y devuelve las minas y salidas
    // correspondientes a la dificultad
    public static byte[] getDificultad(String msg, String error) {
        String dificultadRegexp = "(?i)(facil|medio|dificil)";
        String dificultad;
        byte[] minasYSalidas = new byte[2];
        
        // Pedir dificultad mientras no coincida con la expresión regular
        do {
            System.out.print(msg);
            dificultad = t.nextLine();
            if(!Pattern.matches(dificultadRegexp, dificultad)) {
                System.out.println(error);
            }
        } while (!Pattern.matches(dificultadRegexp, dificultad));
        
        asignaDificultad(minasYSalidas, dificultad);
        
        return minasYSalidas;
    }
    
    // Asignar minas y salidas según la dificultad introducida
    public static void asignaDificultad(byte[] minasYSalidas, String eleccion) {
        if (eleccion.equalsIgnoreCase("facil")) {
            minasYSalidas[0] = 5;
            minasYSalidas[1] = 5;
        } else if (eleccion.equalsIgnoreCase("medio")) {
            minasYSalidas[0] = 5;
            minasYSalidas[1] = 3;
        } else {
            minasYSalidas[0] = 10;
            minasYSalidas[1] = 3;
        }
    }
    
    // Función que rellena el tablero con bombas, salidas y llaves
    public static char[][] rellenaTablero(byte bombas, byte salidas, byte llaves, byte tam) {
        char bomba = 'B', salida = 'E', llave = 'K';
        char[][] tRellenado = new char[tam][tam];
        
        // Bucle que rellena todo el tablero con un char por defecto '-'
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                tRellenado[i][j] = '-';
            }
        }
        
        colocarElemento(tRellenado, bombas, bomba, tam);
        colocarElemento(tRellenado, salidas, salida, tam);
        colocarElemento(tRellenado, llaves, llave, tam);
        
        return tRellenado;
    }
    
    // Función para colocar los objetos(minas, salidas y llaves)
    public static void colocarElemento(char[][] tablero, byte cantidad, char objeto, byte tam) {
        byte colocada = 0, fila, columna;
        
        // Bucle que coloca n elementos en f y c random si el espacio es vacío
        while (colocada < cantidad) {
            fila = (byte) (Math.random() * tam);
            columna = (byte) (Math.random() * tam);
            
            if (tablero[fila][columna] == '-') {
                tablero[fila][columna] = objeto;
                colocada++;
            }
        }
    }
    
    // Función que ejecuta el juego mientras no caiga en una mina o puerta(con llave)
    public static String empezarJuego(char[][] tablero, byte tam) {
        byte[] eleccion;
        byte fila, columna;
        String disparo;
        boolean tieneLlave = false;
        
        // Ejecutar el juego mientras no caiga en una bomba o escape
        do {
            eleccion = getFilaYColumna(
                "Fila y columna (ej: 3 4, entre 0 y "+(tam-1)+"): ",
                "Error. La fila y columna deben ser entre 0 y "+(tam - 1)+".",
                tam
            );
            fila = eleccion[0];
            columna = eleccion[1];
            
            disparo = disparo(tablero, fila, columna);
            
            // Mostrar tablero y feedback al usuario
            System.out.print(mostrarTablero(tablero, tam));
            
            if (disparo.equals("LLAVE")) {
                tieneLlave = true;
                System.out.println("Has encontrado la llave! Ahora debes buscar una salida.");
            }
            
            disparo = procesarDisparo(disparo, tieneLlave);
        } while (!disparo.equals("ESCAPE") && !disparo.equals("BOMBA"));
        
        return disparo;
    }
    
    // Función que devuelve una fila o columna dentro del rango establecido
    public static byte[] getFilaYColumna(String msg, String error, byte tam) {
        byte[] filaYColumna = new byte[2];
        
        // Repetir mientras alguno de los datos esté fuera de los limites
        do {
            System.out.print(msg);
            filaYColumna[0] = t.nextByte();
            filaYColumna[1] = t.nextByte();
            
            if(filaYColumna[0] < 0 || filaYColumna[0] >= tam || filaYColumna[1] < 0 || filaYColumna[1] >= tam) {
                System.out.println(error);
            }
        } while (filaYColumna[0] < 0 || filaYColumna[0] >= tam || filaYColumna[1] < 0 || filaYColumna[1] >= tam);
        
        return filaYColumna;
    }
    
    // Función que devuelve el resultado del disparo según el caso
    public static String disparo(char[][] tablero, byte fila, byte columna) {
        switch (tablero[fila][columna]) {
            case 'X':
                return "REPETIDO";
            case 'E':
                return "PUERTA";
            case 'B':
                return "BOMBA";
            case 'K':
                tablero[fila][columna] = 'X';
                return "LLAVE";
            default:
                tablero[fila][columna] = 'X';
                return "SEGURO";
        }
    }
    
    // Función que muestra el tablero
    public static String mostrarTablero(char[][] tablero, byte tam) {
        StringBuilder sb = new StringBuilder();
        
        // Muestra tablero con casillas normales o ya marcadas
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (tablero[i][j] == 'X') {
                    sb.append('X').append(' ');
                } else {
                    sb.append('-').append(' ');
                }
            }
            sb.append("\n");
        }
        
        return sb.toString();
    }
    
    // Función que procesa y devuelve un caso del disparo
    public static String procesarDisparo(String disparo, boolean tieneLlave) {
        switch (disparo) {
            case "REPETIDO":
                System.out.println("Ya marcaste esta casilla antes. Elige otra.");
                break;
            case "SEGURO":
                System.out.println("Casilla segura. Sigue intentandolo...");
                break;
            case "PUERTA":
                if (tieneLlave) {
                    return "ESCAPE";
                } else {
                    System.out.println("La puerta no puede abrirse. Busca una llave.");
                }   break;
            default:
                break;
        }
        return disparo;
    }
    
    // Función que devuelve un String con el resultado final
    public static String mostrarResultado(String disparo) {
        StringBuilder sb = new StringBuilder();
        
        // Si escapo mensaje de victoria sino derrota
        if (disparo.equals("ESCAPE")) {
            sb.append("Lograste escapar!!\nGanaste!!!");
        } else {
            sb.append("BOOOM!!!\nGAME OVER");
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        byte tam, minas, salidas, llaves;
        byte[] dificultad;
        char[][] tablero;
        String resultado;
        
        System.out.print(getExplicacionJuego());
        
        tam = (byte) getPositiveNumber("De que tamano quieres el tablero?: ", "Ese tamaño no es posible :(");
        
        dificultad = getDificultad(
            "Antes de empezar elige(escribiendo) la dificultad del juego(sin tildes):\nfacil (5 minas y 5 salidas)\nmedio (5 minas y 3 salidas)\ndificil (10 minas y 3 salidas): ",
            "No coindice con las opciones."
        );
        
        minas = dificultad[0];
        salidas = dificultad[1];
        llaves = 1;
        
        tablero = rellenaTablero(minas, salidas, llaves, tam);
        
        resultado = empezarJuego(tablero, tam);
        
        System.out.println(mostrarResultado(resultado));
    }
}
