package tema9.ejercicio4;

public class Run {
    public static void main(String[] args) {
        Garaje g = new Garaje();
        Motor m1 = new Motor(120), m2 = new Motor(140);
        Coche c1 = new Coche("Toyota", "RAV4");
        Coche c2 = new Coche("Volkswagen", "Golf");
        
        c1.setMotor(m1);
        c2.setMotor(m2);
        
        g.aceptarCoche(c1, "Aceite");
        System.out.println(g);
        
        g.devolverCoche();
        System.out.println(c1);
        
        g.aceptarCoche(c1, "Luces");
        System.out.println(g);
        
        g.devolverCoche();
        System.out.println(c1);
//        
//        g.aceptarCoche(c2, "Frenos");
//        g.devolverCoche();
//        
//        g.aceptarCoche(c2, "Aceite");
//        g.devolverCoche();
        
        // los coches despues de ser atendidos
        System.out.println(c1);
//        System.out.println(c2);
    }
}
