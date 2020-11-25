package Bucles.sesion07While.DoWhile;

public class Ejercicio62 {
    public static void main(String[] args){
    int i;
    int j = 0;
     int multiplo = 0;

     while (multiplo <= 125){
         multiplo = 1;
         j++;
for (i = multiplo; i <= j; i++){
    multiplo = multiplo + i;

         }


     }
System.out.println(j);

}
}