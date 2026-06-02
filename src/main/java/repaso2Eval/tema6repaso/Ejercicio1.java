package repaso2Eval.tema6repaso;

public class Ejercicio1 {
    public static void main(String[] args) {
        int n = 500;
        
        System.out.println(mostrarTablaUnicode(n));
    }

    private static String mostrarTablaUnicode(int n) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            sb.append(i +": "+ (char) i +"\n");
        }
        
        return sb.toString();
    }
}
