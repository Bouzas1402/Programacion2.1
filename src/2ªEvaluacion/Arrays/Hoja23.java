package Arrays;

import java.util.Arrays;

public class Hoja23 {
    public static void main(String[] args){

        int [] c = new int[20];
        for (int i = 0; i < c.length; i++) {
            c[i] = (int) ((Math.random() * 30) - 15);
        }
        System.out.println(Arrays.toString(c));
    }


}

