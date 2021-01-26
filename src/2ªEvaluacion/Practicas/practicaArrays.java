package Practicas;
import java.util.Arrays;
import java.util.Scanner;
public class practicaArrays {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean control;
        boolean control1;
        do {
            control = false;
            System.out.println("¿Quieres jugar?:\nS/N");
            String siONo = sc.nextLine();
            if (siONo.equalsIgnoreCase("s")) {
                do {
                    control1 = false;
                    System.out.println("¿Quiere jugar con una baraja francesa o española?(marque el número que corresponda)\n1.Española\n2.Frances");
                    String francesaOEspanola = sc.nextLine();
                    if (francesaOEspanola.equals("1")) {
                        int[] barajaE1 = new int[40];
                        int[] barajaE2 = new int[40];
                        System.out.println("Vamos. Pulse enter para comenzar.");
                        sc.nextLine();
                        menu(barajaE1, barajaE2);
                    } else if (francesaOEspanola.equals("2")) {
                        int[] barajaF1 = new int[52];
                        int[] barajaF2 = new int[52];
                        System.out.println("Vamos. Pulse enter para comenzar.");
                        sc.nextLine();
                        menu(barajaF1, barajaF2);
                    } else {
                        System.out.println("Error.");
                        control1 = true;
                    }
                } while (control1);
            } else if (siONo.equalsIgnoreCase("n")) {
                System.out.println("Esta bien, muchas gracias.");
            } else {
                System.out.println("ERROR.");
                control = true;
            }
        } while(control);
    }
    public static int[] crearBaraja(int[] array) {
        int palos = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = palos;
            if (palos == (array.length / 4)) {
                palos = 0;
            }
            palos++;
        }
        return array;
    }
    public static int[] desordenarBaraja(int[] array) {
        /* Para desordenar la baraja voy a llenar un array del mismo tamaño con números aleatorios del 0 a la longitud del array -1
         * sin repetir esos números. Esos números representaran la nueva posición que van a ocupar las cartas en la baraja, es decir,
         * si x[0] toma valor de 12 significa que array[0] tomara la posición 12 en el array 'y', de esta manera le asigno una nueva
         * posición a cada carta de manera aleatoria.*/
        int[] x = new int[array.length];
        int[] y = new int[array.length];
        for (int i = 0; i < x.length; i++) {               //formo el array con números aleatorios al azar.
            x[i] = (int) (Math.random() * (array.length));
        }
        // El doble bucle hace que se vayan sustituyendo todos los valores repetidos por unos nuevos.
        for (int i = 0; i < x.length; i++) {              //Compararemos cada posición de x con las otras posiciones de x para que si
            for (int j = 0; j < x.length; j++) {         // hay algún valor repetido en posiciones distintas se le asigne un nuevo valor
                if ((x[i] == x[j]) && (i != j)) {         // a esa posición.
                    x[i] = (int) (Math.random() * (array.length));
                    i = 0;          // reiniciamos i si encontramos un valor repetido para asegurarnos que el nuevo valor no esté también repetido.
                }
            }
        }
        for (int i = 0; i < x.length; i++) {
            int z = x[i];     // Recogemos el valor de x en la posicion de i
            y[z] = array[i];  // Mandamos la carta en la posicion 'i' al lugar de 'y' que 'x' le ha asignado
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
            sc.nextLine();
        }
        if (contadorJugador1 > contadorJugador2) {
            System.out.println("El jugador 1 ha ganado con " + contadorJugador1 + " puntos. Felicidades.");
        } else if (contadorJugador1 < contadorJugador2) {
            System.out.println("El jugador 2 ha ganado con " + contadorJugador2 + " puntos. Felicidades.");
        } else {
            System.out.println("Habeis quedado empate con " + contadorJugador1 + " puntos.");
        }
    }
    public static void menu(int[] array1,int[] array2){
        boolean repetir;
        boolean repetir1;
        do {
            repetir = true;
            juego(desordenarBaraja(crearBaraja(array1)),desordenarBaraja(crearBaraja(array2)));
            do {
                repetir1 = true;
                System.out.println("¿Quieres jugar otra vez?:\nS/N");
                String siONo = sc.nextLine();
                if (siONo.equalsIgnoreCase("n")){
                    System.out.println("Gracias por jugar.");
                    repetir1 = false;
                    repetir = false;
                } else if (siONo.equalsIgnoreCase("s")) {
                    repetir1 = false;
                    System.out.println("Vamos. Pulse enter para comenzar.");
                    sc.nextLine();
                } else {
                    System.out.println("ERROR.");
                }
            } while (repetir1);
        } while (repetir);
    }
}