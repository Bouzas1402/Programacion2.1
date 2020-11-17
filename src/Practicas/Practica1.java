package Practicas;
import java.util.Arrays;
import java.util.Scanner;
public class Practica1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Momento inicial: ");
        System.out.println("================");
        System.out.println("Introduce la hora: ");
        int hora1 = sc.nextInt();
        System.out.println("Introduce los minutos: ");
        int minuto1 = sc.nextInt();
        System.out.println("Introduce los segundos: ");
        int segundo1 = sc.nextInt();

        System.out.println("\nMomento final: ");
        System.out.println("================");
        System.out.println("Introduce la hora: ");
        int hora2 = sc.nextInt();
        System.out.println("Introduce los minutos: ");
        int minuto2 = sc.nextInt();
        System.out.println("Introduce los segundos: ");
        int segundo2 = sc.nextInt();
int DHs = (((hora2 * 60) + minuto2) * 60 + segundo2) - (((hora1 * 60) + minuto1) * 60 + segundo1);
int DS = DHs % 60;
int DM = (DHs / 60) % 60;
int DH = (DHs / 60)/60;
        System.out.println("Datos introducidos: momento inicial: " + hora1 + ":" + minuto1 + ":" + segundo1 +
                "     momento final: " + hora2 + ":" + minuto2 + ":" + segundo2);
        System.out.println("\n\nLa diferencia entre ambos momentos es: " + DH + ":" + DM + ":" + DS);
    }
} /*  switch (lenguajeJava) {
                            case 1:
                                System.out.println("SI");
                                break;
                            case 2 ,3 ,4:
                                System.out.println("NO");
                                break;
                            default:
                                System.out.println("Número desconocido.");
                                break;
                        }
                    else {
                        System.out.println("El lenguaje señalado no forma parte de los lenguajes requeridos.");}
                        break;
                         if (lenguajeJava == "a") {
                        System.out.println("¡SI!");
                        } else if (lenguajeJava == "b","c","d") {
                            System.out.println("¡NO!");
                    } else {
                        System.out.println("Número desconocido.");}*/
