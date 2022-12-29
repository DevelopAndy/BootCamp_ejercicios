package Ejercicios.Ejercicio11;

import java.util.ArrayList;

public class FuncionesYComentarios {

    public static void main(String[] args) {

        int suma = sumarNumeros(1,2,3,4,5);

        // Lista de nombres
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Andy");
        nombres.add("Sofia");
        nombres.add("Vanesa");
        nombres.add("Rodrigo");

        System.out.println(suma);

        System.out.println(existeNombre(nombres, "Andy"));
        System.out.println(existeNombre(nombres, "Alfons"));

    }

    public static int sumarNumeros(int ...numeros) {
        int resultado = 0;

        for ( int numero:numeros) {
            resultado += numero;
        }

        return resultado;
    }

    public static boolean existeNombre(ArrayList nombres, String nombreABuscar) {
        return nombres.contains(nombreABuscar);
    }
}
