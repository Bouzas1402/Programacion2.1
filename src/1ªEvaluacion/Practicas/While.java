package Practicas;
import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i <= 34){

            System.out.print(i + ",");
            i+= i;
        }

    }

}
