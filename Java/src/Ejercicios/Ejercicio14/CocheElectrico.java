package Ejercicios.Ejercicio14;

public class CocheElectrico implements Coche{
    private int velocidad;

    @Override
    public void acelerar() {
        velocidad++;
    }

    @Override
    public void frenar() {
        velocidad--;
    }

    @Override
    public int getVelocidad() {
        return velocidad;
    }
}
