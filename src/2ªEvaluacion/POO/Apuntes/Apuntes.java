package POO.Apuntes;

import java.util.Scanner;

public class Apuntes {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args){
int racion = contarSemillas(950,3);
System.out.println(racion);

    }

    public static int conviertDoubleAInt(double decimal) {
        return (int) decimal; //devolver un valor no es imprimir un valor
    }

    private static void imprimeNumero(int i) {
        System.out.println(i);

    }
    //ejemplo, un método que calcule la ración de semillas que hay que dar a un loro en función de su
    //edad podría declararse así:
    public static int contarSemillas (int pesoLoro, int edadLoro) {
    int semillas = pesoLoro / 5 + edadLoro;
    return semillas;
      //  return pesoLoro / 5 + edadLoro; // esto es otra manera
    }
//Los metodos pueden ser de instancia o estaticos(static), los de instancia solo funcionan si se lo aprimas a una instancia
    //
}
