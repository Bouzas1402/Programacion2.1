package sesion01;
import java.util.Scanner;
public class Pruebravariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1º Numero: ");
        float a = sc.nextFloat();
        System.out.println("2º Numero: ");
        float b = sc.nextFloat();
        System.out.println("3º Numero: ");
        float c = sc.nextFloat();
        boolean x = a >= b && b >= c;
        //System.out.println("Orden: " + x);
        if (x == true) {
            System.out.println("Los numeros estan ordenados");
            //instrucciones
        } else {
            System.out.println("Los numeros no estan ordenados");
            //otras instrucciones
        }

    }

}
