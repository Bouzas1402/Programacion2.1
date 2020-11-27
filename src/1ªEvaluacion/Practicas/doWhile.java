package Practicas;
import java.util.Scanner;
public class doWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        do {
            System.out.print(i + "," + (100 - i) + ",");
            i+= 1;
        } while (i <= 5);
    }
}
