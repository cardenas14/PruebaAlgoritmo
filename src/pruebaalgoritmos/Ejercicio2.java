package pruebaalgoritmos;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        float precio, pbruto = 0, pneto = 0, monto, descuento = 0,calcIVA;
        int cant;

        Scanner sc = new Scanner(System.in);
        System.out.println("-----------EMITIR FACTURA------------ ");
        System.out.println("Ingrese el total de unidades de articulos");
        cant = sc.nextInt();
        System.out.println("Ingrese el precio del articulo");
        precio = sc.nextInt();

        monto = cant * precio;
        calcIVA = monto * 19 / 100;
        pbruto = monto + calcIVA;

        if (cant >= 1) {
            if (pbruto > 13000) {
                descuento = pbruto * 5 / 100;
                pneto = pbruto - descuento;
            } else if (pbruto < 13000) {
                pneto = pbruto;
            }
            System.out.println("La cantidad ingresada es :" + cant);
            System.out.println("El precio del articulo es :" + precio);
            System.out.println("El monto total es :" + monto);
            System.out.println("El IVA:" + calcIVA);
            System.out.println("El precio bruto es :" + pbruto);
            System.out.println("El descuento es :" + descuento);
            System.out.println("El precio neto es :" + pneto);
        } else if (cant < 1) {
            System.out.println("Cantidad no valida");
        }
}}
