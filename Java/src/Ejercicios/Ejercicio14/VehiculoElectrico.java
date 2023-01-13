package Ejercicios.Ejercicio14;

public class VehiculoElectrico implements Coche{
    private int velocidad;
    private String tipo;
    private Boolean baterias;

    public VehiculoElectrico(int velocidad, String tipo, Boolean baterias) {
        this.velocidad = velocidad;
        this.tipo = tipo;
        this.baterias = baterias;
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

    public Boolean getBaterias() {
        return baterias;
    }

}
