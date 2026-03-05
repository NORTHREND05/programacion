package tema6;

import java.util.*;
import java.util.regex.*;

public class CompExpRegulares {
    public static void main(String[] args) {
        Scanner vScann = new Scanner(System.in);
        String vRegex, vCase;
       
        List<String> vLista = new ArrayList<>();

        while (true){
            System.out.println("Dime una expresión regular o q para salir: ");
            vRegex = vScann.nextLine();

            if (vRegex.compareTo("q") == 0) break;

            while (true) {
                Pattern vPattern = Pattern.compile(vRegex);

                System.out.println("Dime los ejemplos o presiona X para resolver: ");
                vCase = vScann.nextLine();

                if (vCase.compareTo("X") == 0) {
                    for (String s : vLista) {
                        Matcher vMatcher = vPattern.matcher(s);
                        System.out.println(s + " -> " + vMatcher.matches());
                    }
                    break;
                } else vLista.add(vCase);
            }

            System.out.println("¿Desea limpiar la lista de ejemplos? \n [S] | [N]");
            vCase = vScann.nextLine();
            if (vCase.compareTo("S") == 0) vLista.clear();
            
        }
        vScann.close();
    }
}