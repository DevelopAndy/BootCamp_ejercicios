package Introduccion;

public class Ejercicio_1 {

    /*
    Primera parte:

    Crear una función con tres parámetros que sean números que se suman entre sí.

    Llamar a la función en el main y darle valores.

    Segunda parte:

    Crear una clase coche.

    Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

    Una función que incremente el número de puertas que tiene el coche.

    Crear un objeto miCoche en el main y añadirle una puerta.

    Mostrar el número de puertas que tiene el objeto.
     */
    
    
    public static void main(String[] args) {
        suma(10, 15, 20);

        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println(miCoche.puertas);
    }

    public static void suma(int a, int b, int c) {
        int resultado = a + b + c;
        System.out.println(resultado);
    }
}

class Coche {

    public int puertas = 4;

    public void incrementarPuertas() {
        this.puertas++;
    }
}
