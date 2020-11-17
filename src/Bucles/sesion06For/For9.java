package Bucles.sesion06For;

import java.util.Scanner;

public class For9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué número quiere introducir?:");
        int numero = sc.nextInt();
        System.out.println("¿A que potencia quiere elevarlo?:");
        int potencia = sc.nextInt();
        int i;
        for (i = 1; i <= potencia; i++) {
            numero = numero * numero;

        }
        System.out.println(numero);
    }
}
