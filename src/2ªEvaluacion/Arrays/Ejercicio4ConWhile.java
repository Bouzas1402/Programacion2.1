package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4ConWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int num =sc.nextInt();
        int pos = 0;
        int [] array = new int[num];

     while (num >= 0 && pos < array.length) {
         array[pos] = num;
         pos++;
         System.out.println("Introduce el siguien número: ");
         num = sc.nextInt();
     }

        System.out.println(Arrays.toString(array));
    }
}
