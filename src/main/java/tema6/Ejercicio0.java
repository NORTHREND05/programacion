package tema6;

public class Ejercicio0 {
    // Muestra caracteres dentro de un rango
    public static String muestraCaracteres(int min, int max) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = min; i < max; i++) {
            sb.append(i).append(": ")
                        .append((char) i)
                        .append("\n");
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        System.out.print(muestraCaracteres(0, 500));
    }
}
