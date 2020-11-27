package Arrays;

public class Prueba1 {
    public static void main(String[] args){
        int i;
        int[] matriz = new int [5];
        matriz [0] = (int) (Math.random() * 100 + 1);
        matriz [1] = (int) (Math.random() * 100 + 1);
        matriz [2] = (int) (Math.random() * 100 + 1);
        matriz [3] = (int) (Math.random() * 100 + 1);
        matriz [4] = (int) (Math.random() * 100 + 1);

        int [] matriz2 = {(int) (Math.random() * 100 + 1),(int) (Math.random() * 100 + 1),(int) (Math.random() * 100 + 1),(int) (Math.random() * 100 + 1),(int) (Math.random() * 100 + 1)};

       System.out.println("Valor del índice 0 = " + matriz[0]);
        System.out.println("Valor del índice 1 = " + matriz[1]);
        System.out.println("Valor del índice 2 = " + matriz[2]);
        System.out.println("Valor del índice 3 = " + matriz[3]);
        System.out.println("Valor del índice 4 = " + matriz[4]);

        System.out.println("_---------------------------_");

         for (i =0; i < matriz2.length; i++){
             System.out.println("Valor del índice " + i + " = " + matriz2[i]);
         }


    }
}
