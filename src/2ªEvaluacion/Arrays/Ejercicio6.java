package Arrays;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        /*Crea un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y
diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar listas. Para
simplificarlo vamos a suponer que febrero tiene 28 días.*/
        Scanner sc = new Scanner(System.in);
        int mes = 0;
        int [] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        do {
            System.out.println("Introduzca el numero del mes: (del 1 al 12)");
            mes = sc.nextInt();
            if (mes > 0 && mes <= dias.length)
            System.out.println("El mes " + mes + " tiene " + dias[mes - 1] + " dias");
        } while (mes < 1 || mes > dias.length);
    }
}
