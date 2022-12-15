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

    }

    public static String reverse(String texto) {
     String nuevoTextoInvertido = "";

     for(int i=(texto.length())-1; i>=0; i--) {
         nuevoTextoInvertido += texto.charAt(i);
     }
     return nuevoTextoInvertido;
    }
}
