package tema7;

import static mislibrerias.EntradaDatos.*;

public class Ejercicio16 {
    public static void main(String[] args) {
        int[][][] escuela;
        int grupos, pos;
                
        grupos = getPositiveNumber(
            "Cuantos grupos hay? ",
            "Error... tiene que haber al menos un grupo."
        );
        
        // [grupo][trimestre][alumno]
        escuela = new int[grupos][3][5];
        
        leerNotas(escuela);
        System.out.println(mostrarMediaGrupoTrimestre(escuela));
        
        do {            
            pos = getNumero("Introduce la posicion de un alumno (0 a 4): ");
            if(pos < 0 || pos > 4) {
                System.out.println("Posicion no valida.");
            }
        } while (pos < 0 || pos > 4);
        
        System.out.println(mostrarMediaAlumno(escuela, pos));
    }
    
    // Leer las notas POR TRIMESTRE (5 a la vez)
    public static void leerNotas(int[][][] escuela) {
        String entrada;
        String notas[];
        
        // lee notas de cada trimesrte por grupo
        for (int i = 0; i < escuela.length; i++) {
            System.out.println("Grupo " + (i+1));
            
            for (int j = 0; j < escuela[i].length; j++) {
                // seguir pidiendo mientras no haya 5 notas de alumnos 
                do {               
                    entrada = getString(
                        "Introduce las notas del trimestre "+ (j+1) +"(separadas por espacio): "
                    );
                    notas = entrada.split(" ");
                    
                    if(notas.length != 5) {
                        System.out.println("Tienes que introducir 5 notas.");
                    }
                } while (notas.length != 5);
                
                // asigna las notas al alumno correspondiente
                for (int k = 0; k < escuela[i][j].length; k++) {
                    escuela[i][j][k] = Integer.parseInt(notas[k]);
                }
            }
        }
    }

    // Muestra media trimestral por grupo
    public static String mostrarMediaGrupoTrimestre(int[][][] escuela) {
        StringBuilder sb = new StringBuilder();
        float suma, media;
        
        // concatena la media calculada de cada trimestre
        for (int i = 0; i < escuela.length; i++) {
            sb.append("Media trimestral grupo ").append(i + 1).append(":\n");
            
            for (int j = 0; j < escuela[i].length; j++) {
                suma = 0;
                
                for (int k = 0; k < escuela[i][j].length; k++) {
                    suma += escuela[i][j][k];
                }
                
                media = suma / escuela[i][j].length;
                sb.append("Media trimestre ").append(j + 1).append(": ")
                  .append(media).append("\n");
            }
        }
        
        return sb.toString();
    }
    
    // Muestra media general de un alumno
    public static String mostrarMediaAlumno(int[][][] escuela, int pos) {
        StringBuilder sb = new StringBuilder();
        float suma, media;
        
        // concatena la media calculada del alumno
        for (int i = 0; i < escuela.length; i++) {
            suma = 0;
            
            // acumula el valor de las notas para calcular la media
            for (int j = 0; j < escuela[i].length; j++) {
                suma += escuela[i][j][pos];
            }
            
            media = suma / escuela[i].length;
            sb.append("Grupo ").append(i + 1).append(" Alumno ").append(pos)
               .append("\nNota media: ").append(media).append("\n");
        }
        
        return sb.toString();
    }

}
