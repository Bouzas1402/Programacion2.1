package POO.HerenciaConClasesAbstractas;

import java.util.ArrayList;

public class Rectangulo extends Figura2D {

    Punto p1;
    Punto p2;
    Punto p3;
    Punto p4;

    public Rectangulo(){
        super(4); //llamada al constructor de la superclase con los parametros necesarios
    }                   //al ser un rectangulo le uedo decir al cosntructor que los lados de esta figura van a ser cuatro

    public Rectangulo(Punto p1, Punto p2, Punto p3, Punto p4){
        super(4);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
    /* public Rectangulo(ArrayList<Punto> puntos){
        super(4);
        ArrayList<Punto> p = new Punto(puntos);
    } */
    /* public Rectangulo(ArrayList<Punto> puntos) {
        super(puntos);
    } */

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
