/* En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final
    por consola. Tened en cuenta que los textos pueden venir de un array de tipo String.*/

package Ejercicios;

public class Ejercicio3 {

    public static void main(String[] args) {

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "Octubre", "Noviembre", "Diciembre"};

        String mesesAnio = "Los meses del año son: ";
        for(String mes: meses) {
            if(mes.equals("Diciembre"))
                mesesAnio += mes + ".";
            else mesesAnio += mes + ", ";
        }

        System.out.println(mesesAnio);
    }
}
