package Arrays.Dimensionales;
import java.util.Arrays;
public class Prueba2 {
    public static void main(String[] args){

        int[][] matriz = new int[3][];
        matriz[0] = new int[] { 1, 2, 3, 4 }; // longitud 4
        matriz [1] = new int[] { 5, 7, 3}; // longitud 3
        matriz [2] = new int[] { 8 }; // longitud 1
// imprimimos la matriz
        for (int i = 0; i < matriz.length; i++) {  //Es la manera de imprimirlos, otra es con un for anidado, que es mucho mas comun.
            System.out.println(Arrays.toString(matriz[i])); //Esto significa que imprima la matriz de la posicion i, de todas las otras matrices.
        }
    }
}
