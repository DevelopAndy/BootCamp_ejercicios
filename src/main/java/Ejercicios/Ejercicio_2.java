package Ejercicios;


public class Ejercicio_2 {
	
	public static void main(String[] args) {
		int numeroIf = 5;
		
		if (numeroIf > 0) {
			System.out.println("El numero es positivo");
		} else if (numeroIf < 0) {
			System.out.println("El numero es negativo");
		} else {
			System.out.println("El numero es 0");
		}
		
		int numeroWhile = 0;
		
		while (numeroWhile < 3) {
			numeroWhile++;
			System.out.println(numeroWhile);
		}
	}
}
