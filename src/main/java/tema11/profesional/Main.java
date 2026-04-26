package tema11.profesional;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker f = new Faker();
        Empresa emp;
        Entrenador ent1, ent2;
        Equipo e1, e2;
        Fontanero fon = new Fontanero(f.number().numberBetween(10000000, 99999999), "Pepe", true);
        
        try {
            emp = new Empresa(f.idNumber().valid(), "Monsters S.A.", fon);
            ent1 = new Entrenador(f.number().numberBetween(10000000, 99999999), "Pep Guardiola", "Posesion");
            ent2 = new Entrenador(f.number().numberBetween(10000000, 99999999), "Jose Mourinho", "Juego directo");
            e1 = new Equipo("FC Barcelona", "LaLiga", ent1);
            e2 = new Equipo("Real Madrid CF", "LaLiga", ent2);
            
            for (int i = 0; i < 30; i++) {
                if (i < 20) {
                    e1.addFutbolista(emp.getFutbolistas().get(i));
                } else {
                    e2.addFutbolista(emp.getFutbolistas().get(i));
                }
            }
            System.out.println("EMPRESA:");
            System.out.println(emp);
            System.out.println(e1.getSalariosNoSeleccionados());
            System.out.println(e2.getSalariosNoSeleccionados());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
