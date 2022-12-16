package Ejercicios.Ejercicio6;

import java.util.ArrayList;
import java.util.LinkedList;
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
        int enteros[][] = {
                {1, 2, 3, 4, 5,},
                {6, 7, 8, 9, 10}
        };

        for(int i=0; i<enteros.length; i++) {
            StringBuilder text = new StringBuilder();
            StringBuilder fila = new StringBuilder();
            fila.append(i+1);
            text.append("La fila es: " + fila + " y el valor de cada columna es: ");
            for(int j=0; j<enteros[1].length; j++) {
                text.append(enteros[i][j] + ", ");
            }
            System.out.println(text);
        }

        /* Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y
        3er elemento y muestra el resultado final.
         */

        Vector<Integer> numeros = new Vector<>();
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

        /* Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos
        mostrando únicamente el valor de cada elemento.
         */

        ArrayList<String> elementos = new ArrayList<>();
        elementos.add("primero");
        elementos.add("segundo");
        elementos.add("tercero");
        elementos.add("cuarto");

        LinkedList<String> copiaArray = new LinkedList<>(elementos);

        for(String elemento:elementos) {
            System.out.println(elemento);
        }

        for(String copia:copiaArray) {
            System.out.println(copia);
        }

        /* Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación,
        con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el
        ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for"
        de relleno.
         */

        ArrayList<Integer> num = new ArrayList<>();

        for(int i=1; i<11; i++) {
            num.add(i);
        }

        for(int i=0; i<num.size()-1; i++) {
            if(num.get(i) % 2 == 0) {
                num.remove(i);
            }
            System.out.println(num.get(i));
        }

        /* Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del
        tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara
        la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso:
        "Demo de código".
         */

        try {
            dividePorCero(5);
        }
        catch (Exception e) {
            System.out.println("Esto no puede hacerse");
        }

    }

    public static void dividePorCero(int a) throws ArithmeticException {
        try {
            int div = a / 0;
        }
        catch (ArithmeticException e){
            throw new ArithmeticException();
        }
        finally {
            System.out.println("Demo de código");
        }
    }

    public static String reverse(String texto) {
     StringBuilder nuevoTextoInvertido = new StringBuilder();
     String resultado = nuevoTextoInvertido.toString();

     for(int i=(texto.length())-1; i>=0; i--) {
         nuevoTextoInvertido.append(i);
     }
     return resultado;
    }
}
