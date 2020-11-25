package Bucles.sesion07While.DoWhile;

public class Ejercicio52 {
    public static void main(String[] args){
    int i = 0;
    int j = 0;
    int numero = 1;
    while (i < 5) {
        while (j < 10) {
            if ((numero % 5) == 0) {
                System.out.print(numero + "\t");
            j++;
            numero++;
            } else {
numero++;
            }
        }
System.out.println("");
        i++;
        j = 0;
    }
}
}
