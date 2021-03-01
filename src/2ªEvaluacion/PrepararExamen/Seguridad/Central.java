package PrepararExamen.Seguridad;

import java.util.ArrayList;

public class Central {
    private String ciudad;
   private ArrayList<Edificio> edificio;
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
    public String toString(){
        return "Este usuario tiene los atributos con estos valores{" +
                "ciudad ='" + this.ciudad;
    }

    public void añadirEdificio(){

    }
}
