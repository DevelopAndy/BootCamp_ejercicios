package Ejercicios.Ejercicio9;

public class Main {
    public static void main(String[] args) {

        Ejercicio9 singleton = Ejercicio9.getInstance();
        Ejercicio9 singleton2 = Ejercicio9.getInstance();

        System.out.println(singleton.getContador() +" "+ singleton);
        System.out.println(singleton2.getContador() +" "+ singleton2);
    }
}
