package Ejercicios.Ejercicio14;

abstract class Coche {

    int velocidad;
    String tipo;

    void acelerar() {
        velocidad++;
    }

    void frenar() {
        velocidad--;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getTipo() {
        return tipo;
    }
}
