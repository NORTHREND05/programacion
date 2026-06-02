package repaso2Eval.tema7repaso;

public class Ejercicio7 {
    public static void main(String[] args) {
        int[] secuencia = new int[20];
        int valorActual = 3, baseImpar = 3, cont = 1;

        for (int i = 0; i < secuencia.length; i++) {
            secuencia[i] = valorActual;
            switch (cont) {
                case 1:
                    valorActual *= 2;
                    cont++;
                    break;
                case 2:
                    valorActual += 1;
                    cont++;
                    break;
                default:
                    baseImpar += 2;
                    valorActual = baseImpar;
                    cont = 1;
                    break;
            }
        }
        System.out.println(mostrarSecuencia(secuencia));
    }

    private static String mostrarSecuencia(int[] secuencia) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < secuencia.length; i++) {
            sb.append(secuencia[i]).append(" ");
        }
        
        return sb.toString();
    }
}
