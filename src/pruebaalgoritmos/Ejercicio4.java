package pruebaalgoritmos;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        float precio = 0, descuento = 0;
        float c1 = 0.05f, c2 = 0.075f, venta = 0, calComision = 0, totalventa = 0, ventabruta = 0;
        int n, i = 1, cant = 0, totalcant = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------CALCULAR COMISION TOTAL----------- ");
        System.out.println("Ingrese el numero de ventas");
        n = sc.nextInt();

        while (i <= n) {
            System.out.println("Ingrese el precio del articulo");
            precio = sc.nextFloat();
            System.out.println("Ingrese la cantidad");
            cant = sc.nextInt();
            if (precio < 100) {
                venta = precio * cant;
                totalcant = totalcant + cant;
                totalventa = totalventa + venta;
                calComision = totalventa * c2;
                ventabruta = totalventa + calComision;
            } else if (precio >= 100) {
                venta = precio * cant;
                totalcant = totalcant + cant;
                totalventa = totalventa + venta;
                calComision = totalventa * c1;
                ventabruta = totalventa + calComision;
            }
            i = i + 1;
        }
        System.out.println("La cantidad total ingresada es :" + totalcant);
        System.out.println("La venta total  :" + totalventa);
        System.out.println("La comision total es :" + calComision);
        System.out.println("El monto total + comision es :" + ventabruta);
}}
