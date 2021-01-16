package String;
import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Pide una cadena y dos caracteres por teclado (valida que sea un carácter), sustituye la aparición del
        //primer carácter en la cadena por el segundo carácter.
        System.out.println("Introduce una cadena:");
String cadena = sc.nextLine();
System.out.println("Introduce un caracter a sustituir:");
        char caracter1;
        caracter1 = sc.next().charAt(0);
System.out.println("Introduce el caracter que quieres que aparezca:");
        char caracter2;
        caracter2 = sc.next().charAt(0);
        System.out.println(cadena.replace(caracter1,caracter2));
        }
    }

