package Practicas;
import java.util.Scanner;
public class EJ1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el primer numero: ");
    int variable1 = sc.nextInt();
    System.out.println("Introduce el segundo numero: ");
    int variable2 = sc.nextInt();
    int suma = variable1 + variable2;
    int resta = variable1 - variable2;
    int producto = variable1 * variable2;
    int cociente = variable1 / variable2;
    int resto = variable1 % variable2;
    System.out.println("Variable1 :" + variable1);
    System.out.println("Variable2 :" + variable2);
    System.out.println("Suma: " + suma);
    System.out.println("Resta :" + resta);
    System.out.println("Producto :" + producto);
    System.out.println("Cociente: " + cociente);
    System.out.println("resto :" + resto);
}
}
