package Ejercicios.Ejercicio12;

public class Main {
    public static void main(String[] args) {
        int dividendo = 5;
        int divisor = 0;

        try {
            int division = dividendo / divisor;
            System.out.println(division);
        }
        catch (ArithmeticException e) {
            System.out.println("No se puede dividir: " + e.getMessage());
        }
    }
}
