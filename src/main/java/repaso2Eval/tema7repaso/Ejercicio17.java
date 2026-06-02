package repaso2Eval.tema7repaso;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Ejercicio17 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String url = getURL(
                "Introduce una URL: ",
                "La URL no puede estar vacia."
        );

        // Texto limpio de la web
        String[] palabras = leerUrlTextoLimpio(url);

        // StopWords desde fichero
        String[] stopWords = leerStopWords("/stop_words_spanish.txt");

        mostrarTop10(palabras, stopWords);
    }

    private static String getURL(String msg, String error) {
        String entrada;

        do {
            System.out.print(msg);
            entrada = s.nextLine();

            if (entrada.trim().isEmpty()) {
                System.out.println(error);
            }

        } while (entrada.trim().isEmpty());

        return entrada;
    }

    // Leer stopwords del fichero
    private static String[] leerStopWords(String ruta) {

        Scanner sc = null;
        int contador = 0;

        try {

            sc = new Scanner(new File(ruta));

            // Contar lineas
            while (sc.hasNextLine()) {
                sc.nextLine();
                contador++;
            }

            sc.close();

            String[] stopWords = new String[contador];

            sc = new Scanner(new File(ruta));

            // Guardar palabras
            for (int i = 0; i < stopWords.length; i++) {
                stopWords[i] =
                        sc.nextLine()
                                .trim()
                                .toLowerCase();
            }

            sc.close();

            return stopWords;

        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el fichero.");
            return new String[0];
        }
    }

    // Mostrar top 10
    private static void mostrarTop10(String[] palabras,
                                     String[] stopWords) {

        String[] palabrasUnicas =
                new String[palabras.length];

        int[] frecuencias =
                new int[palabras.length];

        int unicos = 0;

        // Contar palabras
        for (int i = 0; i < palabras.length; i++) {

            String palabra =
                    palabras[i]
                            .toLowerCase()
                            .replaceAll("[^a-záéíóúñ]", "");

            // Ignorar vacias o stopwords
            if (palabra.isEmpty()
                    || esStopWord(stopWords, palabra)) {
                continue;
            }

            int indice =
                    buscarPalabra(
                            palabrasUnicas,
                            palabra,
                            unicos
                    );

            // Si existe suma frecuencia
            if (indice != -1) {
                frecuencias[indice]++;
            } else {

                // Nueva palabra
                palabrasUnicas[unicos] = palabra;
                frecuencias[unicos] = 1;
                unicos++;
            }
        }

        System.out.println("\nTOP 10 PALABRAS:");

        // Mostrar top 10
        for (int i = 0; i < 10
                && i < unicos; i++) {

            int mayor = 0;

            for (int j = 1;
                    j < unicos;
                    j++) {

                if (frecuencias[j]
                        > frecuencias[mayor]) {

                    mayor = j;
                }
            }

            System.out.println(
                    palabrasUnicas[mayor]
                            + " -> "
                            + frecuencias[mayor]
            );

            // Marcar como usada
            frecuencias[mayor] = -1;
        }
    }

    // Comprueba si es stopword
    private static boolean esStopWord(
            String[] stopWords,
            String palabra) {

        for (String stopWord : stopWords) {

            if (stopWord.equals(palabra)) {
                return true;
            }
        }

        return false;
    }

    // Buscar palabra repetida
    private static int buscarPalabra(
            String[] palabras,
            String palabra,
            int limite) {

        for (int i = 0; i < limite; i++) {

            if (palabras[i].equals(palabra)) {
                return i;
            }
        }

        return -1;
    }

    // METODO DEL PROFESOR
    public static String[] leerUrlTextoLimpio(String url) {

        try {

            Document doc =
                    Jsoup.connect(url)
                            .ignoreContentType(true)
                            .get();

            doc.select(
                    "script, style, noscript"
            ).remove();

            String textoLimpio = doc.text();

            return textoLimpio.split("\\s+");

        } catch (Exception e) {
            e.printStackTrace();
            return new String[0];
        }
    }
}