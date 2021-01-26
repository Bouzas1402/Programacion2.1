package POO.Apuntes.ApuntesClases;

public class Robot {
    String nombre;
    String modelo;
    //atributos: nombre,modelo

    /* Constructor sin parametros:
    nombre <- "Anonimo"
    modelo <- "Desconocido"
    * */
    public Robot(){
        this.nombre = "Anonimo";
        this.modelo = "Desconocido";
    }
    public Robot (String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
    }


    // Constructor con dos parametros

    //main crear dos robots:
    //uno, anonimo
    // wall_e, DM224
    //y visualizarlos
}
