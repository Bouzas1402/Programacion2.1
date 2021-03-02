package PrepararExamen.Seguridad;

public class Sensor {
 //modificardor de acceso por defecto (al no poner ninguno), no tendremos ningun problema para acceder dentro del mismo paquete.
     TipoAlerta.tipo tipo;
     boolean activado;
     String ubicacion;

     public Sensor(TipoAlerta.tipo tipo) {
this.tipo = tipo;
this.activado = false;
     }

     public void activar(){
         this.activado = true;
     }

     public void desactivar(){
         this.activado = false;
     }

    @Override
    public String toString() {
        return "Sensor{" +
                "tipo=" + tipo +
                ", activado=" + activado +
                ", ubicacion='" + ubicacion + '\'' +
                '}';
    }

    public String mostrarEstado(){
if (activado == true) {
         return "activado";
     } else {
return "desactivado";
}
     }

     public void ubicar(String ubicacion){
         this.ubicacion = ubicacion;
     }

}
