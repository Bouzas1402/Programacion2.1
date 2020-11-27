package Bucles.sesion07While.DoWhile;

import java.util.Scanner;

public class Ejercico4 {
    public static void main(String[] args){

        int i = 1;
        int j = 1;
        while (i <= 20) {
            if ((j % 5) == 0) {
                System.out.print(j + " ");
                i++;
                j++;
            } else {
                j++;
            }

        }
    }
}
