package sesion01;
import java.util.Scanner;
public class Prueba3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        float variable1 = sc.nextFloat(); //nextline si fuera texto y otras
        System.out.println("Introduce el segundo número: ");
        float variable2 = sc.nextFloat();
        float suma = variable1 + variable2; //+
        float resta = variable1 - variable2; //-
        float producto = variable1 * variable2; //*
        float cociente = variable1 / variable2; // /
        System.out.println("Variable1: " + variable1);
        System.out.println("Variable2: " + variable2);
        System.out.println("Suma: " + suma);
        System.out.println("Resta " + resta);
        System.out.println("Producto " + producto);
        System.out.println("Cociente " + cociente);

    }
}

