package Arrays.Dimensionales;

public class Prueba3 {
    public static void main(String[] args){
        int[][][] cubo = new int[3][4][5]; // array tridimensional
        int actual = 1; // almacena un valor para rellenar
        for (int i = 0; i < 3; i++) { // itera por cada array 2D ("tabla" o "matriz")
            for (int j = 0; j < 4; j++) { // itera por cada array 1D array ("vector")
                for (int k = 0; k < 5; k++) { // itera pora cada elemento de un vector
                    cubo[i][j][k] = actual; // asigna un valor a un elemento
                }
            }
            actual++; // obtiene el valor siguiente para la siguiente "matriz"
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(cubo[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
