package Bucles.sesion07While.DoWhile;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            n = sc.nextInt();
            System.out.println(n);
        } while (n != 0);


    }
}
