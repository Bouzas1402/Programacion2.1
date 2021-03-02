package PrepararExamen.Seguridad;

import java.util.ArrayList;

public class Central {
    String ciudad;
    ArrayList<Edificio> edificio;
   //contructor
   public Central(String ciudad){
       this.ciudad = ciudad;
   }
//Geters y Seters


    public String getCiudad() {
       return this.ciudad;
    }
    public void setCiudad(String ciudad) {
       this.ciudad = ciudad;
    }
    //toString
    @Override
    public String toString() {
        return "Central{" +
                "ciudad='" + ciudad + '\'' +
                ", edificio=" + edificio +
                '}';
    }



    public void añadirEdificio(){

    }
}
