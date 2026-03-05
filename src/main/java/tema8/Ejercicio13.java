package tema8;

import java.util.*;

public class Ejercicio13 {
    public static void main(String[] args) {
        LinkedHashMap<String, ArrayList<Object>> cesta;
    
        cesta = leerCesta();
        mostrarTicket(cesta);
    }

    // Leer los articulos y precios de la cesta
    public static LinkedHashMap<String, ArrayList<Object>> leerCesta() {
        LinkedHashMap<String, ArrayList<Object>> cesta = new LinkedHashMap<>();
        ArrayList<Object> datos;
        Scanner sc = new Scanner(System.in);
        String articulo;
        int cantidad;
        double precio;
        
        // Introducir articulos, cantidad y precio a cesta mientras articulo no sea 0
        do {
            System.out.print("Introduce articulo y precio (0 para terminar): ");
            articulo = sc.nextLine();

            if (!articulo.equals("0")) {
                System.out.print("Cantidad: ");
                cantidad = sc.nextInt();
                System.out.print("Precio unitario: ");
                precio = sc.nextDouble();
                sc.nextLine();
                
                datos = new ArrayList<>();
                datos.add(cantidad);
                datos.add(precio);
                cesta.put(articulo, datos);
            }

        } while (!articulo.equals("0"));
        
        return cesta;
    }
    
    // Muestra el ticket de la compra
    public static void mostrarTicket(LinkedHashMap<String, ArrayList<Object>> cesta) {
        ArrayList<Object> datos;
        int cantidad;
        double precio, subtotal, total = 0;
        
        System.out.println("\nTICKET DE COMPRA\n");
        System.out.printf(
            "%-15s %10s %10s %12s%n",
            "Artículo", "Cantidad", "Precio", "Subtotal"
        );
        
        // Concatenar los valores para mostrar el ticket
        for (String articulo : cesta.keySet()) {
            datos = cesta.get(articulo);
            cantidad = (Integer) datos.get(0);
            precio = (Double) datos.get(1);
            subtotal = cantidad * precio;

            System.out.printf(
                "%-15s %10d %9.2f € %10.2f €%n",
                articulo, cantidad, precio, subtotal
            );

            total += subtotal;
        }

        System.out.println("-----------------------------------------------");
        System.out.printf(
            "%-15s %32.2f €%n",
            "Total compra", total
        );
    }
}
