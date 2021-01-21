package Practicas;
import java.util.Scanner;
public class practicaArrays {
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] baraja1 = new int[40];
        int[] baraja2 = new int[40];
        boolean jugar = false;
        System.out.println("¿Quieres jugar?:\nS/N");
        String siONo = sc.nextLine();
        if (siONo.equalsIgnoreCase("s")){
            jugar = true;
            System.out.println("Vamos. Pulse enter para comenzar.");
            String comenzar2 = sc.nextLine();
        } else {
            System.out.println("Esta bien, muchas gracias.");
        }
while (jugar) {
    int [] barajaLlena1 = crearBaraja(baraja1);
    int [] barajaLlena2 = crearBaraja(baraja2);
            int [] baraja1Barajeada = desordenarBaraja(barajaLlena1);
    int [] baraja2Barajeada = desordenarBaraja(barajaLlena2);
juego(baraja1Barajeada,baraja2Barajeada);
System.out.println("¿Quieres seguir jugando?:\nS/N");
String siONo2 = sc.nextLine();
if (siONo2.equalsIgnoreCase("n")){
    System.out.println("Gracias por jugar.");
    jugar = false;
} else {
    System.out.println("Vamos. Pulse enter para comenzar.");
    String comenzar2 = sc.nextLine();
}
}
    }
    public static int[] crearBaraja(int[] array) {
        int palos = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = palos;
            if (palos == 10) {
                palos = 0;
            }
            palos++;
        }
        return array;
    }
    public static int[] desordenarBaraja(int[] array) {

        int[] x = new int[40];
        int[] y = new int[40];
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * 40);
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if ((x[i] == x[j]) && (i != j)) {
                    x[i] = (int) (Math.random() * 40);
                    i = 0;
                }
            }
        }
        for (int i = 0; i < x.length; i++) {
            int z = x[i];
            y[i] = array[z];
        }
        return y;
    }
    public static void juego(int[] array1, int[] array2) {
        int contadorJugador1 = 0;
        int contadorJugador2 = 0;
        int contadorEmpates = 0;
            for (int i = 0; i < array1.length; i++) {
                System.out.println("Jugada numero " + (i + 1) + ":\n=================\nJugador 1:  Jugador2:");
                if (array1[i] > array2[i]) {
                    contadorJugador1++;
System.out.println("      " + array1[i] + "    >    " + array2[i]);
System.out.println("Puntos jugador uno : " + contadorJugador1 + "\nPuntos jugador dos: " + contadorJugador2 + "\nEmpates: " + contadorEmpates);
                } else if (array1[i] < array2[i]) {
                    contadorJugador2++;
                    System.out.println("      " + array1[i] + "    <    " + array2[i]);
                    System.out.println("Puntos jugador uno : " + contadorJugador1 + "\nPuntos jugador dos: " + contadorJugador2 + "\nEmpates: " + contadorEmpates);
                } else {
                    contadorEmpates++;
                    System.out.println("      " + array1[i] + "    =    " + array2[i]);
                    System.out.println("Puntos jugador uno : " + contadorJugador1 + "\nPuntos jugador dos: " + contadorJugador2 + "\nEmpates: " + contadorEmpates);
                }
                System.out.println("Pulse enter para seguir");
                String pausa = sc.nextLine();
            }
            if (contadorJugador1 > contadorJugador2) {
                System.out.println("El jugador 1 ha ganado con " + contadorJugador1 + " puntos. Felicidades.");
            } else if (contadorJugador1 < contadorJugador2) {
                System.out.println("El jugador 2 ha ganado con " + contadorJugador2 + " puntos. Felicidades.");
            } else {
                System.out.println("Habeis quedado empate con " + contadorJugador1 + " puntos.");
            }
    }
}