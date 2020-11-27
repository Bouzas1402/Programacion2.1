package Bucles.sesion06For;

import java.util.Scanner;

public class For10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué número quiere introducir?:");
        int numero = sc.nextInt();
        System.out.println("Introduzca un caracter:");
        var caracter = sc.next();
        int i;
        int j;
        for (j = 1; j <= numero; j++) {
            System.out.println("");
        for (i = 1; i <= numero; i++) {
System.out.print(caracter);
        }
        }
    }
}