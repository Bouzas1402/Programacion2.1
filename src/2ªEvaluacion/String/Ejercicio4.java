package String;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int contador = 1;
        //Suponiendo que hemos introducido una cadena por teclado que representa una frase (palabras
//separadas por espacios), realiza un programa que cuente cuantas palabras tiene.
        System.out.println("Intruduce un cadena de texto:");
        String cadena = sc.nextLine();
        cadena = cadena.trim();
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' '){
                contador++;
            }
        }
System.out.println(contador);
    }
}
