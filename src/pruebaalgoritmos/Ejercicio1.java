package pruebaalgoritmos;
import java.util.Scanner;
/*
@yovana
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        float monto, descuento = 0, totalpagar;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el monto");
        monto = sc.nextFloat();

        if (monto > 100) {
            descuento = monto * 10 / 100;
        } else if (monto < 100 && monto >= 1) {
            descuento = monto * 2 / 100;
        } else {
            System.out.println("MONTO INCORRECTO");
        }

        totalpagar = monto - descuento;

        System.out.println("El monto es :" + monto);
        System.out.println("El descuento es :" + descuento);
        System.out.println("El total a pagar es :" + totalpagar);
    }
}
