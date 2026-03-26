package tema9.ejercicio5;

import com.github.javafaker.Faker;

public class Run {
    // Lista de posibles cpus
    public static final String[] CPUS = {
        "Intel i3",
        "Intel i5",
        "Intel i7",
        "AMD Ryzen 5",
        "AMD Ryzen 7"
    };
    
    public static void main(String[] args) {
        Oficina oficina = new Oficina();
        
        // Añadimos la información restante a la oficina
        oficina.setNombre("Oficina Central Valencia");
        oficina.setUbicacion("Avenida de Aragón 25, Valencia");
        oficina.setResponsable("Laura Martínez Gómez");
        
        // Rellanamos la oficina con 100 ordenadores
        rellenarOficina(oficina, 3);
        
        // Mostrar oficina
        System.out.println(oficina);

        // Probar métodos
        System.out.println("Total almacenamiento: " + oficina.getTotalAlmacenamiento());

        System.out.println("Media almacenamiento: " + oficina.getMediaAlmacenamiento());

        System.out.println("Ordenador con menos RAM: " + oficina.getOrdenadorMenosRAM());

        System.out.println("Ordenadores con CPU Intel i5: " + oficina.getOrdenadoresMismaCPU("Intel i5"));

        System.out.println("Ordenadores con 8GB RAM: " + oficina.getOrdenadoresConMismaRAM((byte) 8));
    }

    private static void rellenarOficina(Oficina o, int cantidad) {
        Ordenador ordenador;
        Faker f = new Faker();
        
        for (int i = 0; i < cantidad; i++) {
            // Usamos el constructor para añadir el numero de serie y la ram (en GB)
            ordenador = new Ordenador(
                f.idNumber().valid(),
                (byte) f.number().numberBetween(4, 65)
            );
            
            // Añadimos la cpu y el almacenamiento (en GB)
            ordenador.setCpu(CPUS[f.number().numberBetween(0, 5)]);
            ordenador.setAlmacenamiento(f.number().numberBetween(128, 2001));
            
            // Añadimos el ordenador a la oficina
            o.addOrdenador(ordenador);
        }
    }
}
