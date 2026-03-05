package tema7;

import com.github.javafaker.Faker;

public class Ejercicio10 {

    public static void rellenaCuboFaker(String[][][] cuboFaker) {
        Faker fa = new Faker();

        // Rellenar con informacion el cubo segun el caso de profundidad
        for (int p = 0; p < cuboFaker.length; p++) {
            for (int f = 0; f < cuboFaker[p].length; f++) {
                for (int c = 0; c < cuboFaker[p][f].length; c++) {
                    switch (p) {
                        case 0:
                            cuboFaker[p][f][c] = fa.internet().emailAddress();
                            break;
                        case 1:
                            cuboFaker[p][f][c] = fa.address().cityName();
                            break;
                        default:
                            cuboFaker[p][f][c] = fa.dragonBall().character();
                            break;
                    }
                }
            }
        }
    }

    public static String muestraCuboFaker(String[][][] cuboFaker) {
        StringBuilder sb = new StringBuilder();

        // Concatenar el cubo y mostrar segun profundidad
        for (int p = 0; p < cuboFaker.length; p++) {
            switch (p) {
                case 0:
                    sb.append("Cortada de Correos:\n");
                    break;
                case 1:
                    sb.append("\nCortada de Ciudades:\n");
                    break;
                default:
                    sb.append("\nCortada de Personajes:\n");
                    break;
            }

            for (int f = 0; f < cuboFaker[p].length; f++) {
                for (int c = 0; c < cuboFaker[p][f].length; c++) {
                    sb.append(cuboFaker[p][f][c]).append("\t");
                }
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[][][] cuboFaker = new String[3][4][2];

        rellenaCuboFaker(cuboFaker);

        System.out.println(muestraCuboFaker(cuboFaker));

    }
}
