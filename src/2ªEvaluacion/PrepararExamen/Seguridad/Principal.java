package PrepararExamen.Seguridad;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Sensor sensor1 = new Sensor(TipoAlerta.INCENDIO);
        System.out.println("Estado del sendor: " + sensor1.mostrarEstado());
        sensor1.activar();
        System.out.println("Estado del sendor: " + sensor1.mostrarEstado());
        sensor1.ubicar("Entrada");
        System.out.println(sensor1.toString());
        System.out.println("Ubicacion del sendor: " + sensor1.ubicacion); //podemos acceder al atributo ubicacion por que no esta en private, si no necesitariamos un get


   //PRUEBAS CLASE ALARMA

        Alarma alarma1 = new Alarma(TipoAlerta.ROBO);
        System.out.println(alarma1.toString());
alarma1.añadirSensor(TipoAlerta.ROBO);
        System.out.println(alarma1.toString());
        alarma1.sonar(alarma1.sensores.get(0));
        alarma1.sensores.get(0).activar();
        System.out.println(alarma1.sensores.get(0).mostrarEstado());
alarma1.mostrarSensores();
    alarma1.sensores.get(0).activar();
    System.out.println("Hacemos sonar la alarma");
alarma1.sonar(sensor1);

//Vamoa a crear un edificio pedido por teclado
        Scanner sc =new Scanner(System.in);
       /* System.out.println("Direccion del edificio a crear:");
        String d = sc.nextLine();
        System.out.println("Que codigo postal tiene el edificio a crear:");
        Integer cp = sc.nextInt();
        sc.nextLine(); //liberar el escaner al introducir un int
        Edificio edificio1 = new Edificio(d,cp); */
        Edificio edificio2 = new Edificio("Fernandez llamazares 14", 28045);
        // System.out.println(edificio1.toString());
        System.out.println(edificio2.toString());

        Alarma alarma2 = edificio2.crearAlarma(TipoAlerta.INCENDIO);
        edificio2.añadirAlarma(alarma2);
        System.out.println(edificio2.toString());

        edificio2.quitarAlarma(0);
        System.out.println(edificio2.toString());

    }
}
