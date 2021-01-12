import java.util.Arrays;
public class EjerciciosArrays2 {
    public static void main(String[] args) {
        ejercicio3();
    }

    public static void ajercicio1y2() {

       //1. Leer 5 números y mostrarlos en el mismo orden introducido.
int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random()* 10);
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "");
        }
System.out.println();

        //2. Leer 5 números y mostrarlos en orden inverso al introducido.
        int [] b = new int[5];
        for (int i = 0; i < 5; i++) {
b[i] = a[4 - i];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + "" );
        }

    }
//3. Leer 5 números por teclado y a continuación realizar la media de los números positivos,
//la media de los negativos y contar el número de ceros.
public static void ejercicio3() {
    int [] a = new int[20];
    int sumaNegativos = 0; int contadorNegativos = 0; int sumaPositivos = 0; int contadorPositivos = 0; int contadorCeros = 0;
    for (int i = 0; i < a.length; i++) {
        a[i] = (int) (Math.random() * 30 - 15);
    }
    a [5] = 0;
    a [15] = 0;
    System.out.println(Arrays.toString(a));

    for (int i = 0; i < a.length; i++) {
    if (a[i] < 0){
        sumaNegativos += a[i];
        contadorNegativos++;
    }    else if (a[i] > 0){
        sumaPositivos += a[i];
        contadorPositivos++;
    } else {
        contadorCeros++;
    }
    }
    double mediaPositivos = (double)sumaPositivos/contadorPositivos;
    double mediaNegativos = (double)sumaNegativos/contadorNegativos;
    System.out.println("La media de los numeros positivos es: " + mediaPositivos +"\nLa media de los numeros negativos es: " + mediaNegativos +  "\nEl numero de 0 que han salido son: " + contadorCeros);

    }


}






