/*Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio
  con el IVA incluido.*/

package Ejercicios;

public class Ejercicio2 {

    public static void main(String[] args) {

        double price1 = getPrice(100);
        System.out.println(price1);
    }

    static double getPrice(double price) {
        double iva = 0.19d;
        double finalPrice = price * iva + price;
        return finalPrice;
    }
}
