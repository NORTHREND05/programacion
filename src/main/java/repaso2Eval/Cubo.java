package repaso2Eval;

import com.github.javafaker.Faker;
import java.util.Scanner;

public class Cubo {
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int profundidad, filas, columnas, n;
        int[][][] cubo, cuboRotado;
        String[][][] cuboString, cuboDuplicado;
        
        profundidad = getNumero("Introduce una profundidad: ", "La profundidad debe ser mayor a 0.");
        
        filas = getNumero("Introduce las filas: ", "Debe haber al menos 1 fila.");
        
        columnas = getNumero("Introduce las columnas: ", "Debe haber al menos 1 columna.");
        
        cubo = rellenaCubo(profundidad, filas, columnas);
//        System.out.println(mostrarCubo(cubo));
        
        // n no requiere validacion si ponen un numero negativo simplemente debe devolver 0
//        System.out.print("Indica un numero para contar las veces que aparece en el cubo: ");
//        n = sc.nextInt();
//        
//        System.out.println(contarNumeroEnCubo(n, cubo));
        
//        modificarCubo(cubo);
//        System.out.println("Cubo modificado:\n" + mostrarCubo(cubo));
        
        cuboString = convertirCuboAString(cubo);
        System.out.println(sumaColumnasCortadas(cuboString));
        
        cuboDuplicado = duplicarCubo(cuboString);
        
        System.out.println("Cubo original:\n" + mostrarCubo(cubo));
        
        cuboRotado = rotarCubo(cubo);
        System.out.println("Cubo rotado 90 grados:\n" + mostrarCubo(cuboRotado));
        
        cuboRotado = rotarCubo(cuboRotado);
        System.out.println("Cubo rotado 90 grados:\n" + mostrarCubo(cuboRotado));
        
        cuboRotado = rotarCubo(cuboRotado);
        System.out.println("Cubo rotado 90 grados:\n" + mostrarCubo(cuboRotado));
        
        cuboRotado = rotarCubo(cuboRotado);
        System.out.println("Cubo rotado 90 grados:\n" + mostrarCubo(cuboRotado));
    }

    private static int[][][] rellenaCubo(int profundidad, int filas, int columnas) {
        Faker f = new Faker();
        int[][][] cubo = new int[profundidad][filas][columnas];
        
        // Bucle que recorre el cubo para asignarle valores
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    cubo[i][j][k] = f.number().numberBetween(5, 25);
                }
            }
        }
        
        return cubo;
    }

    private static String mostrarCubo(int[][][] cubo) {
        StringBuilder sb = new StringBuilder();
        
        // Bucle que recorre el cubo y lo concatena
        for (int i = 0; i < cubo.length; i++) {
            sb.append("Cortada ").append(i + 1).append("\n");
            
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    sb.append(cubo[i][j][k]).append(" ");
                }
                sb.append("\n");
            }
            sb.append("\n");
        }
        
        return sb.toString();
    }

    private static int getNumero(String msg, String error) {
        int n;
        
        do {
            System.out.print(msg);
            n = sc.nextInt();
            
            if (n <= 0) System.out.println(error);
        } while (n <= 0);
        
        return n;
    }

    // Método que dado un número indique cuantas veces se repite ese número en
    // el cubo y lo muestre por pantalla de forma "El numero X esta Y veces". 
    private static String contarNumeroEnCubo(int n, int[][][] cubo) {
        int cont = 0;
        
        // Recorre el cubo y aumenta el contador si el elemento es igual a n
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    if (cubo[i][j][k] == n) {
                        cont++;
                    }
                }
            }
        }
        
        return "El numero "+ n +" esta "+ cont +" veces";
    }
    
    // Método que modifica el cubo colocando -1 en cada fila alternando la columna.
    private static void modificarCubo(int[][][] cubo) {
        // Coloca -1 alternando la columna en cada fila
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    if (j % 2 == k % 2) {
                        cubo[i][j][k] = -1;
                    }
                }
            }
        }
    }
    
    // Método que recibe el cubo de números y los convierte en un cubo de String,
    // dejando los mismos valores salvo: Sustituye en la cortada 0 los números
    // pares por “*”. En la cortada 1 los números mayores de 10 por “$”. En la
    // cortada 2 los números múltiplos de 3 por “&”. 
    private static String[][][] convertirCuboAString(int[][][] cubo) {
        String[][][] cubotoString = new String[cubo.length][cubo[0].length][cubo[0][0].length];
        
        // Coloca un caracter segun las condiciones o deja el valor que ya tenia en String
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    switch (i) {
                        case 0:
                            if (cubo[i][j][k] % 2 == 0) {
                                cubotoString[i][j][k] = "*";
                            } else {
                                cubotoString[i][j][k] = Integer.toString(cubo[i][j][k]);
                            }
                            break;
                        case 1:
                            if (cubo[i][j][k] > 10) {
                                cubotoString[i][j][k] = "$";
                            } else {
                                cubotoString[i][j][k] = Integer.toString(cubo[i][j][k]);
                            }
                            break;
                        case 2:
                            if (cubo[i][j][k] % 3 == 0) {
                                cubotoString[i][j][k] = "&";
                            } else {
                                cubotoString[i][j][k] = Integer.toString(cubo[i][j][k]);
                            }
                            break;
                        default:
                            cubotoString[i][j][k] = Integer.toString(cubo[i][j][k]);
                    }
                }
            }
        }
        
        return cubotoString;
    }
    
    // Método que muestra la suma de las columna cortada a cortada, salvo que
    // tengan caracteres.
    private static String sumaColumnasCortadas(String[][][] cuboString) {
        StringBuilder sb = new StringBuilder();
        int suma;
        
        // Concatena la suma de las columnas cortada a cortada
        for (int i = 0; i < cuboString.length; i++) {
            sb.append("Cortada ").append(i).append(":\n");
            for (int k = 0; k < cuboString[i][0].length; k++) {
                suma = 0;
                for (int j = 0; j < cuboString[i].length; j++) {
                    if (!cuboString[i][j][k].equals("*")
                            && !cuboString[i][j][k].equals("$")
                            && !cuboString[i][j][k].equals("&")) {

                        suma += Integer.parseInt(cuboString[i][j][k]);
                    }
                }
                sb.append("Columna ").append(k).append(": ").append(suma).append("\n");
            }
            sb.append("\n");
        }
        
        return sb.toString();
    }
    
    // Método que introduce el cubo en un cubo el doble de grande y el resto de
    // los valores los rellenamos con “?”. 
    private static String[][][] duplicarCubo(String[][][] cubo) {
        String[][][] cuboDuplicado = new String[cubo.length * 2][cubo[0].length * 2][cubo[0][0].length * 2];
        
        // Primero rellenamos el cubo con valores por defecto en ?
        for (int i = 0; i < cuboDuplicado.length; i++) {
            for (int j = 0; j < cuboDuplicado[i].length; j++) {
                for (int k = 0; k < cuboDuplicado[i][j].length; k++) {
                    cuboDuplicado[i][j][k] = "?";
                }
            }
        }
        
        // Ahora cambiamos los valores por defecto por los valores del cubo original
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    cuboDuplicado[i][j][k] = cubo[i][j][k];
                }
            }
        }
        
        return cuboDuplicado;
    }
    
    // Método que rota el cubo 90 grados sobre uno de sus ejes (X, Y o Z). La
    // función deberá devolver un nuevo cubo rotado. Después mostraremos el cubo
    // original y el transformado cortada a cortada. 
    private static int[][][] rotarCubo(int[][][] cubo) {
        int[][][] cuboRotado = new int[cubo.length][cubo[0].length][cubo[0][0].length];
        
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    /*
                        REPASAR ESTO
                    */
                    // giro 90 grados en sentido horario
                    cuboRotado[i][j][k] = cubo[i][cubo[i].length - 1 - k][j];
                    // giro 90 grados sentido antihorario
//                    cuboRotado[i][j][k] = cubo[i][k][cubo[i].length - 1 - j];
                    // giro 180 grados
//                    cuboRotado[i][j][k] = cubo[i][cubo[i].length - 1 - j][cubo[i][j].length - 1 - k];
                }
            }
        }
        
        return cuboRotado;
    }
}
