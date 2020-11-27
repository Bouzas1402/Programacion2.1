package Practicas;
import java.util.Scanner;
public class Bucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int j = 99;
for (int i = 1; i <= 5; i++) {
    if(i < 5) {
        System.out.print(i + ",");
        System.out.print(j + ",");
    } else {
        System.out.print(i + ",");
        System.out.print(j);
    }
}
j--;
System.out.println("");
        int i = 1;
while (i <= 10) {
    if (i < 10) {
        System.out.print(i + ",");
    } else {
        System.out.print(i);
    } i++;
}
System.out.println("");
 i = 1;
do {
    if (i < 10) {
        System.out.print(i + ",");
    } else {
        System.out.print(i);
    } i++;
} while (i <= 10);

    }
}
