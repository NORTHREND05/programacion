package tema6;

public class Ejercicio10 {
    public static String tipoMellado(String entrada) {
        String dientes = sinEspacios(entrada);
        
        // Si los dientes son pares haz un bucle sino devuelve no equilibrado
        if(dientes.length() % 2 == 0) {
            // Bucle que compara los dientes de izquierda y derecha y devuelve un caso
            for (int i = 0; i < dientes.length() / 2; i++) {
                if(dientes.charAt(i) != dientes.charAt(dientes.length() - 1 -i)) {
                    return "NO EQUILIBRADO";
                }
            }
            return "MELLADO EQUILIBRADO";
        } else {
            return "NO EQUILIBRADO";
        }
    }
    
    public static String sinEspacios(String entrada) {
        StringBuilder sb = new StringBuilder();
        
        // Bucle que concatena en sb los elementos de entrada salvo espacios
        for (int i = 0; i < entrada.length(); i++) {
            if(entrada.charAt(i) != ' ') {
                sb.append(entrada.charAt(i));
            }
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        String dientes = "0 0 1 0 1 1 0 1 0 0";
        
        System.out.println(tipoMellado(dientes));
    }
}
