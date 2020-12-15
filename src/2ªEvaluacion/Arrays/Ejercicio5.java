package Arrays;
import java.util.Arrays; //significa que la clase Arrays la estoy importando de la libreria java.util
public class Ejercicio5 {
    public static void main(String[] args){
        /* Hacer un programa que inicialice una lista de números con valores aleatorios (10 valores), y
posterior ordene los elementos de menor a mayor.*/
int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros [i] = (int)(Math.random() * 100);
        }
        System.out.println(Arrays.toString(numeros));
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "\t");
        }
        System.out.println();
        /*Utilizamos el metodo sort() de la clase Arrays*/
Arrays.sort(numeros);
System.out.println(Arrays.toString(numeros));
    }
}
