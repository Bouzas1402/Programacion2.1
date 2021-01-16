package String;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args){
       // Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a minúsculas y
       // viceversa.
Scanner sc = new Scanner(System.in);
System.out.println("Introduzca una cadena");
String cadena = sc.nextLine();
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isUpperCase(cadena.charAt(i))) {
                char minuscula = cadena.charAt(i);
                System.out.print(Character.toLowerCase(minuscula));
            } else {
                char mayusculas = cadena.charAt(i);
                System.out.print(Character.toUpperCase(mayusculas));
            }
        }
    }
}
