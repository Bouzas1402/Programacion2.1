package Bucles.sesion06For;

import java.util.Scanner;

public class For111 {

    public static void main(String[] args) {
        int i;
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número:");
        int numero1 = sc.nextInt();
        System.out.println("Introduzca un caracter:");
        var caracter = sc.next();

        for (i = 1; i <= numero1; i++){

            for (j = 1; j <= i; j++){
                System.out.print(caracter);

            }

            System.out.println("");
            j = 1;
        }



    }
}