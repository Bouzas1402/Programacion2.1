package Bucles.sesion06For;

import java.util.Scanner;

public class For8 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("¿Qué numero desea introducir?:");
    long n = sc.nextLong();
    long i;
    for (i = 1; i <= n; i++){
        if (i % 5 == 0){
            System.out.print(i + ",");

        } else {
            System.out.print("");
        }


    }

}
}
