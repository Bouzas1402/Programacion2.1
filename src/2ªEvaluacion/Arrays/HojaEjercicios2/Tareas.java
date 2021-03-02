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
                case 7:
                    Ejercicio7();
                    siONo = false;
                    break;
                case 8:
                    Ejercicio8();
                    siONo = false;
                    break;
                    case 9:
Ejercicio9();
                    siONo = false;
                    break;
                     case 10:
Ejercicio10();
                    siONo = false;
                    break;
                    case 11:
Ejercicio11();
                    siONo = false;
                    break;
                   /*  case :

                    siONo = false;
                    break;
                    case :

                    siONo = false;
                    break;
                    case :

                    siONo = false;
                    break;
                    case :

                    siONo = false;
                    break;
                    case :

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
        for (int i = 0; i < numeros.length; ) {
            System.out.println("Introduce un numero:");
            numeros[i] = sc.nextInt();
            i += 2;
        }
        for (int i = (numeros.length - 1); i > 0; ) {
            System.out.println("Introduce un numero:");
            numeros[i] = sc.nextInt();
            i -= 2;
        }
        System.out.println(Arrays.toString(numeros));


        char[] A = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        for (int i = 0; i < 5; i++) {
            System.out.print(A[i] + " " + A[(A.length - 1) - i] + " ");
        }
    }

    public static void Ejercicio5() {
        //5. Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la
        //forma: el 1o de A, el 1o de B, el 2o de A, el 2o de B, etc.
        int[] numeros1 = new int[10];
        int[] numeros2 = new int[10];
        int[] numeros3 = new int[20];
        for (int i = 0; i < numeros1.length; i++) {
            System.out.println("introduce un numero para la primera lista:");
            numeros1[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println("introduce un numero para la segunda lista:");
            numeros2[i] = sc.nextInt();
        }
        int contadorLista1 = 0;
        int contadorLista2 = 0;
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                numeros3[i] = numeros1[contadorLista1];
                contadorLista1 += 1;
            } else {
                numeros3[i] = numeros2[contadorLista2];
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
        int[] tabla2 = new int[12];
        int[] tabla3 = new int[24];
        for (int i = 0; i < tabla1.length; i++) {
            System.out.println("introduce un numero para la primera lista:");
            tabla1[i] = sc.nextInt();
        }
        for (int i = 0; i < tabla2.length; i++) {
            System.out.println("introduce un numero para la segunda lista:");
            tabla2[i] = sc.nextInt();
        }
        boolean cambio = true;
        int contador = 0;
        int contadorTabla1 = 0;
        int contadorTabla2 = 0;
        for (int i = 0; i < tabla2.length; i++) {
            if (cambio == true) {
                tabla3[i] = tabla1[contadorTabla1];
            } else {
                tabla3[i] = tabla2[contadorTabla2];
            }
            if (contador == 3) {
                cambio = !cambio;
            }
        }
        System.out.println(Arrays.toString(tabla1));
        System.out.println(Arrays.toString(tabla2));
        System.out.println(Arrays.toString(tabla3));
    }

    public static void Ejercicio7() {
        //7. Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los
        //números están ordenados de forma creciente, decreciente, o si están desordenados.
        int[] A = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] B = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] C = {0, 1, 2, 3, 4, 5, 9, 8, 7, 6};
        int orden;
        if (A[0] < A[1]) { //si pasa esto es que es descendente o desordenado
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i] < A[i + 1]) {
                    orden = 1;
                    continue;

                } else {
                    System.out.println("Esta desordenada");
                    orden = 0;
                    break;
                }
            }
            System.out.println("Esta ordenado de manera ascendente");
        } else {
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i] > A[i + 1]) {
                    orden = -1;
                } else {
                    orden = 0;
                }
            }

        }
    }


    public static void Ejercicio8() {
//8. Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer mediante el
//teclado 8 números. Después se debe pedir un número y una posición, insertarlo en la
//posición indicada, desplazando los que estén detrás.
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduzca 10 enteros:");
            array[i] = sc.nextInt();
        }
        System.out.println("Introduzca un numero:");
        int x = sc.nextInt();
        System.out.println("Introduzca una posicion:");
        int z = sc.nextInt();
        for (int i = array.length - 2; i >= z - 1; i--) {
            array[i + 1] = array[i];
        }
array [z - 1] = x;
System.out.println(Arrays.toString(array));
    }


    public static void Ejercicio9 (){
        //9.Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una posición hacia
        //abajo: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. El último pasa a
        //ser el primero.
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduzca 10 enteros:");
            array[i] = sc.nextInt();
        }
        int guardarValor = array[9];

        for (int i = array.length - 2; i >= 0; i--) {
            array [i + 1] = array[i];
        }
        array[0] = guardarValor;

        System.out.println(Arrays.toString(array));
// con int[] copia = array.clone(); clono un array (copia es el nombre del nuevo array y array es el nombre del array

    }

public static void Ejercicio10(){
        //10. Ídem, desplazar N posiciones (N es introducido por el usuario).
    int [] array = new int[10];
    int [] array2 = new int[10];
    int x = 0;
    for (int i = 0; i < array.length; i++) {
        System.out.println("Introduzca 10 enteros:");
        array[i] = sc.nextInt();
    }
    System.out.println("¿Cuantos puestos quieres desplazarlo?:");
    int desplazar = sc.nextInt();
    for (int i = 0; i < array.length; i++) {
        if ((i + desplazar) < array.length) {
        array2 [i + desplazar] = array [i];
    } else {
        array2 [x] = array [i];
        x++;
        }
    }
    System.out.println(Arrays.toString(array2));
}

public static void Ejercicio11(){
        //11. Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. Éstos
    //los guardaremos en una tabla de tamaño 10. Leer un número N, e insertarlo en el lugar
    //adecuado para que la tabla continúe ordenada.
    int [] array = new int[10];
    for (int i = 0; i < 5; i++) {
        System.out.println("Introduzca 5 enteros:");
        array[i] = sc.nextInt();
    }
    System.out.println("Introduzca otro numero:");
array[5] = sc.nextInt();
Arrays.sort(array);
System.out.println(Arrays.toString(array));



        }
    }
