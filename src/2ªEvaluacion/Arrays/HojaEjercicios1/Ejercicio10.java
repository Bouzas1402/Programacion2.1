package Arrays.HojaEjercicios1;
import java.util.Arrays;
public class Ejercicio10 {
    public static void main(String[] args){
        /*Diseñar el algoritmo correspondiente a un programa, que:
• Crea una tabla (lista con dos dimensiones) de 5x5 enteros.
• Carga la tabla con valores numéricos enteros.
• Suma todos los elementos de cada fila y todos los elementos de cada columna
visualizando los resultados en pantalla.*/
       int[][] tabla = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tabla[i][j]= (int)(Math.random() *10);
            }
            System.out.println(Arrays.toString(tabla[i]));
        }
        System.out.println();
        for (int i = 0; i < tabla.length; i++) {
            System.out.println(Arrays.toString(tabla[i]));
        }

        int [] sumaFila = new int[5];
        int [] sumColumna = new int[5];


        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                sumaFila [i] += tabla [i][j];
            }
        } System.out.println("\n" + Arrays.toString(sumaFila) + "\n");
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                sumColumna [i] += tabla [j][i];
            }
        } System.out.println(Arrays.toString(sumColumna));
    }
}
