package Bucles.sesion07While.DoWhile;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
int suma = 0;
int numero = 1;
int j;
        while (suma <= 125) {
            numero ++;
            suma = 0;
            for (j = numero; j > 0; j--) {
suma = suma + j;
            }
        }
System.out.println(numero);
    }
}
