package Bucles.sesion06For;

import java.util.Scanner;

public class For4enclase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        System.out.println("Escriba un numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Escriba otro numero");
        int numero2 = sc.nextInt();
        if (numero1 < numero2) {
            for (int i = numero1; i <= numero2; i++) {
                suma = suma + i;
            }

        } else {
                for (int i = numero2; i <= numero1; i++){
                    suma = suma + i;
                }
            }
            System.out.println(suma);
        }
    }
