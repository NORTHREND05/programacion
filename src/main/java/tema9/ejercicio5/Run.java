package tema9.ejercicio5;

import com.github.javafaker.Faker;

public class Run {
    public static void main(String[] args) {
        Oficina o = new Oficina();
        
        rellenarOficina(o, 100);
    }

    private static void rellenarOficina(Oficina o, int cantidad) {
        Ordenador ordenador;
        Faker f = new Faker();
        
        for (int i = 0; i < cantidad; i++) {
            ordenador = new Ordenador(f.idNumber().valid(), (byte) (Math.random() * 127));
        }
    }
}
