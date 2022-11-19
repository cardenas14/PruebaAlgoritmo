package pruebaalgoritmos;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        int n1, n2, n3, cant;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de ternas");
        cant = sc.nextInt();

        for (int i = 1; i <= cant; i++) {
            System.out.println("Ingrese el numero 1");
            n1 = sc.nextInt();
            System.out.println("Ingrese el numero 2");
            n2 = sc.nextInt();
            System.out.println("Ingrese el numero 3");
            n3 = sc.nextInt();
            if (n1 == n2 || n2 == n1 || n1 == n3) {
                System.out.println("Por lo menos 2 de 3 numeros son IGUALES");
                if (n1 < n2) {
                    if (n1 < n3) {
                        System.out.println("El numero menor es " + n1);
                    } else {
                        System.out.println("El numero menor es:" + n3);
                    }
                } else {
                    if (n2 < n3) {
                        System.out.println("El numero menor es:" + n2);
                    } else {
                        System.out.println("El numero menor es:" + n3);
                    }
                }
                
                if (n1 > n2) {
                    if (n1 > n3) {
                        System.out.println("El numero mayor es " + n1);
                    } else {
                        System.out.println("El numero mayor es:" + n3);
                    }
                } else {
                    if (n2 > n3) {
                        System.out.println("El numero mayor es:" + n2);
                    } else {
                        System.out.println("El numero mayor es:" + n3);
                    }
}}}}}
