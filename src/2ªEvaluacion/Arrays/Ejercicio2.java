package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    int j = 4;
int [] array = new int[5];
int [] array2 = new int[5];
        for (int i = 0; i < array.length; i++) {
            array [i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            array2[j] = array[i];
            j--;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}
