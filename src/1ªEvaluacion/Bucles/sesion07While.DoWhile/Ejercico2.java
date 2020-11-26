package Bucles.sesion07While.DoWhile;

import java.util.Scanner;

public class Ejercico2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
int i = 0;
            System.out.println("Introduce un número (0 para finalizar)");
            int numero = sc.nextInt();
         while (numero != 0) {
             i++;
             System.out.println("Introduce un número (0 para finalizar)");
             numero = sc.nextInt();
             if (numero == 0) {
                 break;
             }
         }
System.out.println("Has introducido " + i + " números");
    }
}
