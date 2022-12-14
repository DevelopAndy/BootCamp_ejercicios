package Ejercicios.Ejercicio4;

public class SmartWatch extends SmartDevice{

    String tipoCorrea;
    int modelo;

    public SmartWatch() {

    }

    public SmartWatch(String tipoBateria, Boolean cargador, Boolean audifonos, Boolean simCard, String tipoCorrea, int modelo) {
        super(tipoBateria, cargador, audifonos, simCard);
        this.tipoCorrea = tipoCorrea;
        this.modelo = modelo;
    }
}
