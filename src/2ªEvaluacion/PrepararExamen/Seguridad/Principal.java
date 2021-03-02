package PrepararExamen.Seguridad;

public class Principal {
    public static void main(String[] args) {
        Sensor sensor1 = new Sensor(TipoAlerta.tipo.INCENDIO);
        System.out.println("Estado del sendor: " + sensor1.mostrarEstado());
        sensor1.activar();
        System.out.println("Estado del sendor: " + sensor1.mostrarEstado());
        sensor1.ubicar("Entrada");
        System.out.println(sensor1.toString());
        System.out.println("Ubicacion del sendor: " + sensor1.ubicacion); //podemos acceder al atributo ubicacion por que no esta en private, si no necesitariamos un get


   //PRUEBAS CLASE ALARMA

        Alarma alarma1 = new Alarma(TipoAlerta.tipo.ROBO);
        System.out.println(alarma1.toString());
alarma1.añadirSensor(TipoAlerta.tipo.ROBO);
        System.out.println(alarma1.toString());
        alarma1.sonar(alarma1.sensores.get(0));
        alarma1.sensores.get(0).activar();
        System.out.println(alarma1.sensores.get(0).mostrarEstado());
alarma1.mostrarSensores();
    alarma1.sensores.get(0).activar();
    System.out.println("Hacemos sonar la alarma");
alarma1.sonar(sensor1);
    }
}
