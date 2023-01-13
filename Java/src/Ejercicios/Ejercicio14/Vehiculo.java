package Ejercicios.Ejercicio14;

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
    public String tipo() {
        return tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getTipo() {
        return tipo;
    }
}
