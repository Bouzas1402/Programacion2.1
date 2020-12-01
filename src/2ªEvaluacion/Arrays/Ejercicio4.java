package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        /*Ejercicio 4
Programa que declare una lista y la vaya llenando
de números hasta que introduzcamos un
número negativo. Entonces se debe imprimir el vector
(sólo los elementos introducidos).*/
        Scanner sc = new Scanner(System.in);
        int tamaño;
        int num;
        do {
            System.out.println("tamaño del array:");
            tamaño = sc.nextInt();
        } while (tamaño <= 0);
        int[] array = new int[tamaño];
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            System.out.println("Valor de la posicion (negativo para salir ) " + i);
        num = sc.nextInt();
        if (num >= 0) {
            array[i] = num;
        } else {
            break;
        }
        }
        System.out.println(Arrays.toString(array));
    }
}
