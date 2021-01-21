package Practicas;

import java.util.Arrays;

public class pueba {
    public static void main(String[] args) {



        int [] x = new int[40];

int z = 0;

         int aleatorio;
x[0] = (int) (Math.random() * 40 + 1);
        for (int i = 1; i < x.length; i++) {

            aleatorio = (int) (Math.random() * 39);

        for (int j = i; j >= 0; j--) {

            if (x[j] == aleatorio){
                z++;
            }

        }
            if (z == 1) {
                --i;
                continue;
            } else {
                x[i] = aleatorio;
            }
            z = 0;
    }

        System.out.println(Arrays.toString(x));
    }
}