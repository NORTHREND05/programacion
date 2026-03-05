package tema9.ejercicio3;

import tema9.ejercicio1.Cuenta;
import tema9.ejercicio2.NIF;

public class Run {
    public static void main(String[] args) {
        NIF nifPaco = new NIF(13312322);
        Cuenta cuentaPaco = new Cuenta(1000);
        Alumno paco = new Alumno(1234, nifPaco, cuentaPaco);
        
        Instituto i = new Instituto();
        
        NIF nifAlex = new NIF(31232333);
        Alumno alexandra = new Alumno(1235, nifAlex, null);
        
//        System.out.println("Son iguales?: " + paco.equals(alexandra));
//        System.out.println(paco.toString());
//        System.out.println(alexandra.toString());
        
        System.out.println(i.listadoCurso("1ºdaw"));
    }
}
