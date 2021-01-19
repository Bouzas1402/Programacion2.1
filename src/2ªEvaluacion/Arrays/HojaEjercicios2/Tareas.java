package Arrays.HojaEjercicios2;
import java.util.Scanner;
import java.util.Arrays;
public class Tareas {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }


    public static void menu() {
        boolean siONo = true;
        do {
            System.out.println("¿Qué ejercicio desea hacer?:" +
                    "\n1.Leer y mostrar en orden introducido:" +
                    "\n2.Leer y mostar en orden inverso:" +
                    "\n3.Leer y hacer medias:" +
                    "\n4.Leer y reordenarlos:" +
                    "\n5.Reoordenar 2 listas en otra:" +
                    "\n6.Extraer una subcadena:" +
                    "\n7." +
                    "\n8." +
                    "\n9." +
                    "\n10." +
                    "\n11." +
                    "\n12.");
            int ejercicio = sc.nextInt();
            switch (ejercicio) {
                case 1:
                    Ejercicio1();
                    siONo = false;
                    break;
                case 2:
                    Ejercicio2();
                    siONo = false;
                    break;
                case 3:
                    Ejercicio3();
                    siONo = false;
                    break;
                case 4:
                    Ejercicio4();
                    siONo = false;
                    break;
                     case 5:
Ejercicio5();
                     siONo = false;
                    break;
                    case 6:
Ejercicio6();
                    siONo = false;
                    break;
                  /*  case :

                    siONo = false;
                    break;*/
                default:
                    System.out.println("Valor no valido,prueba de nuevo");

            }
            sc.nextLine();
        } while (siONo);
    }

    public static void Ejercicio1() {
        //1. Leer 5 números y mostrarlos en el mismo orden introducido.
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("introduce un número:");
            numeros[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(numeros));
    }

    public static void Ejercicio2() {
//2. Leer 5 números y mostrarlos en orden inverso al introducido.
        int[] numeros = new int[5];
        int[] numeros2 = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("introduce un número:");
            numeros[i] = sc.nextInt();
        }
        sc.nextLine();
        System.out.println(Arrays.toString(numeros));
        for (int i = 0; i < 5; i++) {
            numeros2[i] = numeros[4 - i];
        }
        System.out.println(Arrays.toString(numeros2));
    }

    public static void Ejercicio3() {
        //3. Leer 5 números por teclado y a continuación realizar la media de los números positivos,
        //la media de los negativos y contar el número de ceros.
        int[] numeros = new int[5];
        int sumaNegativos = 0;
        int sumaPositivos = 0;
        int contadorPositivos = 1;
        int contadorNegativos = 1;
        int contadorCeros = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número:");
            numeros[i] = sc.nextInt();
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                contadorPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }
        long mediaPositivos = (long) sumaPositivos / contadorPositivos;
        long mediaNegativos = (long) sumaNegativos / contadorNegativos;
        System.out.println("le madia de numeros positivos es: " + (mediaPositivos) + "\nLa media de los numeros negativos es: " + (mediaNegativos) + "\nLa cantidad de ceros que hay es :" + contadorCeros);
    }
    public static void Ejercicio4() {
//4. Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el
//último, el segundo, el penúltimo, el tercero, etc.
        int[] numeros = new int[10];
       int contador = 0;
        int contador2 = (numeros.length - 1);
        for (int i = 0; i < numeros.length;) {
            System.out.println("Introduce un numero:");
            numeros [i] = sc.nextInt();
            i += 2;
        }
        for (int i = (numeros.length - 1); i > 0;) {
System.out.println("Introduce un numero:");
numeros [i] = sc.nextInt();
i -= 2;
        }
        System.out.println(Arrays.toString(numeros));



char [] A = {'a','b','c','d','e','f','g','h','i','j'};
        for (int i = 0; i < 5; i++) {
            System.out.print(A[i] + " " + A[(A.length - 1) - i] + " ");
        }
    }

public static void Ejercicio5() {
        //5. Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la
    //forma: el 1o de A, el 1o de B, el 2o de A, el 2o de B, etc.
        int [] numeros1 = new int[10];
        int [] numeros2 = new int[10];
        int [] numeros3 = new int[20];
    for (int i = 0; i < numeros1.length; i++) {
        System.out.println("introduce un numero para la primera lista:");
        numeros1 [i] = sc.nextInt();
    }
    for (int i = 0; i < numeros2.length; i++) {
        System.out.println("introduce un numero para la segunda lista:");
        numeros2 [i] = sc.nextInt();
    }
    int contadorLista1 = 0;
    int contadorLista2 = 0;
    for (int i = 0; i < 20; i++) {
        if (i % 2 == 0) {
            numeros3 [i] = numeros1[contadorLista1];
contadorLista1 += 1;
        } else {
            numeros3 [i] = numeros2[contadorLista2];
            contadorLista2 += 1;
        }
    }
    System.out.println(Arrays.toString(numeros1));
    System.out.println(Arrays.toString(numeros2));
    System.out.println(Arrays.toString(numeros3));

    /*
    * char [] A = {'A','B','C','D','E','F','G','H','I','J'}
    * char [] B = {'a','b','c','d','e','f','g','h','i','j'}
    *
    *
    * */
}

public static void Ejercicio6() {
        //6. Leer los datos correspondiente a dos tablas de 12 elementos numéricos, y mezclarlos en
        //una tercera de la forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.
      int[] tabla1 = new int[12];
      int[] tabla2 = new int [12];
      int[] tabla3 = new int[24];
    for (int i = 0; i < tabla1.length; i++) {
        System.out.println("introduce un numero para la primera lista:");
        tabla1 [i] = sc.nextInt();
    }
    for (int i = 0; i < tabla2.length; i++) {
        System.out.println("introduce un numero para la segunda lista:");
        tabla2 [i] = sc.nextInt();
    }
    boolean cambio = true;
    int contador = 0;
    int contadorTabla1 = 0;
    int contadorTabla2 = 0;
    for (int i = 0; i < tabla2.length; i++) {
        if (cambio == true) {
tabla3 [i] = tabla1[contadorTabla1];
        } else {
tabla3 [i] = tabla2[contadorTabla2];
        }
        if (contador == 3) {
            cambio = !cambio;
    }
}
    System.out.println(Arrays.toString(tabla1));
    System.out.println(Arrays.toString(tabla2));
    System.out.println(Arrays.toString(tabla3));
    }


}