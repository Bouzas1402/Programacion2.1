package Arrays.HojaEjercicios2;

public class Ejercicio7 {
   static int[] A = {0,1,2,3,4,5,6,7,8,9};
    static int[] B = {9,8,7,6,5,4,3,2,1,0};
    static int[] C = {0, 1, 2, 3, 4, 5, 9, 8, 7, 6};
   static int orden;

    public static void main(String[] args) {
    //7. Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los
    //números están ordenados de forma creciente, decreciente, o si están desordenados.
    int resultadoA = comprobarOrden(A);
    int resultadoB = comprobarOrden(B);
    int resultadoC = comprobarOrden(C);
    imprimirResultado(resultadoA);
    imprimirResultado(resultadoB);
  imprimirResultado(resultadoC);
}


    public static int comprobarOrden(int[] array) {
        if (array[0] < array[1]) { //si pasa esto es que es descendente o desordenado
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]){
                orden = 1;
                continue;
            } else {
                orden = 0;
                break;
            }
        }
    } else {
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] > array[i+1]){
                orden = -1;
            } else {
                orden = 0;
            }
        }
    }
        return orden;
}

        public static void imprimirResultado(int orden) {
        if (orden == 0) {
            System.out.println(" esta desordenado");
        } else if (orden == 1) {
            System.out.println(" esta en orden ascendente");
        } else {
            System.out.println(" esta en orden descendente");
        }
        }

}
