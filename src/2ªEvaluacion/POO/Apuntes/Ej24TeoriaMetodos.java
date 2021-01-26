package POO.Apuntes;
import java.util.*;
import java.util.Scanner;

public class Ej24TeoriaMetodos {
    static Scanner sc = new Scanner(System.in);
   /* Escribe un método llamado getPrimeroYÚltimo. El método recibe un array de enteros y
    devolver otro array de enteros. El array retornado debe contener dos elementos: el primero
    y el último de los elementos del array de entrada.
            */

    // escribe aquí el método
public static int[] getPrimeroYUltimo (int[] array) {
    int [] primeroYUltimo = new int[2];
    primeroYUltimo [0] = array[0];
    primeroYUltimo [1] = array[array.length - 1];
    return primeroYUltimo;
}


    public static void main(String[] args) {
        int n;
        do {
            System.out.println("Tamaño del array: ");
            n = sc.nextInt();
        } while (n <= 0);
        int[] numeros = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100 - 50);
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(getPrimeroYUltimo(numeros)));

    }
}