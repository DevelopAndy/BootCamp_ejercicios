package Ejercicios.Ejercicio4;

public class SmartPhone extends SmartDevice{

    double pulgadas;
    String so;
    int modelo;

    public SmartPhone() {

    }

    public SmartPhone(String tipoBateria, Boolean cargador, Boolean audifonos, Boolean simCard, double pulgadas, String so, int modelo) {
        super(tipoBateria, cargador, audifonos, simCard);
        this.pulgadas = pulgadas;
        this.so = so;
        this.modelo = modelo;
    }

    public String getSo() {
        return this.so;
    }
}
