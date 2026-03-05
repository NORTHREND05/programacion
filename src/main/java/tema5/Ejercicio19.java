package tema5;

public class Ejercicio19 {
    public static String mostrarLetras(char l1, char l2) {
        String aux="";
        char cambio = l1;
        if(l1>l2) {
            l1=l2;
            l2=cambio;
        }
        for (char a = l1; a <= l2; a++) {
            aux += a + " ";
        }
        return aux;
    }
    public static void main(String[] args) {
        char l1 = 'z', l2 = 'i';
        System.out.println(mostrarLetras(l1, l2));
    }
}
