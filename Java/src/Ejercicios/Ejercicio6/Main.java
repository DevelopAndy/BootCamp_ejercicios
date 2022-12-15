package Ejercicios.Ejercicio6;

public class Main {

    public static void main(String[] args) {

        String texto = "hola mundo";
        String textoInvertido = reverse(texto);
        System.out.println(textoInvertido);

    }

    public static String reverse(String texto) {
     String nuevoTextoInvertido = "";

     for(int i=(texto.length())-1; i>=0; i--) {
         nuevoTextoInvertido += texto.charAt(i);
     }
     return nuevoTextoInvertido;
    }
}
