package String;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//Realizar un programa que, dada una cadena de caracteres, genere otra cadena resultado de invertir
//la primera.
        System.out.println("Introduzca una cadena de caracteres:");
        String cadena = sc.nextLine();
      for (int i = cadena.length() - 1; i >= 0; i--) {
          System.out.print(cadena.charAt(i));
        }
    }
}
