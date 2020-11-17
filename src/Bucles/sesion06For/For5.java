package Bucles.sesion06For;
import java.util.Scanner;
public class For5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que tabla quiere?");
        int tabla = sc.nextInt();
        for (int j = 1; j <= tabla; j++) {
            System.out.print("Tabla del " + j + ": ");
            for (int i = 1; i <= 10; i++) {
                System.out.print( j * i + "\t");

            }
            System.out.println("");
        }
    }
}
