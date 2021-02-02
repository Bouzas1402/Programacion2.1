package String;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
        //Realizar un programa que comprueba si una cadena leída por teclado comienza por una subcadena
        //introducida por teclado.
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una cadena de texto:");
        String cadena1 = sc.nextLine();
        System.out.println("Escribe una cadena de texto:");
        String cadena2 = sc.nextLine();
        boolean empiezaPor = cadena1.toLowerCase().startsWith(cadena2.toLowerCase());
        System.out.println(empiezaPor);
    }
}
