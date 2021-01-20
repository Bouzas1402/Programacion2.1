package Practicas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class practicaArrays {

    public static void main(String[] args){

        int [] baraja1 = new int[40];
        int [] baraja2 = new int[40];
       int palos = 1;
        for (int i = 0; i < baraja1.length; i++) {
            baraja1 [i] = palos;
                if (palos == 10) {
                    palos = 0;
                }
                palos++;
            }
        for (int i = 0; i < baraja2.length; i++) {
            baraja2 [i] = palos;
            if (palos == 10) {
                palos = 0;
            }
            palos++;
        }





  /*      System.out.println(Arrays.toString(baraja1));
        for (int i = 0; i < baraja1.length; i++) {
int s = (int) (Math.random() * (39 - i));
baraja1 [s] = baraja1 [i];
        }
System.out.println(Arrays.toString(baraja1));
*/
        }
    }

