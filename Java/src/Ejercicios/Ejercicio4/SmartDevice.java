package Ejercicios.Ejercicio4;

public class SmartDevice {

    protected String tipoBateria;
    protected Boolean cargador;
    protected Boolean audifonos;
    protected Boolean simCard;

    public SmartDevice() {
    }

    public SmartDevice(String tipoBateria, Boolean cargador, Boolean audifonos, Boolean simCard) {
        this.tipoBateria = tipoBateria;
        this.cargador = cargador;
        this.audifonos = audifonos;
        this.simCard = simCard;
    }
}
