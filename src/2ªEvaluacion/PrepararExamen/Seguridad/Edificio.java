package PrepararExamen.Seguridad;
import java.util.ArrayList;
public class Edificio {
    /**
     * Clase edificio que crea edificios para el paquete Seguridad
     * @eutor Carlos Bouzas
     * @version Seguridad 2.0.0
     *
     *
     */
     String direccion;
     Integer codigoPostal;
    ArrayList<Alarma> alarmas;

    /**
     * Constructor de la clase Edificio, pide dos datos y genera un ArrayList de tipo alarma
     * @param direccion es un String que asigna un valor al atributo direccion
     * @param codigoPostal es un Integer que asigna un valor al atributo codigoPostal
     * @since Seguridad 1.0.0
     */
    public Edificio(String direccion, Integer codigoPostal){
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        //creamos en el constructor el arraylist pero esta vacio
        ArrayList<Alarma> alarmas = new ArrayList<>();
        this.alarmas = alarmas;
    }

    public Edificio() {
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "direccion='" + direccion + '\'' +
                ", codigoPostal=" + codigoPostal +
                ", alarmas=" + alarmas +
                '}';
    }
//crearAlarma(TipoAlerta): Alarma - Instancia una alarma y la devuelve.

    /**
     * Metodo que recibe un TipoAlerta y se lo asigna a una Alarma
     * @param tipo  de tipoAlerta
     * @return una Alarma con valor del tipoAlerta introducido
     * @since Seguridad 1.2.0
     */
    public Alarma crearAlarma (TipoAlerta tipo){
        Alarma a = new Alarma(tipo);
        return a;
    }
//añadirAlarma(Alarma alarma): void – añade la alarma recibida al ArrayList de alarmas

    /**
     * El metodo recibe una Alarma y la introduce en el ArrayList alarmas
     * @param a de tipo Alarma
     * @since Seguridad 1.1.2
     */
    public void añadirAlarma(Alarma a){
        this.alarmas.add(a);
    }

    //quitarAlarma(int pos): void – quita la alarma de la posición indicada del ArrayList de
    //alarmas

    /**
     * Este metodo recoge un int que nos dira que posición del ArrayList alarmas debo borrar
     * @param pos recibe un int que representa una pisición de un ArraList alarmas
     * @since Seguridad 1.2.0
     */
    public void quitarAlarma (int pos){
        this.alarmas.remove(pos);
    }

    //mostrarAlarmas(): void – imprime una frase: “las alarmas instaladas en este edificio
    //son: “, y a continuación recorre el ArrayList de alarmas.

    /**
     * Este metodo muestra las alarmas que hay en un Arraylist alarmas
     * @since Seguridad 2.0.0
     */
    public void mostrarAlarmas(){
        System.out.println("Las alarmas instaladas en este edificio son:");
        for (int i = 0; i < alarmas.size(); i++) {
             System.out.println((i+1) + "-" + alarmas.get(i).tipo);
        }
    }

}
