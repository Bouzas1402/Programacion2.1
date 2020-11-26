package Practicas;
import java.util.Scanner;
public class Ejercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 15;
        System.out.println(A + (A%2==0 ? " es par " : " es impar "));
    }
}
