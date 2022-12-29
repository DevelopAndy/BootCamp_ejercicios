package Ejercicios.Ejercicio11;

import java.util.ArrayList;

public class FuncionesYComentarios {

    public static void main(String[] args) {

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
