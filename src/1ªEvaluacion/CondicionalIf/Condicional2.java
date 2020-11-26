import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 9_000) {
            System.out.println("Debe pagar impuestos");
        } else {
            System.out.println("No debe pagar impuestos");
        }
    }
}
