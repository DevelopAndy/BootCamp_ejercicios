package Ejercicios.Ejercicio10;

import java.util.ArrayList;

public class Coches implements CocheIterator{

    ArrayList<Coche> coches = new ArrayList<>();
    private int index = 0;
    public void create(Coche coche) {
        coches.add(coche);
    }
    @Override
    public boolean hasMore() {
        return index < coches.size();
    }

    @Override
    public void reset() {
        index = 0;

    }

    @Override
    public Coche next() {
        Coche coche = coches.get(index);
        index++;
        return coche;
    }
}
