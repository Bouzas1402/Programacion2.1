package Arrays;
import java.util.Scanner;
public class ForItEnClase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 3, 4, 5, 6, 7};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        //creo una vriable (elem) que va a recorrer todos los elementos.
        for (int elem:array){
            System.out.println(elem + " "); //imprimo la variable
        }
    }
}
