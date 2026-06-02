package repaso2Eval.tema6repaso;

public class Ejercicio10 {
    public static void main(String[] args) {
        String entrada = "1 1 1 1 1 0 0 1 1 1 1 1";
        System.out.println(isMellado(entrada));
    }

    private static String isMellado(String entrada) {
        String dientes = sinEspacios(entrada);
        
        if (dientes.length() % 2 == 0) {
            for (int i = 0; i < dientes.length() / 2; i++) {
                if (dientes.charAt(i) != dientes.charAt(dientes.length() - 1 - i)) {
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
}
