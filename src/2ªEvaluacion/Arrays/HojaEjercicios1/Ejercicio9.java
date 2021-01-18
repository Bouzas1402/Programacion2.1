package Arrays.HojaEjercicios1;
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio9 {

    public static void main(String[] args){
//Queremos guardar la temperatura mínima y máxima de 5 días. Realiza un programa que de
//la siguiente información:
//
//• La temperatura media de cada día
//• Los días con menos temperatura
//• Se lee una temperatura por teclado y se muestran los días cuya temperatura
//máxima coincide con ella. si no existe ningún día se muestra un mensaje de
//información.
        Scanner sc = new Scanner(System.in);
        int[] temperaturaMaxima = new int[5];
        int[] temperaturaMinima = new int[5];
        int[] temperaturaMedia = new int[5];
        for (int i = 0; i < temperaturaMaxima.length; i++) {
        int contador = 1;
System.out.println("Introduzca la temperatura maxima del dia " + contador + ":");
int temperaturaMaximaDia = sc.nextInt();
 temperaturaMaxima[i] = temperaturaMaximaDia;
        System.out.println("Introduzca la temperatura minima del dia " + contador + ":");
        int temperaturaMinimaDia = sc.nextInt();
            temperaturaMinima[i] = temperaturaMinimaDia;

            temperaturaMedia[i] = (temperaturaMaximaDia + temperaturaMinimaDia) / 2;
        contador++;
        
    }
       System.out.println("Temperatura dia: \t UNO \t DOS \t TRES \t CUATRO \t CINCO");
        System.out.print("Maxima");System.out.print(Arrays.toString(temperaturaMaxima));
        System.out.println("");System.out.print("Minima");System.out.print(Arrays.toString(temperaturaMinima));
        System.out.println("");System.out.print("Media");System.out.print(Arrays.toString(temperaturaMedia));
        int valorEnMinima = 0;
        for (int i = 0; i < temperaturaMinima.length; i++) {
            int contadorMinimas = 100;
            
            if (temperaturaMinima[i] < contadorMinimas) {
                contadorMinimas = temperaturaMinima[i];
                valorEnMinima = i;
            }
        }
        int valorEnMinima2 = 0;
        for (int i = 0; i < temperaturaMinima.length; i++) {
            int contadorMinimas2 = 100;


            if ((temperaturaMinima[i] > temperaturaMinima[valorEnMinima]) && (temperaturaMinima[i] < contadorMinimas2))
       contadorMinimas2 = temperaturaMinima[i];
            valorEnMinima2 = i;
        }


        System.out.println("Las dias con temperaturas mas bajas han sido:\n" +
                "El dia " + (valorEnMinima + 1) + ": " + temperaturaMinima[valorEnMinima] + "º\n" +"El dia " + (valorEnMinima2 + 1) + ": " + temperaturaMinima[valorEnMinima2] + "º");
        
        
    }
}
