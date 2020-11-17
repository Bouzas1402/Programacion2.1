package Bucles.sesion06For;

import java.util.Scanner;

public class For11 {
    public static void main(String[] args) {
        int i;
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número:");
        int numero1 = sc.nextInt();
        System.out.println("Introduzca otro numero:");
        int numero2 = sc.nextInt();
        System.out.println("Introduzca un caracter:");
        var caracter = sc.next();
        if (numero1 <= numero2) {
            for (j = 1; j <= numero1; j++) {
                for (i = 1; i <= numero2; i++) {
                    System.out.print(caracter);
                }
System.out.println("");
            }
        } else {

            for (j = 1; j <= numero2; j++) {
                for (i = 1; i <= numero1; i++) {
                    System.out.print(caracter);
                }
                System.out.println("");
            }
        }
    }
}