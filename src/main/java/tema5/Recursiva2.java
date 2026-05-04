package tema5;

public class Recursiva2 {
    public static void main(String[] args) {
        secuenciaRecursiva2("hola", 3);
    }

    private static void secuenciaRecursiva2(String s, int i) {
        if (i < 0) {
        
        } else {
            System.out.print(s.charAt(i));
            secuenciaRecursiva2(s, i - 1);
        }
    }
}
