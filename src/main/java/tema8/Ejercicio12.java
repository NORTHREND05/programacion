package tema8;

import java.util.*;

public class Ejercicio12 {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> cesta;
    
        cesta = leerCesta();
        mostrarTicket(cesta);
    }

    // Leer los articulos y precios de la cesta
    public static LinkedHashMap<String, Double> leerCesta() {
        LinkedHashMap<String, Double> cesta = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        String articulo;
        double precio;
        
        // Introducir articulos y precio a cesta mientras articulo no sea 0
        do {
            System.out.print("Introduce articulo y precio (0 para terminar): ");
            articulo = sc.next();

            if (!articulo.equals("0")) {
                precio = sc.nextDouble();
                cesta.put(articulo, precio);
            }

        } while (!articulo.equals("0"));
        
        return cesta;
    }
    
    // Muestra el ticket de la compra
    public static void mostrarTicket(Map<String, Double> cesta) {
        double total = calcularTotal(cesta);
        
        System.out.println("\nTICKET DE COMPRA\n");
        System.out.printf("%-15s %10s%n", "Artículo", "Precio");

        // Concatena los articulos y su precio
        for (String articulo : cesta.keySet()) {
            System.out.printf(
                "%-15s %10.2f €%n",
                articulo,
                cesta.get(articulo)
            );
        }

        System.out.println("---------------------------");
        System.out.printf("%-15s %10.2f €%n", "Total compra", total);
    }
    
    // Devuelve el precio total
    public static double calcularTotal(Map<String, Double> cesta) {
        double total = 0;
        
        // Acumular el valor de los precios
        for (double precio : cesta.values()) {
            total += precio;
        }

        return total;
    }
}
