package tema11.simulador_carrera_drones;

import com.github.javafaker.Faker;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Faker f = new Faker();
        Circuito c;
        PilotoProfesional pp;
        PilotoAficionado pa;
        Drone drone = new Drone(1, "Pro Class", f.music().genre());
        
        drone.setAutonomia(480);
        drone.setPrecio(5000);
        drone.setVelocidadMaxima(180);
        
        try {
            c = new Circuito("Pista de Silla", "Valencia", drone);
            pa = new PilotoAficionado(2, f.name().fullName(), f.internet().emailAddress());
            pp = new PilotoProfesional(3, f.name().fullName(), f.internet().emailAddress());
            pp.setPorcentajeDescuento(15);
            pp.setFechaAlta(LocalDate.now());
            
            System.out.println(c);
            System.out.println("Drone mas rapido:\n" + c.getDroneMasRapido());
            System.out.println("Precio piloto aficionado: " + pa.calcularPrecioFinal(c.getDroneMasRapido().getPrecio()));
            System.out.println("Precio piloto profesional: " + pp.calcularPrecioFinal(c.getDroneMasRapido().getPrecio()));
            System.out.println("Drones de categoria "+drone.getCategoria()+":\n"+ c.getDronesPorCategoria(drone.getCategoria()));
            System.out.println("Precio total de todos los drones: " + String.format("%.2f€", c.getPrecioTotalDrones()));
            System.out.println(c.getDrones());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
