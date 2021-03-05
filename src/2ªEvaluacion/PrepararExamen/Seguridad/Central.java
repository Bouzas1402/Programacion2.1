package PrepararExamen.Seguridad;

import java.util.ArrayList;

public class Central extends Edificio {
    String ciudad;
    ArrayList<Edificio> edificios;
   //contructor
   public Central(String ciudad){
       this.ciudad = ciudad;
       ArrayList<Edificio> edificios = new ArrayList<>(); //creamos un array list en el constructor
       this.edificios = edificios; // le asignamos ese array list al atributo(tambien array list edificio)
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
                ", edificio=" + edificios +
                '}';
    }



    public void añadirEdificio(Edificio e){
this.edificios.add(e);
    }

    void quitarEdificio(int posicion){
       edificios.remove(posicion);
    }
   // mostrarEdificios(): void – Imprime “Edificios de la central <nombre_de_la_central>:”.
   // A continuación, recorre el ArrayList e imprime un listado de la forma: <dirección> -
   // <códigoPostal>
    void mostrarEdificios(){
        System.out.println("Edificios de la central " + ciudad + ":");
        for (int i = 0; i < edificios.size(); i++) {
            System.out.println((i+1) + "- " + edificios.get(i).direccion + " " + edificios.get(i).codigoPostal);
        }
    }

}
