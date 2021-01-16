package String;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Pide una cadena y un carácter por teclado (valida que sea un carácter) y muestra cuantas veces
        //aparece el carácter en la cadena.
        System.out.println("Introduce una cadena:");
        String cadena = sc.nextLine();
        System.out.println("Introduce un caracter:");
char caracter;
caracter = sc.next().charAt(0);
int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
             if (cadena.charAt(i) == caracter) {
                 contador++;
             }
        }
        System.out.println(contador);
    }
}
