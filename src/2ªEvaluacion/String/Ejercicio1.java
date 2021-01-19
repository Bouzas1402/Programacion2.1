package String;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args){
        //Escribir por pantalla cada carácter de una cadena introducida por teclado.
Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una cadena de texto:");
String cadena = sc.nextLine();
        for (int i = 0; i < cadena.length(); i++) {
            System.out.print(" " + cadena.charAt(i) + " ");
        }
    }
}
