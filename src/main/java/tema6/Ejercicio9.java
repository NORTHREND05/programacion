package tema6;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Expresiones regulares
        String holaRegexp = "^(Hola|hola)$",
               pepeRegexp = ".*pepe.*",
               tipocRegexp = "^[a-zA-Z]+(\\.[a-zA-Z]+){2}$",
               tipodRegexp = "^[a-zA-Z]+\\.[a-zA-Z]+\\.[a-zA-Z]{3}$",
               digitosRegexp = "^\\d{2}$",
               arrobaRegexp = ".*@.*",
               numEspacioRegexp = "^\\d{2} \\d{2} \\d{2}$",
               fechatipoRegexp = ".*\\d{2}/\\d{2}/\\d{4}.*",
               mailRegexp = "^[a-zA-Z0-9.-]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}$",
               telRegexp = "^\\d{3}-\\d{3}-\\d{4}$";
    }
}
