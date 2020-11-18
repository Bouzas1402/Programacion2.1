package Bucles.sesion07While.DoWhile;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAleatorio = (int) (Math.random() * 100 + 1);
        int numUsuario;
        System.out.println("Vamos a encontrar un número elegido al azar entre 1y 100.");
        System.out.println("Si en algun momento deseas rendirte pulsa 0");
        do {
            System.out.println("Introduzca un número entre 1 y 100: ");
            numUsuario = sc.nextInt();
            if (numUsuario < numAleatorio && numUsuario > 0) {
                System.out.println("El número " + numUsuario + " es menor");
            } else if (numUsuario > numAleatorio && numUsuario <= 100) {
                System.out.println("El número " + numUsuario + " es mayor");
            } else if (numUsuario < 0 || numUsuario > 100) {
                System.out.println("El número " + numUsuario + " esta fuera de rango");
            }
        }
        while (numUsuario != 0 && numUsuario != numAleatorio) ;
        if (numUsuario == 0){
            System.out.println("Te has rendido, el número era: " + numUsuario);
        } else if (numUsuario == numAleatorio){
            System.out.println("Felicidades, has encontrado el número.");
        }
    }
}