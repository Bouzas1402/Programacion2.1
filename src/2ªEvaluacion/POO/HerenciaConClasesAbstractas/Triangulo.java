package POO.HerenciaConClasesAbstractas;

import java.util.ArrayList;

public class Triangulo extends Figura2D {
    Punto p1;
    Punto p2;
    Punto p3;

    public Triangulo() {
        super(3); //siempre tiene que aparecer y tiene que ir arriba.
    }

    public Triangulo(Punto p1, Punto p2, Punto p3){
        super(3); //siempre tiene que aparecer y tiene que ir arriba
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Triangulo(ArrayList<Punto> puntosT){
        super(3);
    this.p1 = puntosT.get(0);
    this.p2 = puntosT.get(1);
    this.p3 = puntosT.get(2);
    }


    @Override
    public String toString() {
        return "Triangulo{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                '}';
    }



    @Override
    ArrayList<Linea> crearLineas() {
        return null;
    }

    @Override
    double calcularPerimetro() {
        return 0;
    }

    @Override
    double calcularArea() {
        return 0;
    }
}
