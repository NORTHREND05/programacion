package tema4;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        byte facturaMas600=0;
        int codigo, litrosVendidos, litrosVendidosF1=0;
        double precioLitro, facturacion, facturacionT = 0.0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce el codigo numerico del articulo: ");
            codigo = t.nextInt();
            System.out.print("Introduce la cantidad de litros vendida: ");
            litrosVendidos = t.nextInt();
            System.out.print("Introduce el precio por litro: ");
            precioLitro = t.nextDouble();
            
            if(i==1) {
                litrosVendidosF1 = litrosVendidos;
            }
            facturacion = litrosVendidos * precioLitro;
            facturacionT += facturacion;
            if(facturacion > 600) {
                facturaMas600++;
            }
            System.out.println("\n--- Factura "+i+" ---");
            System.out.println("Codigo del articulo: "+codigo);
            System.out.println("Cantidad vendida en litros: "+litrosVendidos);
            System.out.println("Precio por litro: "+precioLitro);
            System.out.println();
        }
        System.out.println("\nAqui tienes la facturacion total: "+facturacionT);
        System.out.println("Cantidad vendida en litros de la factura 1: "+litrosVendidosF1);
        System.out.println("Facturas emitidas en mas de 600 euros: "+facturaMas600);
    }
}
