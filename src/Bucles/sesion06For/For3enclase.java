package Bucles.sesion06For;

import java.util.Scanner;

public class For3enclase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int suma = 0;
        for(int i = a; i <= b; i++){
            suma = suma + i;
        }
        System.out.println(suma);
    }
}
