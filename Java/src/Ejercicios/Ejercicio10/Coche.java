package Ejercicios.Ejercicio10;

public class Coche {
    private String color;
    private String marca;

    private Coche() {

    }

    public Coche(String color, String marca) {
        this.color = color;
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }
}
