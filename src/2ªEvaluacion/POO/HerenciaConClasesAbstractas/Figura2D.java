package POO.HerenciaConClasesAbstractas;

import java.util.ArrayList;

abstract class Figura2D {
    int lados;
    final int DIMENSIONES = 2; // constante

    public Figura2D(int lados) {
        this.lados = lados;
    }
    //metodo abstracto


    public String nombreFigura(){
        if(lados == 3){
            return "Triangulo";
        } else {
           return "Rectangulo";
        }
    }

    abstract ArrayList<Linea> crearLineas();

    abstract double calcularPerimetro();

    abstract double calcularArea();
}
