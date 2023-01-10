package Ejercicios.Ejercicio10;

public class Main {

    public static void main(String[] args) {

        Coches coches = new Coches();
        coches.create(new Coche("rojo", "Honda"));
        coches.create(new Coche("verde", "Mazda"));
        coches.create(new Coche("negro", "BMW"));
        coches.create(new Coche("amarillo", "Toyota"));
        coches.create(new Coche("azul", "Jeep"));

        while (coches.hasMore()) {
            Coche coche = coches.next();
            System.out.println("El coche es de color: " + coche.getColor() + " y la marca es: " + coche.getMarca());
        }

        coches.reset();
        while (coches.hasMore()) {
            Coche coche = coches.next();
            System.out.println("El coche es de color: " + coche.getColor() + " y la marca es: " + coche.getMarca());
        }
    }
}
