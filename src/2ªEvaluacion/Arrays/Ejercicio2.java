package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
        /*Ejercicio 2
Crea una lista e inicializala con 5 cadenas de caracteres leídas por teclado. Copia los
elementos de la lista en otra lista pero en orden inverso, y muestra sus elementos por la
pantalla.*/
        Scanner sc = new Scanner(System.in);
    int j = 4;
String [] array = new String[5];
String [] array2 = new String[5];
        for (int i = 0; i < array.length; i++) {
            array [i] = sc.next();
        }

        /*
        for (int i = 0; i < array.length; i++) {
            array2[j] = array[i];
            j--;
        }
*/
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array[4-i];
        }



        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));


    }
}
