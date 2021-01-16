package String;
import java.util.Scanner;
import java.lang.String;
public class prueba {
    public static void main(String[] args){
       menu();
    }
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        boolean repeticion = true;
       do {
           System.out.println("¿Qué ejercicio desea hacer?:\n2.Valor de str:\n3.Reemplazar caracteres:\4Comprobar si termina con...:\n5.Comprobar si comienza con... ignorando mayusculas y minusculas:\n6.Comparar cadenas ignorando los espacios en blanco:\n7.Extraer una subcadena:");
           int ejercicio = sc.nextInt();
           switch (ejercicio) {
               case 2:
                   ejercicioPrueba2();
                   break;
               case 3:
                   ejercicioPrueba3();
                   break;
               case 4:
                   ejercicioPrueba4();
                   break;
               case 5:
                   ejercicioPrueba5();
                   break;
               case 6:
                   ejercicioPrueba6();
                   break;
               case 7:
                   ejercicioPrueba7();
                   break;
               case 0:
                   System.out.println("Gracias");
                   repeticion = false;
                   break;
               default:
                   System.out.println("Opción no valida, marque otro numero.");
           }
       } while (repeticion);
    }
    public static void ejercicioPrueba2() {
/*¿Qué valor tendrá la variable str despues de ejecutar el siguiente código?
String str = "a simple string";
str = str.replace("a", "A SIMPLE").substring(2, 8);*/
        String str = "a simple string";
        str = str.replace("a", "A SIMPLE").substring(2, 8);
System.out.println(str);
    }
public static void ejercicioPrueba3() {
        /* Reemplazar caracteres: escribe un programa que lea una cadena de texto y reemplace todas
las ocurrencias de la letra ‘a’ con la letra ‘b’. A continuación debe imprimir la cadena
resultante. */
String cadena = "a";
cadena = cadena.replace("a", "b");
System.out.println(cadena);
}
public static void ejercicioPrueba4() {
        /* Comprobar si termina con...: escribe un programa que lea el nombre de una ciudad y
compruebe si el nombre termina con “burgo”. El programa debe imprimir true o false. */
    Scanner sc = new Scanner(System.in);
System.out.println("Introduzca el nombre de una ciudad:");
String ciudad = sc.next();
boolean terminoCiudad = ciudad.endsWith("burgo");
System.out.println(terminoCiudad);
}

public static void ejercicioPrueba5(){
        /* Comprobar si comienza con... ignorando mayúsculas y minúsculas: escribe un programa
que compruebe si una cadena dada comienza por “J”, sin que tenga en cuenta si está en
mayúsculas o minúsculas. El programa debe imprimir true o false. */
    Scanner sc = new Scanner(System.in);
    System.out.println("Escriba una cadena de texto:");
    String cadena = sc.next();
System.out.println((String.valueOf(cadena.charAt(0))).equalsIgnoreCase("j"));
    }
    public static void ejercicioPrueba6() {
/*Comparar cadenas ignorando los espacios en blanco: escribe un programa que lea dos
cadenas y las compare sin tener en cuenta los espacios en blanco. El programa debería
imprimir true si son iguales, false en caso contrario.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una cadena de texto:");
        String cadena1 = sc.nextLine();
        System.out.println("Escriba una cadena de texto:");
        String cadena2 = sc.nextLine();
        String cadena1SinEspacios = cadena1.replace(" ","");
        String cadena2SinEspacios = cadena2.replace(" ","");
        System.out.println(cadena1SinEspacios.equals(cadena2SinEspacios));
    }
    public static void ejercicioPrueba7 () {
        /*Extraer una subcadena: escribe un programa que lea una cadena y dos números enteros
para indicar los límites inferior y superior respectivamente de un rango dentro de las
posiciones de los caracteres de la cadena. Imprime la subcadena indicada por el rango: a)
suponiendo que ambos números siempres son mayores o iguales a 0 y menores que la
longitud de la cadena; b) Validando que sucede a).*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto:");
        String cadena = sc.nextLine();
        int longitud = cadena.length();
        System.out.println("Introduce un valor entre 0 y " + longitud + "(incluidos)");
        int num1 = sc.nextInt();
        System.out.println("Introduce un valor entre 0 y " + longitud + "(incluidos)");
int num2 = sc.nextInt();
sc.nextLine();
cadena = cadena.substring(num1,num2);
System.out.println(cadena);
    }
}


