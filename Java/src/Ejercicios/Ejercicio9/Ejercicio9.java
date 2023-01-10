package Ejercicios.Ejercicio9;

public class Ejercicio9 {
    private static Ejercicio9 ejercicio9;
    int contador;
    private Ejercicio9() {

    }

    public static Ejercicio9 getInstance() {
        if(ejercicio9 == null) {
            ejercicio9 = new Ejercicio9();
        }
        return ejercicio9;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
