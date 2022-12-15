package Ejercicios.Ejercicio6;

public class Main {

    public static void main(String[] args) {
        /* Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo",
        debe retornar "odnum aloh".*/
        String texto = "hola mundo";
        String textoInvertido = reverse(texto);
        System.out.println(textoInvertido);

        /* Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.*/
        String nombres[] = {"Carlos", "Andres", "Francisco", "Mireya", "Juan"};

        for(String nombre:nombres) {
            System.out.println(nombre);
        }

        /*Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de
        cada elemento en ambas dimensiones
         */
        int enteros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for(int i=0; i<enteros.length; i++) {
            System.out.println("La posición es: " + i + " y el valor es: " + enteros[i]);
        }

    }

    public static String reverse(String texto) {
     String nuevoTextoInvertido = "";

     for(int i=(texto.length())-1; i>=0; i--) {
         nuevoTextoInvertido += texto.charAt(i);
     }
     return nuevoTextoInvertido;
    }
}
