package tema6;

public class Ejercicio5 {
    // Función que intercambia las vocales por chars como @, 3, 1, 0 y V
    public static String ofuscaPass(String password) {
        StringBuilder sb = new StringBuilder(password);
        
        // Bucle que recorre toda la contraseña e intercambia vocales por otro char según el caso
        for (int i = 0; i < sb.length(); i++) {
            switch (sb.charAt(i)) {
                case 'a': case 'A': case 'á': case 'Á':
                    sb.setCharAt(i, '@');
                    break;
                case 'e': case 'E': case 'é': case 'É':
                    sb.setCharAt(i, '3');
                    break;
                case 'i': case 'I': case 'í': case 'Í':
                    sb.setCharAt(i, '1');
                    break;
                case 'o': case 'O': case 'ó': case 'Ó':
                    sb.setCharAt(i, '0');
                    break;
                case 'u': case 'U': case 'ú': case 'Ú':
                    sb.setCharAt(i, 'V');
                    break;
            }
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        String password = "rhythm123";
        
        System.out.println(ofuscaPass(password));
    }
}
