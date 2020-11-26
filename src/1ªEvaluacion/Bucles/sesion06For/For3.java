package Bucles.sesion06For;
import java.util.Scanner;
public class For3 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un numero: ");
        int menor = sc.nextInt();
        System.out.println("Escriba otro numero, tiene que ser mayor al anterior: ");
int mayor = sc.nextInt();
for(i = menor; i <= mayor; i++){
    menor++;
    System.out.println(menor + "+" + (menor + 1) + " = " + (menor + (menor + 1)));
}

    }
}
