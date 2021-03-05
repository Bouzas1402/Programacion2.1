package POO.HerenciaConClasesAbstractas;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Punto punto1 = new Punto(3,3);
        Punto punto2 = new Punto(3,6);
        Punto punto3 = new Punto(6,3);
        Punto punto4 = new Punto(6,6);
        ArrayList<Punto> puntos = new ArrayList<>();
        puntos.add(punto1);
        puntos.add(punto2);
        puntos.add(punto3);
        puntos.add(punto4);
        System.out.println(puntos.toString());
        for (int i = 0; i < puntos.size(); i++) {
            System.out.println(puntos.get(i).toString());
        }
Linea linea1 = new Linea(punto1,punto2);
        Linea linea2 = new Linea(punto2,punto3);
        Linea linea3 = new Linea(punto3,punto4);
        Linea linea4 = new Linea(punto4,punto1);
        ArrayList<Linea> lineas = new ArrayList<>();
        lineas.add(linea1);
        lineas.add(linea2);
        lineas.add(linea3);
        lineas.add(linea4);
        for (int i = 0; i < lineas.size(); i++) {
            System.out.println(lineas.get(i).toString());
        lineas.get(i).dibujarLinea();
        }

    }
}
