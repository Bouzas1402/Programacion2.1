package Practicas;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, a = 0, b = 1, c = 0;
        for (i = 0; i < 10; i++);
        { if (i < 9) {
            System.out.print(a + ",");
            c = a + b;
            a = b;
            b = c;
        } else {
            System.out.print(a);
        }
        }


    }
}
