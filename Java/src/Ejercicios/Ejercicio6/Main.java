package Ejercicios.Ejercicio6;

import java.util.Vector;

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

        /* Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y
        3er elemento y muestra el resultado final.
         */

        Vector<Integer> numeros = new Vector();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        numeros.remove(1);
        numeros.remove(1);

        System.out.println(numeros);

        /* Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos
        1000 elementos para ser añadidos al mismo.

        Respuesta: Que puedo consumir mucha memoria si no defino una capacidad y me paso de los mil
         elementos, ya que el array se está copiando para poder meter esos otros elementos...
         Mucho consumo de memoria ya que puede que esté consumiendo espacios sin utilizar
         */

    }

    public static String reverse(String texto) {
     String nuevoTextoInvertido = "";

     for(int i=(texto.length())-1; i>=0; i--) {
         nuevoTextoInvertido += texto.charAt(i);
     }
     return nuevoTextoInvertido;
    }
}
