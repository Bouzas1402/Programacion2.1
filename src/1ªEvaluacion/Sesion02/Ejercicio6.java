package Sesion02;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
System.out.println("Introduzca un numero de 3 digitos:");
int numero = sc.nextInt();

int unidades = numero % 10;
int decenas = (numero / 10) % 10;
int centenas = numero / 100;

System.out.println(unidades + "" + decenas + "" + centenas);


    }
}
