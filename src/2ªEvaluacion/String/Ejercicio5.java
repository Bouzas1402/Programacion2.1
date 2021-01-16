package String;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
        //Si tenemos una cadena con un nombre y apellidos, realizar un programa que muestre las iniciales en
        //mayúsculas.
System.out.println("Introduzca nombre y apellidos");
String nombreApellidos = sc.nextLine();
        char iniciales = Character.toUpperCase(nombreApellidos.charAt(0));
        System.out.print(iniciales);
        for (int i = 0; i < nombreApellidos.length(); i++) {
            if (nombreApellidos.charAt(i) == ' ') {
                iniciales = Character.toUpperCase(nombreApellidos.charAt(i + 1));
                System.out.print(iniciales);
            }
        }
    }
    }

