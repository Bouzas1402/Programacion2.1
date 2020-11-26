import java.util.Scanner;

public class Condiconal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Importo el escanner y lo uso para pedir dos numero enteros en esta caso int*/
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Que operacion quiere realizar"); // le pido un valor para realizar una instrucción, lo estoy recogiendo en
        var operacion = sc.next();   //var por que admite varios tipos de datos
        switch (operacion) {
            case "-":
                System.out.println("La resta da:" + (num1 - num2)); //
                break;
            case "+":
                System.out.println("La suma da:" + (num1 + num2));
                break;
                case "*":
                    System.out.println("La multiplación da:" + (num1 * num2));
                    break;
            case "/":
                System.out.println("La division da:" + (num1 / num2));
                        break;
            default:   //Default da una instruccion para cada valor al que no le e asignado explicitamente una.
                System.out.println("opreacion incorrecta");
            break;
        }
        }
    }
