package Ejercicios.Ejercicio14;

public class VehiculoElectrico extends Coche{
    private Boolean baterias;

    public VehiculoElectrico(int velocidad, String tipo, Boolean baterias) {
        this.velocidad = velocidad;
        this.tipo = tipo;
        this.baterias = baterias;
    }

    public Boolean getBaterias() {
        return baterias;
    }

}
