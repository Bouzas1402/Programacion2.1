package Arrays.HojaEjercicios1;

import java.util.Arrays;

public class Ejercicio11 {
    //Diseñar el algoritmo correspondiente a un programa, que:
    //• Crea una tabla bidimensional de longitud 5x5 y nombre ‘diagonal’.
    //• Carga la tabla de forma que los componentes pertenecientes a la diagonal de la
    //matriz tomen el valor 1 y el resto el valor 0.
    //• Muestra el contenido de la tabla en pantalla.
    public static void main(String[] args){
int [][] diagonal = new int[5][5];

        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[0].length; j++) {
                if (i == j || i + j == 4) {
                    diagonal[i][j] = 1;
                } else { diagonal[i][j] = 0;}
            }
        }
        for (int i = 0; i < diagonal.length; i++) {
            System.out.println(Arrays.toString(diagonal[i]));
        }
    }
}
