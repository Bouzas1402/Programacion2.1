package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Prueba2Clase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] array =new int[5]; //Indice de 0 a 4, es decir 5 huecos.
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el numero");
            array[i] = sc.nextInt();
        }
     System.out.println(Arrays.toString(array));


        int [] cuadrados = new int[10];

        for (int i = 0; i < cuadrados.length; i++) {
            cuadrados[i] = i * i;
        }

        for (int i = 0; i < cuadrados.length; i++) {
          System.out.print(cuadrados[i] + " - ");
        }

    }
}
