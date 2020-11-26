package Bucles.sesion07While.DoWhile;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int multiplo = 1;
        int i = 1;
        int j = 1;
        while (i <= 5) {
           while (j <= 10) {
               if ((multiplo % 5) == 0) {
                   System.out.print(multiplo + " ");
                   j++;
                   multiplo++;
               } else {
                   multiplo++;
               }

           }
           System.out.println("");
           i++;
           j=1;
        }


    }
}
