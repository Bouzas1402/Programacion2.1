package Bucles.sesion06For;

import java.util.Scanner;

public class For7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
long i;
        System.out.println("¿Qué número desea introducir?:");
        long factorial = sc.nextLong();
        for (i = factorial - 1; i > 0; i--){

factorial = factorial * i;
}
System.out.println(factorial);

    }
}
