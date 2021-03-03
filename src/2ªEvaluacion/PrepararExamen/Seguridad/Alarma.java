package PrepararExamen.Seguridad;
import java.util.ArrayList;

public class Alarma {
    TipoAlerta tipo;
ArrayList<Sensor> sensores;

    public Alarma(TipoAlerta tipo) {
        this.tipo = tipo;
        ArrayList<Sensor> sensores = new ArrayList<>();
        this.sensores = sensores;
    }

    @Override
    public String toString() {
        return "Alarma{" +
                "tipo=" + tipo +
                ", sensores=" + sensores +
                '}';
    }

    public void sonar(Sensor sensor){
        if (sensor.activado == true) {
            if (sensor.tipo == TipoAlerta.INCENDIO){
                System.out.println("Avisar bomberos y policia");

            } else {
                System.out.println("Avisar policia");
            }
        }
    }

    public void añadirSensor(TipoAlerta tipo){
        Sensor s = new Sensor(tipo);
        this.sensores.add(s);
    }

    public void quitarSensores(int posicion) {
        sensores.remove(posicion);
    }

    public void mostrarSensores(){
        System.out.println("Esta alarme esta coenctada con los siguientes sensores: ");
        for (int i = 0; i < sensores.size(); i++){
            System.out.println((i+1) + " - " + sensores.get(i).tipo + " - " + sensores.get(i).mostrarEstado());
        }
    }

}
