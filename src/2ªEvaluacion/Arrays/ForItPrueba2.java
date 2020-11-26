package Arrays;
import java.util.Scanner;
public class ForItPrueba2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] paises = new String[8];
for (int i = 0; i < paises.length; i++) {
    System.out.print("Introduce valor: ");
    paises[i] = sc.next();
}
System.out.println("--------------------------");
for (String i:paises) {
    System.out.println("País: " + i);
}

    }
}