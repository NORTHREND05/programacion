package tema5;

import mislibrerias.EntradaDatos;

public class Ejercicio20 {
    public static String secuenciaNumeros(int n) {
        String aux="";
        byte contador=1;
        for (int i = 1; i <= n; i++) {
            aux+="Ficha: ";
            for (int j = 1; j <= contador; j++) {
                aux+= "|"+i+":"+j+"| ";
            }
            aux+="\n";
            contador++;
        }
        return aux;
    }
    public static void main(String[] args) {
        int n = EntradaDatos.getPositiveNumber("Introduce un numero entero positivo: ","Error. Ese no es entero positivo.");
        System.out.print(secuenciaNumeros(n));
    }
}
