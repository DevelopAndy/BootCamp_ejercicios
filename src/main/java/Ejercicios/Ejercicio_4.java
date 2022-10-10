package Ejercicios;

public class Ejercicio_4 {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setEdad(21);
		cliente1.setTelefono("3143211237");
		cliente1.setNombre("Antonio");
		cliente1.setCredito(1000);
		
		System.out.println("El cliente " + cliente1.getNombre() + " de " + cliente1.getEdad() + " años de edad, y número de telefono: " + cliente1.getTelefono() + " tiene un crédito de: " + cliente1.getCredito());
	}
}

class Cliente extends Persona {
	
	private float credito;
	
	public void setCredito(float credito) {
		this.credito = credito;
	}
	
	public float getCredito() {
		return credito;
	}
}
