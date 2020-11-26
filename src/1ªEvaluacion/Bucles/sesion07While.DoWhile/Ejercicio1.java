package Bucles.sesion07While.DoWhile;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
System.out.println("Introduce un número entre el 1 y 100");
int numero = sc.nextInt();
while (numero <= 0 || numero > 100) {
    System.out.println("El número " + numero + " no está en el rango indicado.");
    System.out.println("Introduce un número entre el 1 y 100");
    numero = sc.nextInt();
    if (numero > 0 && numero <= 100) {
        break;

    }
}
    System.out.println("El número introducido es: " + numero);

}
}
