package String;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args){
        //Introducir una cadena de caracteres e indicar si es un palíndromo. Una palabra palíndroma es
        //aquella que se lee igual adelante que atrás.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una cadena:");
        String cadena = sc.nextLine();
       boolean mismoTexto = true;
       cadena = cadena.replace(" ","");
       System.out.println(cadena);
        for (int i = 0; i < cadena.length(); i++) {
            int contador = (cadena.length() - 1) - i;
            if (cadena.charAt(i) != cadena.charAt(contador)){
            mismoTexto = false;
            }
            }
        System.out.println("¿Es un palindromo?: " + mismoTexto);
        }
    }

