package Arrays;

public class PruebaClase4 {
    public static void main(String[] args){
     int contador = 0;
     char [] caracteres = {'a', 'b', 'c', 'a', 'b', 'c', 'a', 't', 'a', 'u', 'a', 'a'};
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == 'a')
                contador++;
        }
        System.out.println(contador);
    }
}
