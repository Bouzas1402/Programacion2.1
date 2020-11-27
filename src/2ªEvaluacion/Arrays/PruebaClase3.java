package Arrays;

import java.util.Scanner;

public class PruebaClase3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] array = {1, 3, 4, 6, 8, 12};

        boolean ordenado = true;
//si no cambiamos el length con -1 llegaria un momento que me intentaria
// iterar sobre una posicion del array que no existe (en este caso el 6)
        //Es decir campararia el array[5] con el array[6] que no existe.
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                ordenado = false;
                break;
            }
        }

        if (ordenado == true)
            System.out.println(("ORDENADO"));
        else
            System.out.println("DESORDENADO");
      //Si solo es una ionstruccion se pueden omitir los corchetes del if
    }
}
