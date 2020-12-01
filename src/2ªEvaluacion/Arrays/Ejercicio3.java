package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
double notaMax = 0;
double notaMin = 10;
double notaMedia = 0;
        /*Ejercicio 3
Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno
(comprendidas entre 0 y 10). A continuación debe mostrar todas las notas, la nota media, la
nota más alta que ha sacado y la menor.*/
        Scanner sc = new Scanner(System.in);
double[] notas = new double[5];

        for (int i = 0; i < notas.length; i++) {
            notas[i] = Math.random() * 10;
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("%.2f ", notas[i]); //Esto es para que muestre solo dos decimales (eso lo dice el numero 2), despues una coma y despues el valor q ue quiero que muestre con dos decimales)
        }

        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        notaMedia = suma / notas.length;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < notaMin){
                notaMin = notas[i];
            }
            if (notas[i] > notaMax){
                notaMax = notas[i];
            }

        }

        System.out.println("Notas alumno:         Nota Maxima:         Nota Minima:         Nota Media");
        System.out.printf("%.2f", Arrays.toString(notas));
  System.out.printf("%.2f", notaMax);
        System.out.printf("%.2f", notaMin);
        System.out.printf("%.2f", notaMedia);
    }
}
