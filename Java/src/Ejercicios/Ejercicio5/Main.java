package Ejercicios.Ejercicio5;

public class Main {

    public static void main(String[] args) {

        CocheCRUDImpl coche1 = new CocheCRUDImpl();

        coche1.save();
        coche1.findAll();
        coche1.delete();
    }
}
