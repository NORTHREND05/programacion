package tema2;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Aquí declaramos las variables
        Scanner t = new Scanner(System.in);
        int radio;
        double perimetro, area;
        
        // Aquí se pide el radio
        System.out.print("Introduce el radio de la circunferencia: ");
        radio = t.nextInt();
        
        System.out.println("Estamos haciendo los calculos...\n");
        // Aquí hacemos los calculos necesarios
        perimetro = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);
        
        // Aquí se muestran los resultados
        System.out.println("Perimetro de la circunferencia: " + perimetro + "\n");
        System.out.println("Area de la circunferencia: " + area);
    }
    
}
