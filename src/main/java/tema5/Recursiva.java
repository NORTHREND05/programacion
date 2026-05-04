package tema5;

public class Recursiva {
    public static void main(String[] args) {
        secuenciaRecursiva(1, 10);
    }

    public static void secuenciaRecursiva(int cont1, int cont2) {
        if (cont2 == 100) {
            
        } else {
            System.out.print(cont1 + " " + cont2 + " ");
            secuenciaRecursiva(cont1 + 2, cont2 + 10);
        }
    }
}
