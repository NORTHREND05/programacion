package tema11.profesional;

import java.util.Comparator;

public class ProfesionalNombreComparator implements Comparator<Profesional>{

    @Override
    public int compare(Profesional o1, Profesional o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
