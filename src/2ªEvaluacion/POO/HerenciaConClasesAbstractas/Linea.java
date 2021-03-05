package POO.HerenciaConClasesAbstractas;

import javax.sound.sampled.Line;

public class Linea {

    final int DIMENSIONES = 1;
    Punto puntoInicio;
    Punto puntoFin;

    public Linea(Punto p1, Punto p2){
        this.puntoInicio = p1;
        this.puntoFin = p2;
    }

    public double calcularLongitud(){
   //     double longitud = Math.sqrt(Math.pow(puntoInicio.x - puntoFin.x,2) + Math.pow(puntoInicio.y - puntoFin.y,2));
        // esta es otra manera de ponerlo, mas corta, aunq se ve peor para el estudio
       return (Math.sqrt(Math.pow(puntoInicio.x - puntoFin.x,2) + Math.pow(puntoInicio.y - puntoFin.y,2)));
// return longitud;
    }

    @Override
    public String toString() {
        return "Linea{" +
                "puntoInicio=" + puntoInicio +
                ", puntoFin=" + puntoFin +
                '}' + "Longitud = " + calcularLongitud();
    }

    public void dibujarLinea(){
        // Se podria pedir un if para dibujar horizontal o vertical
        // int l = (int) calcularLongitud();
        //for (int i = 0; i < l; i++) {
         // System.out.print("-");
        // }
        for (int i = 0; i < (int)calcularLongitud(); i++) {
            System.out.print("-");

        } System.out.println();
    }

}
