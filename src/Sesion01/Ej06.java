package sesion01;
import java.util.Scanner;
public class Ej06 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Numero de ardillas:");
      int n = sc.nextInt();
      System.out.println("Numero de nueces: ");
      int k = sc.nextInt();
      int kxn = k / n;
      int ks = k % n;
      System.out.println("Nueces para cada ardilla: " + kxn + "        Nueces restantes: " + ks);
    }
}
