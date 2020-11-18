package Practicas.Práctica4;

import java.util.Scanner;

public class EstructurasDeRepeticiónWhileYDoWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int j;
        int i = 0;
int x;
System.out.println("Introduce el ajercicio a resolver:");
while (i < 1) {
    System.out.println("1.For");
    System.out.println("2.While");
    int numEjercicio = sc.nextInt();

    switch (numEjercicio) {
        case 1:
            System.out.println("Introduzca un número:");
            int numero1 = sc.nextInt();
            System.out.println("Introduzca otro numero:");
            int numero2 = sc.nextInt();
            System.out.println("Introduzca un caracter:");
            var caracter = sc.next();
            if (numero1 <= numero2) {
                for (j = 1; j <= numero1; j++) {
                    for (i = 1; i <= numero2; i++) {
                        System.out.print(caracter);
                    }
                    System.out.println("");
                }
            } else {
                for (j = 1; j <= numero2; j++) {
                    for (x = 1; x <= numero1; x++) {
                        System.out.print(caracter);
                    }
                    System.out.println("");
                }
            }
            i++;
            break;
        case 2:
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
i++;
            break;
        default:
System.out.println("Opción incorrecta.");
    }





}

    }
}
