package Ejercicios.Ejercicio14;

abstract class Coche {

    int velocidad;
    String tipo;

    Boolean baterias;

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

    public Boolean getBaterias() {
        return baterias;
    }
}
