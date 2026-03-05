package tema8;

import java.util.*;

public class Ejercicio14 {
    public static void main(String[] args) {
        LinkedHashMap<String, ArrayList<Object>> cesta;
        LinkedHashMap<Integer, Double> tiposIVA;
        
        tiposIVA = crearTiposIVA();
        cesta = leerCesta();
        mostrarTicket(cesta, tiposIVA);
    }
    
    // Crea el mapa de los ivas
    public static LinkedHashMap<Integer, Double> crearTiposIVA() {
        LinkedHashMap<Integer, Double> iva = new LinkedHashMap<>();
        
        iva.put(1, 0.04); // Superreducido
        iva.put(2, 0.10); // Reducido
        iva.put(3, 0.21); // General

        return iva;
    }

    // Leer los articulos y precios de la cesta
    public static LinkedHashMap<String, ArrayList<Object>> leerCesta() {
        LinkedHashMap<String, ArrayList<Object>> cesta = new LinkedHashMap<>();
        ArrayList<Object> datos;
        Scanner sc = new Scanner(System.in);
        String articulo;
        int cantidad;
        double precio;
        int tipoIVA;
        
        // Introducir articulos, cantidad y precio a cesta mientras articulo no sea 0
        do {
            System.out.print("Introduce articulo(0 para terminar): ");
            articulo = sc.nextLine();

            if (!articulo.equals("0")) {
                System.out.print("Cantidad: ");
                cantidad = sc.nextInt();
                System.out.print("Precio unitario: ");
                precio = sc.nextDouble();
                
                System.out.print("Tipo IVA (1=4%, 2=10%, 3=21%): ");
                tipoIVA = sc.nextInt();
                sc.nextLine();
                
                datos = new ArrayList<>();
                datos.add(cantidad);
                datos.add(precio);
                datos.add(tipoIVA);
                cesta.put(articulo, datos);
            }

        } while (!articulo.equals("0"));
        
        return cesta;
    }
    
    // Muestra el ticket de la compra
    public static void mostrarTicket(LinkedHashMap<String, ArrayList<Object>> cesta, LinkedHashMap<Integer, Double> tiposIVA) {
        ArrayList<Object> datos;
        int cantidad, tipoIVA;
        double precio, subtotal, total;
        double baseSuper = 0, baseReducido = 0, baseGeneral = 0;
        double ivaSuper, ivaReducido, ivaGeneral;
        double porcentaje;
        
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
            tipoIVA = (Integer) datos.get(2);
            
            subtotal = cantidad * precio;

            System.out.printf(
                "%-15s %10d %9.2f € %10.2f €%n",
                articulo, cantidad, precio, subtotal
            );
            
            // Agarra los porcentajes segun tipo de iva y se lo suma al subtotal
            porcentaje = tiposIVA.getOrDefault(tipoIVA, 0.21);
            if (porcentaje == 0.04) {
                baseSuper += subtotal;
            } else if (porcentaje == 0.10) {
                baseReducido += subtotal;
            } else {
                baseGeneral += subtotal;
            }
        }
        
        // Los valores que tengan se sumaran al total
        ivaSuper = baseSuper * 0.04;
        ivaReducido = baseReducido * 0.10;
        ivaGeneral = baseGeneral * 0.21;
        total = baseSuper + baseReducido + baseGeneral + ivaSuper + ivaReducido + ivaGeneral;

        System.out.println("\n-------------------------------");
        System.out.printf("IVA Super Reducido (4%%) %8.2f €%n", ivaSuper);
        System.out.printf("IVA Reducido (10%%)      %8.2f €%n", ivaReducido);
        System.out.printf("IVA General (21%%)       %8.2f €%n", ivaGeneral);
        System.out.println("-------------------------------");
        System.out.printf("Total Compra            %8.2f €%n", total);
    }
}
