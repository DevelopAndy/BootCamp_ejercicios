package Ejercicios.Ejercicio11;

import java.util.ArrayList;

public class FuncionesYComentarios {

    public static void main(String[] args) {

        // sumar los numeros dados en los parametros de la unción
        int suma = sumarNumeros(1,2,3,4,5);

        // Lista de nombres
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Andy");
        nombres.add("Sofia");
        nombres.add("Vanesa");
        nombres.add("Rodrigo");

        // Imprimimos el resultado de la suma
        System.out.println(suma);
        // Imprimimos falso o verdadero dependiendo de si existe el nombre
        System.out.println(existeNombre(nombres, "Andy"));
        System.out.println(existeNombre(nombres, "Alfons"));

    }

    /**
     * suma numeros
     * @param numeros numeros para sumar dados por parametros
     * @return devuelve elresultado de la suma
     */
    public static int sumarNumeros(int ...numeros) {
        int resultado = 0;

        for ( int numero:numeros) {
            resultado += numero;
        }

        return resultado;
    }

    /**
     * Verifica siun nombre existe en un Array
     * @param nombres uno o varios objetos de tipo String
     * @param nombreABuscar el nombre que se va a buscar en el array
     * @return devuelve verdadero si existe elusuario y falso si no
     */
    public static boolean existeNombre(ArrayList nombres, String nombreABuscar) {
        return nombres.contains(nombreABuscar);
    }
}
