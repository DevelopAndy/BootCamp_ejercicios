package Ejercicios.Ejercicio14_15;

public class Vehiculo implements Coche{

    private int velocidad;
    private String tipo;

    public Vehiculo(int velocidad, String tipo) {
        this.velocidad = velocidad;
        this.tipo = tipo;
    }

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

    @Override
    public String getTipo() {
        return tipo;
    }
}
