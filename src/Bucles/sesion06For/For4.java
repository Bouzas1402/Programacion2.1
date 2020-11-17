package Bucles.sesion06For;
import java.util.Scanner;
public class For4 {
    public static void mian(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Escriba un numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Escriba otro numero");
        int numero2 = sc.nextInt();
        if (numero1 < numero2) {
            for (i = numero1; i <= numero2; i++) {
                numero1++;
                System.out.println(numero1 + "+" + (numero1 + 1) + " = " + (numero1 + (numero1 + 1)));
            }
        } else {
                for (i = numero2; i <= numero1; i++) {
                    numero2++;
                    System.out.println(numero2 + "+" + (numero2 + 1) + " = " + (numero2 + (numero2 + 1)));
                }

                }
            }
        }
