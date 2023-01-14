package Ejercicios.Ejercicio14;

public class Main {

    public static void main(String[] args) {
        Vehiculo moto = new Vehiculo(50, "moto");
        VehiculoElectrico carro = new VehiculoElectrico(80, "carro", true);

        System.out.println("\n Moto:\n");
        System.out.println(moto.getTipo());
        System.out.println(moto.getVelocidad());

        System.out.println("\n Electrico:\n");
        System.out.println(carro.getTipo());
        System.out.println(carro.getVelocidad());
        System.out.println(carro.getBaterias());

        DbMySQL db = new DbMySQL();
        guardarEnBaseDeDatos(db, moto);

    }

    public static void guardarEnBaseDeDatos(DbStore dbs, Vehiculo vehiculo) {
        dbs.guardar(vehiculo);
    }
}
