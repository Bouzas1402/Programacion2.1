package Arrays.Dimensionales;

import java.util.Arrays;

public class Prueba1 {
    public static void main(String[] args){

        int[][] matriz = {
                {1, 2, 3, 1}, // primer array de enteros
                {3, 4, 1, 2}, // segundo array de enteros
                {4, 4, 1, 0} // tercer array de enteros
        };
        System.out.println(Arrays.toString(matriz)); //no funciona el metodo toString
   System.out.println(matriz.length); //Mide el numero de arrays de un arrays bidimensional

  System.out.println(matriz[1][2]); //Me coge el elemento 2 (empieza en 0, seria el 3º) de la matriz 1 (empieza en 0 asi que la 2º arrays)
    }
}
