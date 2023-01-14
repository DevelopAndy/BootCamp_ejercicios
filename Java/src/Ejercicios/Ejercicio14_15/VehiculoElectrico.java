package Ejercicios.Ejercicio14_15;

public class VehiculoElectrico implements Coche, CocheElectrico{

    private int velocidad;
    private String tipo;
    private Boolean baterias;

    public VehiculoElectrico(int velocidad, String tipo, Boolean baterias) {
        this.velocidad = velocidad;
        this.tipo = tipo;
        this.baterias = baterias;
    }

    @Override
    public Boolean getBaterias() {
        return baterias;
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
