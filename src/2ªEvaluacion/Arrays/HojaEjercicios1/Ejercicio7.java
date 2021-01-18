package Arrays.HojaEjercicios1;

import java.util.Arrays;

public class Ejercicio7 {
    public static void main(String[] args){

//Programa que declare tres listas ‘lista1’, ‘lista2’ y ‘lista3’ de cinco enteros cada uno, pida
//valores para ‘lista1’ y ‘lista2’ y calcule lista3=lista1+lista2.
        int [] lista2 = new int[5];
        int [] lista3 = new int[5];
        int[] lista1 = new int[5];
        for (int i = 0; i < lista1.length; i++) {
        lista1 [i] = (int) (Math.random() * 10 + 1);
        }
        for (int i = 0; i < lista2.length; i++) {
            lista2 [i] = (int) (Math.random() * 10 + 1);
        }
        for (int i = 0; i < lista3.length; i++) {
            lista3 [i] = lista1[i] + lista2[i];
        }

        System.out.println(Arrays.toString(lista1));
        System.out.println(Arrays.toString(lista2));
        System.out.println(Arrays.toString(lista3));
    }
}
