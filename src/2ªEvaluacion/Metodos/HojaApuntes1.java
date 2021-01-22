package Metodos;

import java.util.Scanner;

public class HojaApuntes1 {
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       //Ejercicio 1:
        printSum(123,(int) 88L); //hay que hacer casting explicito, el 1 numero hace automatico un casting implicito
        printSum(123L, (int)88L); //hay que hacer casting explicito
        printSum(123L,13); //correcta
        printSum(123,13);  //correcta

        //Ejercicio 3:
        System.out.println(calcularArea(6,8));

        //Ejercicio 4:
        System.out.println(Math.pow(3,4));

        // Ejercicio 5:
        /* int casa = 0;
        int direccion = casa.getDireccion();*/

        //Ejercicio 6:
// La b y la c son falsas

        // Ejercicio 7:
        // encuentraNemo(); //es un metodo estatico que le puedes llamar sin invocar un objeto

        //Ejercicio8: //La d. void.

        //Ejercicio 9:

        //Ejercicio 10:
        System.out.println("Introduzca un numero:");
        int n = sc.nextInt();
        System.out.println(signo(n));

        //Ejercicio 11:
        System.out.println("Introduzca un valor desde el que empezar:");
        int x = sc.nextInt();
        System.out.println("Introduzca un valor donde terminar:");
        int y = sc.nextInt();
        System.out.println(sumaEnRango(x,y));

        //Ejercicio 12: La respues correcta es la b.

        //Ejercicio 18:
        System.out.println("Introduzca un numero:");
        int y4 = sc.nextInt();
       System.out.println(getMaxMenosValorI(y4));
    }
    //Preguntas y ejercicios: 1.
    public static void printSum(long val1, int val2) {
        System.out.println(val1 + val2);
    }

    //Preguntas y ejercicios: 2.
    // Las opciones correctas son la d.readLine, e.kitty y f.finUser
    // a. e sincorrecta por que tiene numeros, la b. por que la convencion sobre
    //los nombres nos dice que es de buen estilo que solo la primera letra de
    // la segunda pàlabra en adelante este en mayusculas, la tercera, aunque $ es correcto no//
    // recomiendan usarlo.

    // Preguntas y ejercicios: 3. Metodo para calcular el area
    public static double calcularArea (double b, double a){
        double area = b * a;
return area;
    }

     //Preguntas y ejercicios: 4 invoca el metodo pow();

    //Preguntas y ejercicios: 5
public int getDirection (int a) {
        return a;
}

//Ejercicio 10: Escribe un método de nombre signo que reciba un número entero y compruebe si el número
//es negativo, positivo o cero. El método debe devolver -1, 1 o 0, respectivamente.
public static int signo(int numero) {
        if (numero < 0) {
            return -1;
        } else if (numero > 0) {
            return 1;
        } else {
            return 0;
        }
}

//Ejercicio 11:Implementa el método sumaEnRango para calcular la suma de números en el rango que va
//desde un número (inclusive) a otro (no inclusive) pasados como parámetro.
public static long sumaEnRango (int desde, int hasta) {
long suma = 0;
    for (long i = desde; i < hasta; i++) {
        suma = suma + i;
    }
return suma;
}

//Ejercicio 18:
public static long getMaxMenosValorL(long val) {
    return Long.MAX_VALUE - val;
}
    public static int getMaxMenosValorI(int val) {
        return Integer.MAX_VALUE - val;
    }

}
