package Bucles.sesion06For;

import java.util.Scanner;

public class For112 {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        int i;
        int j;
        System.out.println("Introduzca un número:");
        int numero = sc.nextInt();
        System.out.println("Introduzca un caracter:");
        var caracter = sc.next();
        for (i = 1; i <= numero; i++){
            for (j = 1; j <= i; j++){
                System.out.print(caracter);
            }
            System.out.println("");
            j = 1;
        }
        for (i = numero; i >= 0; i--) {
            for (j = 1; j < i; j++) {
                System.out.print(caracter);
            }
            System.out.println("");
            j = 1;
        }
    }
}
