package Arrays.HojaEjercicios1;
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
        int contadorEdad = 0;
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
        String respuesta;
        for (int i = 0; i < n; i++) {
            System.out.println("Nombre:");
            respuesta = sc.nextLine(); //Esto lee strings encadenados (Lineas enteras)
            if (respuesta.equals("*")) {
                break; } else {
                nombre[i] = respuesta;
            }
             //si quiero comparar dos string pongo el string.equals y el string que quiero comparar
            System.out.println(("Edad:"));
            edades [i] = sc.nextInt();
            sc.nextLine();//Siempre que pedimos valores por teclado que combinen numeros y String metemos esta linea
        }
System.out.println("Alumnos con mayoria de edad:");
        for (int i = 0; i < n; i++) {
            if (edades [i] >= 18){
                System.out.println(nombre[i] + "(" + edades[i] + ").");
            }
        }
        //Alinear edades
        int maximo = edades[0];
        int pos = 0;
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] > maximo){
                maximo = edades[i];
                        pos = i;
            }
        }
        System.out.println("Alumno de mas edad: " + nombre[pos] + " edad: " + maximo);
        System.out.println(Arrays.toString(nombre));
        System.out.println(Arrays.toString(edades));
    }
}

