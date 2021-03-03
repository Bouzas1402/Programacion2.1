package PrepararExamen.Seguridad;
import java.util.ArrayList;
public class Edificio {

    private String direccion;
    private Integer codigoPostal;
    ArrayList<Alarma> alarmas;

    public Edificio(String direccion, Integer codigoPostal){
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        //creamos en el constructor el arraylist pero esta vacio
        ArrayList<Alarma> alarmas = new ArrayList<>();
        this.alarmas = alarmas;
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
    public Alarma crearAlarma (TipoAlerta tipo){
        Alarma a = new Alarma(tipo);
        return a;
    }
//añadirAlarma(Alarma alarma): void – añade la alarma recibida al ArrayList de alarmas
    public void añadirAlarma(Alarma a){
        this.alarmas.add(a);
    }

    //quitarAlarma(int pos): void – quita la alarma de la posición indicada del ArrayList de
    //alarmas

    public void quitarAlarma (int pos){
        this.alarmas.remove(pos);
    }

    //mostrarAlarmas(): void – imprime una frase: “las alarmas instaladas en este edificio
    //son: “, y a continuación recorre el ArrayList de alarmas.

    public void mostrarAlarmas(){
        System.out.println("Las alarmas instaladas en este edificio son:");
        for (int i = 0; i < alarmas.size(); i++) {
            // System.out.println((i+1) + alarmas.get(i).tipo);
        }
    }

}
