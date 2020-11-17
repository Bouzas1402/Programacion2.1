package Bucles.sesion06For;



public class For6 {
    public static void main(String[] args){
        int i;
        int suma = 0;
        long producto = 1;
        for (i = 1; i <= 30; i++){
            suma = suma + i;
            producto = producto * (long)i;

        }
System.out.println(suma);
        System.out.println(producto);
    }
}
