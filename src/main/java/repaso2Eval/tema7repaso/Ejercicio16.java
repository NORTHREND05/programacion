package repaso2Eval.tema7repaso;

import java.util.Scanner;

public class Ejercicio16 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] notas = new int[3][5];
        String notasAlu;
        int tri = 0, alu;
        
        do {
            notasAlu = pedirNotas(
                "Introduce la nota de los 5 alumnos (separado por espacios) del trimestre "+ (tri+1) +": "
            );
            rellenarNotas(notas, notasAlu, tri);
            System.out.println("Media trimestre "+(tri+1)+": " + mediaTrimestre(notas, tri));
            tri++;
        } while (tri < notas.length);
        
        alu = getAlu(
            "Introduce el numero del alumno que quieras saber la nota media: ",
            "El numero debe estar entre 1 y " + notas[0].length,
            notas[0].length
        );
        System.out.println("Media alumno "+ (alu + 1) +": "+ mediaAlumno(notas, alu));
        System.out.println(mostrarMatriz(notas));
    }

    private static String pedirNotas(String msg) {
        String entrada;
        
        System.out.print(msg);
        entrada = s.nextLine();
        return entrada;
    }

    private static void rellenarNotas(int[][] notas, String notasAlu, int tri) {
        String[] n = notasAlu.split(" ");

        for (int j = 0; j < notas[tri].length; j++) {
            notas[tri][j] = Integer.parseInt(n[j]);
        }
    }

    private static float mediaTrimestre(int[][] notas, int tri) {
        int sumaNotas = 0;
        
        for (int j = 0; j < notas[tri].length; j++) {
            sumaNotas += notas[tri][j];
        }
        return (float) sumaNotas / notas[tri].length;
    }

    private static float mediaAlumno(int[][] notas, int alu) {
        int suma = 0;
        
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i][alu];
        }
        return (float) suma / notas.length;
    }

    private static int getAlu(String msg, String error, int tam) {
        int n;
        
        do {            
            System.out.print(msg);
            n = s.nextInt();
            // adaptamos el numero a lo que introduce el usuario
            n = n - 1;
            if (n < 0 || n >= tam) {
                System.out.println(error);
            }
        } while (n < 0 || n >= tam);
        return n;
    }

    private static String mostrarMatriz(int[][] notas) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                sb.append(notas[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
