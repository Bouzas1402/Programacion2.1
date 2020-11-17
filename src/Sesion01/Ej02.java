package sesion01;
import java.util.Scanner;
public class Ej02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Introduce un numero: ");
        int n = sc.nextInt();
        System.out.println("Introduce un numero: ");
        int y = sc.nextInt();
        System.out.println("Introduce un numero: ");
        int z = sc.nextInt();
        System.out.println("Introduce un numero: ");
        int x = sc.nextInt();
        int n1 = n++;
        int y1 = y++;
        int z2 = z++;
        int x2 = x++;
        System.out.println("Resultado: " + n + " " + y + " " + z + " " + x);

    }
}
