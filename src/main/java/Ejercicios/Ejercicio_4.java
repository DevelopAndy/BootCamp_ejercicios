package Ejercicios;

/*
 Crea una clase Persona con las siguientes variables:
La edad
El nombre
El teléfono
Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
 */

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

class Trabajador extends Persona {
	
	private float salario;
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public float getSalario() {
		return salario;
	}
}