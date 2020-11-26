package Practicas;
import java.util.Scanner;
public class EJercicios2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = (3 * a - 2 * b) % (2 * a - c);
        System.out.print(n);

    }
}
