package repaso2Eval.tema7repaso;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 3, 2, 1};
        int[] sinRepetidos = sinRepetidos(original);
        
        System.out.println("Array original:\n" + mostrarArray(original));
        System.out.println("Array sin repetidos:\n" + mostrarArray(sinRepetidos));
    }

    private static int[] sinRepetidos(int[] t) {
        int unicos = contarUnicos(t);
        int[] sinrep = new int[unicos];
        int indice = 0;
        
        for (int i = 0; i < t.length; i++) {
            if (!existeAntes(t, i)) {
                sinrep[indice] = t[i];
                indice++;
            }
        }
        return sinrep;
    }

    private static int contarUnicos(int[] t) {
        int cont = 0;
        
        for (int i = 0; i < t.length; i++) {
            if(!existeAntes(t, i)) {
                cont++;
            }
        }
        return cont;
    }

    private static String mostrarArray(int[] v) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < v.length; i++) {
            sb.append(v[i]).append(" ");
        }
        return sb.toString();
    }

    private static boolean existeAntes(int[] t, int pos) {
        for (int i = 0; i < pos; i++) {
            if (t[i] == t[pos]) {
                return true;
            }
        }
        return false;
    }
}
