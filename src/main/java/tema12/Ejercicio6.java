package tema12;

public class Ejercicio6 {
    public static void main(String[] args) {
        try {
            metodo1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void metodo1() throws Exception {
        metodo2();
    }
    
    public static void metodo2() throws Exception {
        metodo3();
    }
    
    public static void metodo3() throws Exception {
        throw new Exception("Ha ocurrido un error.");
    }
}
