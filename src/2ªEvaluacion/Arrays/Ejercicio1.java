package Arrays;

import java.util.Arrays;

public class Ejercicio1 {
public static void main(String[] args){
    /*Realizar un programa que inicialice una lista con 10 valores aleatorios (del 1 al 10) y
posteriormente muestre en pantalla cada elemento de la lista junto con su cuadrado y su
cubo.*/

    int i;
    int y;
    int[] valores = new int[10];

        for (i = 0; i < valores.length; i++) {
        valores [i] = (int) (Math.random() * 100 + 1);
    }
        System.out.println(Arrays.toString(valores));
for (y = 0; y < valores.length; y++){

        System.out.println("El numero " + (y+1) + " Tiene este valor: " + valores[y]);
        System.out.println("El cuadro es: " + (Math.pow(valores[y], 2)));
        System.out.println("El cubo es: " + (Math.pow(valores[y], 3)));
    }
}
}