package String;
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args){
    //Realizar un programa que compruebe si una cadena contiene una subcadena. Las dos cadenas se
    //introducen por teclado.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una cadena");
        String cadena1 = sc.nextLine();
        System.out.println("Introduzca otra cadena");
        String cadena2 = sc.nextLine();
        boolean coincidenciaONo = cadena1.contains(cadena2);
        System.out.println("¿Contiene la primera cadena a la segunda?:\n" + coincidenciaONo);
}
}
