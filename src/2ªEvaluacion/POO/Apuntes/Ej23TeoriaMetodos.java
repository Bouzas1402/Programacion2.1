package POO.Apuntes;
import java.util.*;
import java.util.Scanner;
public class Ej23TeoriaMetodos {
static Scanner sc = new Scanner(System.in);
    /*Escribe un método llamado sumarValorPorÍndice. El método debe recibir un array de longs y
sumar el valor el elemento especificado por el índice. Parámetros que recibe: un array de
longs, el índice de un elemento (int) y el valor a sumar (long). El método no devuelve ningún
valor. La siguiente invocación debería funcionar correctamente:
sumarValorPorÍndice(array, índice, valor);*/


// escribe aquí el método
    public static void sumarValorPorIndice(long[] array, int indice, long valorASumar) {  //Esto es la signatura del metodo
array[indice] = array[indice] + valorASumar;
    }



        public static void main(String[] args) {
            int n;
            do {
                System.out.println("Tamaño del array: ");
                n = sc.nextInt();
            } while (n <= 0);
            long[] numeros = new long[n];
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (long) (Math.random() * 100 - 50);
            }
            System.out.println(Arrays.toString(numeros));
            sumarValorPorIndice(numeros, 15, 1000);
            System.out.println(Arrays.toString(numeros));
        }
    }

