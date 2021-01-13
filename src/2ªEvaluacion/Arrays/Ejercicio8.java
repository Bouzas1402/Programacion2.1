package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Queremos guardar los nombres y la edades de los alumnos de un curso. Realiza un
        //programa que introduzca el nombre y la edad de cada alumno. El proceso de lectura de
        //datos terminará cuando se introduzca como nombre un asterisco (*) Al finalizar se mostrará
        //los siguientes datos:
        //
        //• Todos lo alumnos mayores de edad.
        //• Los alumnos mayores (los que tienen más edad)
int n;
do{
    System.out.println("Alumnos: ");
    n = sc.nextInt();
}while(n <= 0);
sc.nextLine(); //Para meter numeros y String esto es una linea vacia que te "Limpia el escaner".

        String [] nombre = new String[n];
        int[] edades = new int[n];
//con el asterisco propone crear una variable String respuesta; si respuesta = * salir del bucle
        //pido nombre y edades
        //si no tuvieramos la exigencia del asterisco seria asi:
        for (int i = 0; i < n; i++) {
            System.out.println("Nombre:");
            nombre [i] = sc.nextLine(); //Esto lee strings encadenados (Lineas enteras)
            System.out.println(("Edad:"));
            edades [i] = sc.nextInt();
            sc.nextLine();//Seimpre que pedimos valores por teclado que combinen numeros y String metemos esta linea
        }
        System.out.println(Arrays.toString(nombre));
        System.out.println(Arrays.toString(edades));
    }
}
