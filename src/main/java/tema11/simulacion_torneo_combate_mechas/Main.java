package tema11.simulacion_torneo_combate_mechas;

import com.github.javafaker.Faker;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Faker f = new Faker();
        PilotoNovato pn;
        PilotoProfesional pp;
        Mecha m1,m2;
        Combate c1, c2;
        Arena a;
        
        try {
            m1 = new Mecha(1000, "Pepe", f.rockBand().name());
            m1.setBlindaje(150);
            m1.setPotencia(500);
            m1.setPrecio(5000);
            
            m2 = new Mecha(1001, "Paco", f.rockBand().name());
            m2.setBlindaje(150);
            m2.setPotencia(400);
            m2.setPrecio(5000);
            
            pn = new PilotoNovato(1000, f.name().firstName(), f.internet().emailAddress());
            pn.addMecha(m1);
            
            pp = new PilotoProfesional(1001, f.name().firstName(), f.internet().emailAddress());
            pp.addMecha(m2);
            pp.setFechaAlta(LocalDate.now());
            pp.setPorcentajeDescuento(15);
            
            a = new Arena("Allianz Arena", "Munich", m1);
            a.addMecha(m2);
            
            c1 = new Combate(1000, m1, m2);
            c2 = new Combate(1001, m2, m1);
            a.registrarCombate(c1);
            a.registrarCombate(c2);
            
            System.out.println(c1);
            System.out.println(c2);
            
            System.out.println("Ganador combate 1: " + c1.getGanador());
            System.out.println("Ganador combate 2: " + c2.getGanador());
            System.out.println("MECHA MAS POTENTE:\n" + a.getMechaMasPotente());
            System.out.println("Combates ganados por " + m1.getNombre() + ":\n" + a.getCombatesGanadosPorMecha(m1.getNombre()));
            System.out.println(a.getCatalogoMechas());
            // Provocar excepcion
            m1.addArma("arma1");
            m1.addArma("arma2");
            m1.addArma("arma3");
            m1.addArma("arma4");
            m1.addArma("arma5");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
