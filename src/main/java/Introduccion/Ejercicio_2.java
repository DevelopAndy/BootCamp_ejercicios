package Introduccion;


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
		
		// --------------------------------------------------------------------------------
		
		int numeroWhile = 0;
		
		while (numeroWhile < 3) {
			numeroWhile++;
			System.out.println(numeroWhile);
		}
		
		// --------------------------------------------------------------------------------
		
		do {
			numeroWhile++;
			System.out.println(numeroWhile);
		} while (numeroWhile < 3);
		
		// --------------------------------------------------------------------------------
		
		int numeroFor;
		
		for (numeroFor=0; numeroFor <= 3; numeroFor++) {
			System.out.println(numeroFor);
		}
		
		// --------------------------------------------------------------------------------
		
		String estacion = "otoño";
		
		switch (estacion) {
		case "invierno":
			System.out.println("Estamos en invierno");
			break;
		case "verano":
			System.out.println("Estamos en verano");
			break;
		case "otoño":
			System.out.println("Estamos en otoño");
			break;
		case "primavera":
			System.out.println("Estamos en primavera");
			break;
		default:
			System.out.println("No es una estación");
			break;
		}
	}
	

}
