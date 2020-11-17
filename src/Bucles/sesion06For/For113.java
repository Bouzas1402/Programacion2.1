package Bucles.sesion06For;

import java.util.Scanner;

public class For113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        System.out.println("Introduzca un número: (tiene que ser impar)");
        int numero = sc.nextInt();
        System.out.println("Introduzca un caracter:");
        var caracter = sc.next();



        for (i = 1; i <= numero; i++){

            for (j = 1; j <= i; j++){
                if ((i % 2) != 0) {
                System.out.print(caracter);
            } else if ((j % 2) == 0) {
                    System.out.print("");
                } else {
                    System.out.println("");
                }

            }

            j = 1;
        }





    }
}

