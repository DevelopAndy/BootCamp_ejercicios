package Ejercicios.Ejercicio14_15;

public class DbMySQL implements DbStore{
    @Override
    public void guardar(Vehiculo vehiculo) {
        System.out.println("Soy guardar() en MySQL");
    }
}
