package Metodos;
import java.util.Scanner;
public class ejemploSobrecarga {
    static Scanner sc = new Scanner(System.in);
//probar los distintos metodos y como los llamamos
    public static void main(String[] args) {
        //Probar metodo 1
        System.out.println("Introduzca lo que quieres imprimir");
        String x = sc.nextLine();
imprimir(x);
        //Probar metodo 2
        System.out.println("Introduzca lo que quieres imprimir");
        String y = sc.nextLine();
        System.out.println("Introduzca las veces que lo quieres imprimir");
int z = sc.nextInt();
sc.nextLine();
imprimir(y,z);

        //Probar metodo 3
        System.out.println("Introduzca lo que quieres imprimir:");
        String y1 = sc.nextLine();
        System.out.println("Introduzca las veces que lo quieres imprimir:");
        int z1 = sc.nextInt();
        sc.nextLine();
imprimir(z1,y1);
        //Probar metodo 4
        System.out.println("Introduzca un numero que quieres imprimir:");
        long x1 = sc.nextInt();
        imprimir((int)x1);
    }


    public static void imprimir(String stringAImprimir) {
        System.out.println(stringAImprimir);

    }

    public static void imprimir(String stringAImprimir, int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println(stringAImprimir);
        }
    }

    public static void imprimir(int veces, String stringAImprimir) {
        for (int i = 0; i < veces; i++) {
            System.out.println(stringAImprimir);
        }
    }

    public static void imprimir(int val) {
        System.out.println(val);
    }

}