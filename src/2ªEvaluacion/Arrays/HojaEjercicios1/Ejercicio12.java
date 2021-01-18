package Arrays.HojaEjercicios1;
import java.util.Arrays;
public class Ejercicio12 {
    public static void main(String[] args){
       //• Carga la tabla con dos únicos valores 0 y 1, donde el valor uno ocupará las
        //posiciones o elementos que delimitan la tabla, es decir, las más externas, mientras
        //que el resto de los elementos contendrán el valor 0.
        //111111111111111
        //100000000000001
        //100000000000001
        //100000000000001
        //111111111111111
        //• Visualiza el contenido de la matriz en pantalla.
int[][] marco = new int[5][15];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                if (j == 0 || i == 0 || i == 4 || j == 14) {
                    marco[i][j] = 1;
                } else {
                    marco[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < marco.length; i++) {
            System.out.println(Arrays.toString(marco[i]));
        }
    }
}
