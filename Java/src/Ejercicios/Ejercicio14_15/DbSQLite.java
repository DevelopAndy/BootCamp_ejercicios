package Ejercicios.Ejercicio14_15;

public class DbSQLite implements DbStore{

    @Override
    public void guardar(Vehiculo vehiculo) {
        System.out.println("Soy Guardar() en SQLite");
    };
}
