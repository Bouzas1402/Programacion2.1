package Sesion04;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) { //Importado el escaner pido dos valores, en este caso float porque quiero
        Scanner sc = new Scanner(System.in); // hacer operaciones con numeros y quiero que opere con decimales.
        System.out.println("Introduzca el primer número:");
        float num1 = sc.nextFloat();
        System.out.println("Introduzca el segundo número:");
        float num2 = sc.nextFloat();
        System.out.println("¿Qué operación quiere realizar?:"); // Nombro otra variable, esta vez string porque quiero
        String operacion = sc.next();// darle instrucciones segun el caracter recogido de este tipo.
        // Con Swicht enumero las distintos casos que quiero recoger y les mando una instruccion
        switch (operacion) { //para casa caso recogido en la variable string.
            case "+": // Como ejemplo, en caso de que la variable string sea + el programa realiza la operacion
                System.out.println("El resultado es: " + (num1 + num2));// de suma de la primera variable float pedida mas la segunda variable float pedida.
                break; // Con break le digo al programa que pare en caso de que se de el string correcto para el caso.
            case "-":
                System.out.println("El resultado es: " + (num1 - num2));
                break;
            case "*":
                System.out.println("El resultado es: " + (num1 * num2));
                break;
            case "/":
                System.out.println("El resultado es: " + (num1 / num2) + " - El resto es: " + (num1 % num2));
                break;
            default:
                System.out.println("No se ha reconocido la operación que quiere realizar, prueba de nuevo con " +
                        "+ (suma), - (resta), / (división), * (multiplicación), % (resto)"); /* Default de una
                        instruccion para todas las variables no recogidas en los casos enumerados en Switch */
        }
    }
}
