package sesion01;
import java.util.Scanner;
public class Ej01 {
    public static void main(String[] args) {
        boolean b = true;
        System.out.println(!b);

        boolean v1 = true;
        boolean v2 = true;
        boolean v3 = false;
        System.out.println(v1 && v2);
        System.out.println(v2 && v1);
        System.out.println(v3 ^ v2);
        int m1 = 3;
        int m2 = 8;
        System.out.println(m2 != m1);
        System.out.println(m1 >= m2);
    }
}
