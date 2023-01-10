package Ejercicios.Ejercicio12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int dividendo = 5;
        int divisor = 0;

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

        try {
            int division = dividendo / divisor;
            System.out.println(division);
        }
        catch (ArithmeticException e) {
            System.out.println("No se puede dividir: " + e.getMessage());
        }

        try {
            for(int i=0; i<=9; i++) {
                System.out.println(numeros.get(i));
            }
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("El array tiene menos elementos " + e.getMessage());
        }
    }
}
