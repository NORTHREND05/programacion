package repaso2Eval.tema7repaso;

import com.github.javafaker.Faker;
import java.util.Scanner;

public class Ejercicio3 {
    static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        int fila, columna, tam = 5, dificultad;
        char[][] tablero = new char[tam][tam];
        char[][] tablero2 = new char[tam][tam];
        char intento;
        boolean tieneLlave = false;
        
        System.out.println("Bienvenido al juego de Buscaminas.");
        System.out.println("Consiste en pisar una fila y columna en un campo rellenado en base a la dificultad.");
        System.out.println("Si caes en una mina pierdes y si caes en una salida ganas.");
        
        System.out.println("Antes de empezar elige la dificultad(1|2|3):");
        System.out.println("1. Facil (5 minas, 5 salidas y 3 llaves)");
        System.out.println("2. Medio (5 minas, 3 salidas y 2 llaves)");
        System.out.println("3. Dificil (10 minas, 3 salidas y 1 llave)");
        dificultad = getDificultad("Introduce la dificultad: ", "Debes poner 1, 2 o 3.");
        
        rellenarTablero(tablero, dificultad);
        do {
            fila = getFilaOColumna("Introduce la fila: ", "La fila debe ser entre 1 y " + tam, tam);
            columna = getFilaOColumna("Introduce la columna: ", "La columna debe ser entre 1 y " + tam, tam);

            intento = tablero[fila][columna];

            if (intento != 'B') {
                if (tablero2[fila][columna] == 'X') {
                    System.out.println("Ya habias pisado esta casilla. Vuelve a intentarlo");
                } else {
                    if (intento == 'E' && tieneLlave) {
                        intento = 'O';
                    } else {
                        if (intento == 'K') {
                            tieneLlave = true;
                            System.out.println("Ya tienes la llave ya puedes abrir la salida.");
                            System.out.println(mostrarTablero(tablero2, fila, columna));
                        } else if (intento == 'E') {
                            System.out.println("Has encontrado una puerta, ahora debes encontrar la llave para huir.");
                            System.out.println(mostrarTablero(tablero2, fila, columna));
                        } else {
                            System.out.println("Has pisado una zona segura. Vuelve a intentarlo.");
                            System.out.println(mostrarTablero(tablero2, fila, columna));
                        }
                    }
                }
            }
        } while (intento != 'B' && intento != 'O');
        
        if (intento == 'B') {
            System.out.println("HAS PISADO UNA MINA\nGAME OVER");
        } else {
            System.out.println("HAS ESCAPADO\nHAS GANADO");
        }
    }

    private static void rellenarTablero(char[][] tablero, int dificultad) {
        int bombas = 5, salidas = 5, llaves = 3;
        
        // Rellenamos el tablero con valores por defecto
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '-';
            }
        }
        
        switch (dificultad) {
            case 1:
                bombas = 5;
                salidas = 5;
                llaves = 3;
                break;
            case 2:
                bombas = 5;
                salidas = 3;
                llaves = 2;
                break;
            case 3:
                bombas = 10;
                salidas = 3;
                llaves = 1;
                break;
        }
        rellenarElementos(tablero, bombas, 'B');
        rellenarElementos(tablero, salidas, 'E');
        rellenarElementos(tablero, llaves, 'K');
    }

    private static void rellenarElementos(char[][] tablero, int cant, char e) {
        Faker f = new Faker();
        int fila, columna, n = 0;
        
        // Rellenamos el tablero con los elementos
        do {
            fila = f.number().numberBetween(0, tablero.length);
            columna = f.number().numberBetween(0, tablero[fila].length);
            if (tablero[fila][columna] == '-') {
                tablero[fila][columna] = e;
                n++;
            }
        } while (n < cant);
    }

    private static int getFilaOColumna(String msg, String error, int tam) {
        int n;
        
        do {
            System.out.print(msg);
            n = s.nextInt();
            // Hacemos la conversion para el array, es decir menos uno
            n--;
            if (n < 0 || n >= tam) {
                System.out.println(error);
            }
        } while (n < 0 || n >= tam);
        return n;
    }

    private static String mostrarTablero(char[][] tablero, int fila, int col) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (i == fila && j == col) {
                    tablero[i][j] = 'X';
                    sb.append(tablero[i][j]).append(" ");
                } else if (tablero[i][j] == 'X') {
                    sb.append(tablero[i][j]).append(" ");
                }else{
                    sb.append("-").append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private static int getDificultad(String msg, String error) {
        int n;
        
        do {
            System.out.print(msg);
            n = s.nextInt();
            if (n < 1 || n > 3) {
                System.out.println(error);
            }
        } while (n < 1 || n > 3);
        return n;
    }
}
