package tema11.gestion_clinica_veterinaria;

import com.github.javafaker.Faker;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Faker f = new Faker();
        Clinica c;
        Mascota mascota = new Mascota(f.number().numberBetween(10000000, 99999999), f.cat().name(), f.animal().name());
        ClienteNormal cn;
        ClienteVIP cv;
        
        try {
            c = new Clinica("Clinica Pepe", f.address().cityName(), mascota);
            cn = new ClienteNormal(f.number().numberBetween(10000000, 99999999), f.name().fullName(), f.number().numberBetween(100000000, 999999999));
            cv = new ClienteVIP(f.number().numberBetween(10000000, 99999999), f.name().fullName(), f.number().numberBetween(100000000, 999999999));
            cv.setFechaRegistro(LocalDate.now());
            cv.setPorcentajeDescuento(15);
            
            System.out.println("Mascota mas mayor:\n" + c.getMascotaMasVieja());
            System.out.println("Precio cliente normal: " + cn.calcularPrecioFinal(500));
            System.out.println("Precio cliente VIP: " + cv.calcularPrecioFinal(500));
            System.out.println("Mascotas de especie "+mascota.getEspecie()+":\n" + c.getMascotasPorEspecie(mascota.getEspecie()));
            System.out.println("Peso total de todas las mascotas: " + String.format("%.2fkg", c.getPesoTotalMascotas()));
            System.out.println(c.getMascotas());
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
