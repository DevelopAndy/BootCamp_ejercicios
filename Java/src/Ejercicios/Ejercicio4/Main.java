package Ejercicios.Ejercicio4;

public class Main {

    public static void main(String[] args) {

        SmartPhone celular1 = new SmartPhone("Litio", false, false, true, 7, "Android", 2020);
        SmartPhone celular2 = new SmartPhone("NiMh", true, false, true, 6, "iOS", 2022);

        SmartWatch reloj1 = new SmartWatch("alcalina", true, false, false, "broche", 2019);
        SmartWatch reloj2 = new SmartWatch("litio", true, false, false, "botón", 2022);

        System.out.println("¿Trae el " + celular1.so + " audifonos?: " + celular1.audifonos);
        System.out.println("¿Trae el " + celular2.so + " cargador?: " + celular2.cargador);
        System.out.println("¿Qué tipo de batería es el modelo " + reloj1.modelo + "?: " + reloj1.tipoBateria);
        System.out.println("¿Qué tipo de correa es el modelo " + reloj2.modelo + "?: " + reloj2.tipoCorrea);
    }
}
